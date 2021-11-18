package com.albin.mpptest.main

import com.albin.mpptest.utils.greetingPhrase
import kotlin.js.ExperimentalJsExport
import kotlin.js.JsExport
import kotlin.js.JsName

@JsExport
class StringStuff() {

    fun sayTheGreeting() {
        println(greetingPhrase("Albin"))
    }
}

/*
@ExperimentalJsExport
@JsExport
data class Cucumber(var ears: Int, val _ears: String) {
    fun bananas() = ears + 5
}
*/

/*
interface Fruit {
    val name: String
}

@ExperimentalJsExport
@JsExport
class Yummy(override val name: String) : Fruit {
    fun sayHi() {
        println(greetingPhrase(name))
    }
}

@ExperimentalJsExport
@JsExport
object Banan : Fruit {
    override val name = "Banan"
    val age = 15
}
*/
