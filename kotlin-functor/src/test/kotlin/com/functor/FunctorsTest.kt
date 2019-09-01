package com.functor

import com.functor.Result.Some
import org.junit.Assert.assertEquals
import org.junit.Test
class FunctorsTest {

    fun sumTwo ( a: Int): Int = a + 2

    fun inc(value: Int): Int = value + 1

    @Test
    fun `testSum1tosum2`() {
        assertEquals(3, sumTwo(1))
    }

    @Test
    fun `testSum1tosum2UsingFunctor`() {
        assertEquals(Some(5), Some(2).map { x -> x + 3 })
    }


    @Test
    fun `testFunctor`() {
        assertEquals(Functor(2), Functor(1).map(::inc))
    }

    fun curriedAddition(a: Int) = { b: Int ->
        a + b
    }

    @Test
    fun `test curring`() {
        Some(3) map { x -> x + 1} map { x -> x+1} map :: curriedAddition
    }

}

