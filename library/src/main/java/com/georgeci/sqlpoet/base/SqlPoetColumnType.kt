package com.georgeci.sqlpoet.base


abstract class SqlPoetColumnType<T>(override var nullable: Boolean = false) : SqlPoetBaseColumnType<T> {
    override fun toString(): String = sqlType()
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as SqlPoetColumnType<T>

        if (nullable != other.nullable) return false
        return true
    }

    override fun hashCode(): Int = 31 * javaClass.hashCode() + nullable.hashCode()
}

