package com.georgeci.sqlpoet.base

open class SqlPoetTable(
    val tableName: String,
) {
     val _columns = mutableListOf<SqlPoetColumn<*>>()
    fun <T : Any> registerColumn(name: String, type: SqlPoetBaseColumnType<T>): SqlPoetColumn<T> =
        SqlPoetColumn<T>(this, SqlPoetNameAlias(name), type).also { _columns.addColumn(it) }

//    private val _columns = LinkedHashMap<String, Column<*>>()

    private fun MutableList<SqlPoetColumn<*>>.addColumn(column: SqlPoetColumn<*>) {
//        if (this.any { it.name == column.name }) {
//            throw DuplicateColumnException(column.name, tableName)
//        }
        this.add(column)
    }

    fun columns() = _columns.toList()

    fun columnsWithTable() = _columns.map {
        it.withTable()
    }
}