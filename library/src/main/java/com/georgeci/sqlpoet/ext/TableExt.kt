package com.georgeci.sqlpoet.ext

import com.georgeci.sqlpoet.base.SqlPoetColumn
import com.georgeci.sqlpoet.base.SqlPoetTable
import com.georgeci.sqlpoet.types.SqlPoetIntColumnType
import com.georgeci.sqlpoet.types.SqlPoetVarCharColumnType


public fun SqlPoetTable.int(name: String): SqlPoetColumn<Int> {
    return registerColumn(name, SqlPoetIntColumnType())
}

public fun SqlPoetTable.string(name: String): SqlPoetColumn<String> {
    return registerColumn(name, SqlPoetVarCharColumnType())
}


