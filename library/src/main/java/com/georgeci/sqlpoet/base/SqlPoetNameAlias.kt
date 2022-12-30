package com.georgeci.sqlpoet.base

data class SqlPoetNameAlias(
    private val name: String,
    private val aliasName: String? = null,
    val tableName: String? = null,
) : SqlPoetQuery {
    override val query: String
        get() = when {
            aliasName.isNullOrEmpty().not() -> aliasName ?: ""
            name.isEmpty().not() -> fullName()
            else -> ""
        }
    fun fullName(): String =
        (if (tableName.isNullOrEmpty().not()) "$tableName." else "") + name()

    fun name(): String? {
        return  name
    }
}