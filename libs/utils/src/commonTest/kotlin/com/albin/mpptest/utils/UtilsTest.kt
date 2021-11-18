package com.albin.mpptest.utils

import kotlin.test.Test
import kotlin.test.assertEquals

class UtilsTest {

    @Test
    fun greetingPhraseTest() {
        assertEquals("Hello, Albin!", greetingPhrase("Albin"))
    }
}
