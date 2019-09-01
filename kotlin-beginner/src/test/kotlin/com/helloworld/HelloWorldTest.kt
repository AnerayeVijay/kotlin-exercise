package com.helloworld

import org.junit.Test
import org.junit.Assert.assertEquals

class HelloWorldTest {
    @Test fun `say Hello to Vijay`() {
        assertEquals("Hello Vijay",sayHello("Vijay"))
    }
}