package com.georgeci.sqlpoet.types

import com.georgeci.sqlpoet.base.SqlPoetColumnType

abstract class SqlPoetStringColumnType(
    /** Returns the collate type used in by this column. */
    val collate: String? = null
) : SqlPoetColumnType<String>() {
    /** Returns the specified [value] with special characters escaped. */
    protected fun escape(value: String): String =
        value.map { charactersToEscape[it] ?: it }.joinToString("")

    override fun valueFromDB(value: Any): Any = when (value) {
//        is Clob -> value.characterStream.readText()
        is ByteArray -> String(value)
        else -> value
    }

    override fun nonNullValueToString(value: Any): String = buildString {
        append('\'')
        append(escape(value.toString()))
        append('\'')
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        if (!super.equals(other)) return false

        other as SqlPoetStringColumnType

        if (collate != other.collate) return false

        return true
    }

    override fun hashCode(): Int {
        var result = super.hashCode()
        result = 31 * result + (collate?.hashCode() ?: 0)
        return result
    }

    companion object {
        private val charactersToEscape = mapOf(
            '\'' to "\'\'",
//            '\"' to "\"\"", // no need to escape double quote as we put string in single quotes
            '\r' to "\\r", '\n' to "\\n"
        )
    }
}