package io.github.gciatto

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import kotlinx.serialization.Serializable
import net.mamoe.yamlkt.Yaml

class TestYaml : StringSpec({

    "Simple YAML string" {
        @Serializable
        data class Person(
            val name: String,
            val age: Int,
            val city: String,
        )

        val yaml =
            """
            name: John Doe
            age: 30
            city: New York
            """.trimIndent()

        val person: Person = Yaml.decodeFromString(Person.serializer(), yaml)
        person.name shouldBe "John Doe"
        person.age shouldBe 30
        person.city shouldBe "New York"
    }

    "Simple YAML string with optional parameters" {
        @Serializable
        data class Person(
            val name: String,
            val age: Int,
            val city: String? = null,
        )

        val yaml =
            """
            name: John Doe
            age: 30
            """.trimIndent()

        val person: Person = Yaml.decodeFromString(Person.serializer(), yaml)
        person.name shouldBe "John Doe"
        person.age shouldBe 30
        person.city shouldBe null
    }

    "YAML with arrays" {
        @Serializable
        data class Person(
            val name: String,
            val telephones: List<String>,
        )

        val yaml =
            """
            name: John Doe
            telephones:
              - 123456
              - 789012
            """.trimIndent()

        val person: Person = Yaml.decodeFromString(Person.serializer(), yaml)
        person.name shouldBe "John Doe"
        person.telephones shouldBe listOf("123456", "789012")
    }

    "YAML arrays with single object" {
        val yaml =
            """
            name: John Doe
            telephones: "123456"
            """.trimIndent()

        val person: Map<String?, Any?> = Yaml.decodeMapFromString(yaml)
        person["name"] shouldBe "John Doe"
        person["telephones"] shouldBe "123456"

        val yaml2 =
            """
            name: John Doe
            telephones: 
                - "123456"
                - "789012"
            """.trimIndent()
        val person2: Map<String?, Any?> = Yaml.decodeMapFromString(yaml2)
        person2["name"] shouldBe "John Doe"
        println(person2["telephones"])
        person2["telephones"] shouldBe listOf("123456", "789012")
    }
})
