package com.stringtemplate


import org.junit.Assert
import org.junit.Test

class StringTemplateDemoTest {
    @Test
    fun `say Hello Mak`() {
        Assert.assertEquals("Hello Mac", sayHello("Mac"))

    }

    @Test
    fun `count lenght of String "Kotlin"`() {
        Assert.assertEquals("lenght:=6", countLengthOfString("Kotlin"))
    }
}