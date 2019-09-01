package com.kotlin.property

import kotlin.reflect.KProperty

class User() {
     val name: String by UserNamrDelegator()
 }

class UserNamrDelegator {

    operator fun getValue(thisRef: Any,property:KProperty<*>):String {
        return "$thisRef thanks for delegating ${property.name} to me"
    }
}

fun main(array: Array<String>) {
    val user = User()
    println(user.name)
}