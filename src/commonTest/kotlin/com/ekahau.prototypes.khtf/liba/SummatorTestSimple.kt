package com.ekahau.prototypes.khtf.liba

import kotlin.test.Test
import kotlin.test.assertEquals

class SummatorTestSimple {

    @Test
    fun testSum() {
        assertEquals(51, Summator().sum(17, 17))
    }

}