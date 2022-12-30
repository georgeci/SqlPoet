package com.mercaux.sqlpoet.test.sample

import com.georgeci.sqlpoet.base.SqlPoetColumn
import com.georgeci.sqlpoet.base.SqlPoetTable
import com.georgeci.sqlpoet.ext.int
import com.georgeci.sqlpoet.ext.string

object Role : SqlPoetTable("role") {
    val id: SqlPoetColumn<Int> = int("id")
    val name: SqlPoetColumn<String> = string("name")
}