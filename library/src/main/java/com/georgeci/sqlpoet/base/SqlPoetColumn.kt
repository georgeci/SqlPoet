package com.georgeci.sqlpoet.base

data class SqlPoetColumn<T : Any>(
    /** Table where the columns are declared. */
    val table: SqlPoetTable,
    /** Name of the column. */
    val nameAlias: SqlPoetNameAlias,
    /** Data type of the column. */
    val columnType: SqlPoetBaseColumnType<T>
) : SqlPoetQuery {

    fun withTable() = this.copy(nameAlias = nameAlias.copy(tableName = table.tableName))

    override val query: String = nameAlias.query
}