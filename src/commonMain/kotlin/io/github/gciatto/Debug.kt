@file:OptIn(ExperimentalJsExport::class)

package io.github.gciatto

import io.github.testo.parsers.generated.ExpressionLexer
import io.github.testo.parsers.generated.ExpressionParser
import net.mamoe.yamlkt.Yaml
import org.antlr.v4.kotlinruntime.CharStreams
import org.antlr.v4.kotlinruntime.CommonTokenStream
import kotlin.js.ExperimentalJsExport
import kotlin.js.JsExport

/**
 * A simple debug class.
 */
class Debug {
    /**
     * Prints a message.
     */
    fun print() {
        println("Hello, world! This is Testo!")
    }
}

/**
 * Simple main function to reference Debug class to avoid DCE.
 */
fun main() {
    println("You just used 'require' to load the `testo` module!")
}

/**
 * Debug function to parse a YAML string.
 */
@JsExport
fun debug(yaml: String): Map<String?, Any?> = Yaml.decodeMapFromString(yaml)

/**
 * Debug function to parse an expression.
 */
@JsExport
fun parseExpression(expression: String) {
    val stream = CharStreams.fromString(expression)
    val lexemes = ExpressionLexer(stream)
    val tokens = CommonTokenStream(lexemes)
    val parser = ExpressionParser(tokens)
    LoggingExpressionVisitor().visit(parser.expression())
}
