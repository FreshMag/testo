package io.github.gciatto

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
    val debug = Debug()
    debug.print()
}
