package io.github.gciatto

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.types.shouldBeInstanceOf

class TestDequeue :
    StringSpec({

        "A deque should be created from literals" {
            dequeOf(1, 2, 3).shouldBeInstanceOf<Dequeue<Int>>()
        }

        "A deque should be created from a set of literals" {
            dequeOf(setOf(1, 2, 3)).shouldBeInstanceOf<Dequeue<Int>>()
        }

        "A deque should be created from a sequence of literals" {
            dequeOf(sequenceOf(1, 2, 3)).shouldBeInstanceOf<Dequeue<Int>>()
        }

        "A deque should correctly be expanded by calling add" {
            dequeOf(1, 2, 3).also { it.add(4) } shouldBe dequeOf(1, 2, 3, 4)
        }

//    @Test
//    fun testPrepend() {
//        assertEquals(
//            expected = dequeOf(0, 1, 2, 3),
//            actual = dequeOf(1, 2, 3).also { it.addFirst(0) }
//        )
//    }
    })
