package io.github.gciatto

import io.github.testo.parsers.generated.ExpressionLexer
import io.github.testo.parsers.generated.ExpressionParser
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.antlr.v4.kotlinruntime.CharStreams
import org.antlr.v4.kotlinruntime.CommonTokenStream

class TestAntlr : StringSpec({

    "Simple ANTLR usage" {
        val stream = CharStreams.fromString("test1 + test2")
        val lexer = ExpressionLexer(stream)
        val tokens = CommonTokenStream(lexer)
        val parser = ExpressionParser(tokens)
        parser.expression()
        parser.numberOfSyntaxErrors shouldBe 0
    }

    "ANTLR parsing error with integer" {
        val stream = CharStreams.fromString("test1 + 2")
        val lexer = ExpressionLexer(stream)
        val tokens = CommonTokenStream(lexer)
        val parser = ExpressionParser(tokens)
        parser.expression()
        parser.numberOfSyntaxErrors shouldBe 1
    }
})
