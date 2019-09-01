package com.kotlin.classdeligaton

interface Developer {
    fun doDevelopment()
}

interface Tester {
    fun doTesting ()
}

class FullStackDeveloper : Developer {
    override fun doDevelopment() {
        println("Server side Development and Cient Side Development")
    }
}

class JavaDeveloper : Developer {
    override fun doDevelopment() {
        println("Employee with Java Development Skill")
    }
}

class  AutomationTester : Tester {
    override fun doTesting() {
        println("Tester with Automation skill")
    }
}

class  ManualTesting : Tester {
    override fun doTesting() {
        println("Manual Testing skill")
    }
}

data class Employee (val developer: Developer,val tester: Tester):Developer by developer, Tester by tester

fun main(args: Array<String>) {
    val john = Employee(FullStackDeveloper(), AutomationTester())
    println(john.doDevelopment())
    println(john.doTesting())

    val cristoper = Employee(JavaDeveloper(),ManualTesting())
    println(cristoper.doDevelopment())
    println(cristoper.doTesting())
}

