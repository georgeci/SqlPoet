package com.mercaux.sqlpoet.test

import com.georgeci.sqlpoet.SqlPoet
import com.georgeci.sqlpoet.base.SqlPoetTable
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
        assertEquals("SELECT * ", SqlPoet.select().query)

//        val r = Role.columns()
//        print(r)
    }

    @Test
    fun t6() {
        assertEquals("SELECT name ", SqlPoet.select(Role.name).query)

//        val r = Role.columns()
//        print(r)
    }

    @Test
    fun t7() {
        assertEquals("SELECT role.name ", SqlPoet.select(Role.name.withTable()).query)

//        val r = Role.columns()
//        print(r)
    }

    @Test
    fun t8() {
        assertEquals("SELECT id, name ", SqlPoet.select(Role.id,Role.name).query)

//        val r = Role.columns()
//        print(r)
    }
}