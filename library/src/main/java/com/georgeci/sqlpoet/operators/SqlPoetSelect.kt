package com.georgeci.sqlpoet.operators

import com.georgeci.sqlpoet.base.SqlPoetColumn
import com.georgeci.sqlpoet.base.SqlPoetQuery

class SqlPoetSelect(
    private val propertyList: List<SqlPoetColumn<*>>,
) : SqlPoetQuery {

    constructor(columns: Array<out SqlPoetColumn<*>>) : this(columns.toList())
    constructor() : this(listOf(SqlPoetSyntheticAllColumn))

    private var selectQualifier: SqlPoetSelectQualifierType = SqlPoetSelectQualifierType.None
    override val query: String
        get() {
            val queryBuilder = StringBuilder("SELECT ")
            when (selectQualifier) {
                SqlPoetSelectQualifierType.All -> queryBuilder.append("ALL ")
                SqlPoetSelectQualifierType.Any -> queryBuilder.append("ANY ")
                SqlPoetSelectQualifierType.Distinct -> queryBuilder.append("DISTINCT ")
                SqlPoetSelectQualifierType.None -> {}
            }

            queryBuilder.append(propertyList.joinToString(separator = ", ") { it.query })
            queryBuilder.append(" ")
            return queryBuilder.toString()
        }
}