package com.georgeci.sqlpoet.types

import com.georgeci.sqlpoet.base.SqlPoetColumnType

class SqlPoetIntColumnType : SqlPoetColumnType<Int>() {
    override fun sqlType(): String = "int"
    override fun valueFromDB(value: Any): Int = when (value) {
        is Int -> value
        is Number -> value.toInt()
        is String -> value.toInt()
        else -> error("Unexpected value of type Int: $value of ${value::class.qualifiedName}")
    }
}