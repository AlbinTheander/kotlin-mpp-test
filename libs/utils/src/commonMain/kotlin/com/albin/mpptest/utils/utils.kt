package com.albin.mpptest.utils

import kotlin.js.ExperimentalJsExport
import kotlin.js.JsExport

@ExperimentalJsExport
@JsExport
fun greetingPhrase(name: String): String {
//    return "Hello, $name"
    return listOf("Hello", name).joinToString(", ")
}

