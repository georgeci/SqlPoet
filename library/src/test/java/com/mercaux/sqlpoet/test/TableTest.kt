package com.mercaux.sqlpoet.test

import com.mercaux.sqlpoet.test.sample.Role
import junit.framework.TestCase.assertEquals
import org.junit.Test

class TableTest {

    @Test
    fun t1() {
        assertEquals("id", Role.id.query)
    }

    @Test
    fun t2() {
        assertEquals("role.id", Role.id.withTable().query)
    }

    @Test
    fun t3() {
        assert(Role.id.query != Role.id.withTable().query)
    }

    @Test
    fun t4() {
        assertEquals("name", Role.name.query)
    }

    @Test
    fun t5() {
//        val r = Role.columns()
//        print(r)
    }
}