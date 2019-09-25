package com.ekahau.prototypes.khtf.liba

import kotlin.test.Test
import kotlin.test.assertEquals

class SummatorTest {

    @Test
    fun testSum() {
        assertEquals(20, Summator().sum(1, 2))
    }

}