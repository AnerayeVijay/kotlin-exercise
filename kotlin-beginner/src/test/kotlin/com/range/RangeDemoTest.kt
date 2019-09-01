package com.range

import org.junit.Assert.assertTrue
import org.junit.Assert.assertFalse
import org.junit.Assert.assertEquals
import org.junit.Test

class RangeDemoTest {
    @Test
    fun `check if C  is present in AtoZ range`() {
        val isTrue = "C" in AtoZ
        assertTrue(isTrue)
    }

    @Test
    fun ` 11 should not in 1 to 10 range`() {
        val isTrue = 11 in oneToTen
        assertFalse(isTrue)
    }

    @Test
    fun ` first element is 100 in countingDown100ToZeo`() {
        val countDownLatch = countingDown100ToZeo
        assertEquals(100,countDownLatch.first )
    }

    @Test
    fun ` last element is 0 in countingDown100ToZeo`() {
        val countDownLatch = countingDown100ToZeo
        assertEquals(0,countDownLatch.last )
    }


    @Test
    fun ` Always give me odd number with oddNumbers`() {
        val oddNumbers = oddNumbers
        assertEquals(49,oddNumbers.last )
    }

}