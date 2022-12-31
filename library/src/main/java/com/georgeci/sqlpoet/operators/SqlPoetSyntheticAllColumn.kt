package com.georgeci.sqlpoet.operators

import com.georgeci.sqlpoet.base.SqlPoetBaseColumnType
import com.georgeci.sqlpoet.base.SqlPoetColumn
import com.georgeci.sqlpoet.base.SqlPoetNameAlias
import com.georgeci.sqlpoet.base.SqlPoetTable

val SqlPoetSyntheticAllColumn = SqlPoetColumn<Unit>(
    table = SqlPoetTable(""),
    nameAlias = SqlPoetNameAlias("*"),
    columnType = object : SqlPoetBaseColumnType<Unit> {
        override var nullable: Boolean
            get() = false
            set(value) {}

        override fun sqlType(): String {
            return ""
        }

    },
)