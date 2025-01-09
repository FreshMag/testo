@file:JvmName("Deque")
@file:JsExport

package io.github.gciatto

import kotlin.js.JsExport
import kotlin.jvm.JvmName

// Simple typealias for a simple deque type that is mutable and can be used as a list as well. Cool!
typealias Dequeue<T> = MutableList<T>

/**
 * Creates a double-ended queue from the given items.
 */
expect fun <T> dequeOf(vararg items: T): Dequeue<T>

/**
 * Creates a double-ended queue from the given items.
 */
expect fun <T> dequeOf(items: Iterable<T>): Dequeue<T>

/**
 * Creates a double-ended queue from the given items.
 */
expect fun <T> dequeOf(items: Sequence<T>): Dequeue<T>

// expect fun <T> Dequeue<T>.addFirst(item: T)

// expect fun <T> Dequeue<T>.addFirst(items: Iterable<T>)
//
// expect fun <T> Dequeue<T>.addFirst(items: Sequence<T>)

/**
 * Takes the first element from the queue.
 */
expect fun <T> Dequeue<T>.takeFirst(): T?
