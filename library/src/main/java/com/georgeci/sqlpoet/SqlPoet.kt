package com.georgeci.sqlpoet

import com.georgeci.sqlpoet.base.SqlPoetColumn
import com.georgeci.sqlpoet.operators.SqlPoetSelect

object SqlPoet {

    fun select() = SqlPoetSelect()
    fun select(vararg columns: SqlPoetColumn<*>) = SqlPoetSelect(columns)
}