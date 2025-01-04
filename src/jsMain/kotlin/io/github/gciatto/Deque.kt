package io.github.gciatto

/**
 * A double-ended queue.
 */
actual fun <T> dequeOf(vararg items: T): Dequeue<T> = mutableListOf(*items)

/**
 * A double-ended queue.
 */
actual fun <T> dequeOf(items: Iterable<T>): Dequeue<T> =
    mutableListOf<T>().also {
        it.addAll(items)
    }

/**
 * A double-ended queue.
 */
actual fun <T> dequeOf(items: Sequence<T>): Dequeue<T> = items.toMutableList()

// actual fun <T> Dequeue<T>.addFirst(item: T) {
//     this.add(0, item)
// }

// actual fun <T> Dequeue<T>.addFirst(items: Iterable<T>) {
//     val i = listIterator()
//     for (item in items) {
//         i.add(item)
//     }
// }
//
// actual fun <T> Dequeue<T>.addFirst(items: Sequence<T>) {
//     addFirst(items.asIterable())
// }

/**
 * Takes the first element from the queue.
 */
actual fun <T> Dequeue<T>.takeFirst(): T? {
    if (isEmpty()) return null
    val first = get(0)
    this.removeAt(0)
    return first
}
