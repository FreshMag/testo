package io.github.gciatto

import java.util.LinkedList

/**
 * A double-ended queue.
 */
actual fun <T> dequeOf(vararg items: T): Dequeue<T> = dequeOf(items.asIterable())

/**
 * A double-ended queue.
 */
actual fun <T> dequeOf(items: Iterable<T>): Dequeue<T> =
    LinkedList<T>().also {
        for (item in items) {
            it.add(item)
        }
    }

/**
 * A double-ended queue.
 */
actual fun <T> dequeOf(items: Sequence<T>): Dequeue<T> = items.toCollection(LinkedList())

// actual fun <T> Dequeue<T>.addFirst(item: T) {
//    if (this is LinkedList) {
//        this.addFirst(item)
//    } else {
//        this.add(0, item)
//    }
// }

// actual fun <T> Dequeue<T>.addFirst(items: Iterable<T>) {
//    val i = listIterator()
//    for (item in items) {
//        i.add(item)
//    }
// }
//
// actual fun <T> Dequeue<T>.addFirst(items: Sequence<T>) {
//    addFirst(items.asIterable())
// }

/**
 * Takes the first element from the queue.
 */
actual fun <T> Dequeue<T>.takeFirst(): T? {
    if (isEmpty()) return null
    return if (this is LinkedList) {
        this.pop()
    } else {
        val first = get(0)
        removeAt(0)
        first
    }
}
