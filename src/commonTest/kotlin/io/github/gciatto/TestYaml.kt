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
})
