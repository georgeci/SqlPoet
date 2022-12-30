package com.georgeci.sqlpoet.base

interface SqlPoetBaseColumnType<T> {
    /** Returns `true` if the column type is nullable, `false` otherwise. */
    var nullable: Boolean

    /** Returns the SQL type of this column. */
    fun sqlType(): String

    /**
     * Converts the specified [value] (from the database) to an object of the appropriated type, for this column type.
     * Default implementation returns the same instance.
     */
    fun valueFromDB(value: Any): Any = value

    /** Returns an object compatible with the database, from the specified [value], for this column type. */
    fun valueToDB(value: Any?): Any? = value?.let(::notNullValueToDB)

    /** Returns an object compatible with the database, from the specified **non-null** [value], for this column type. */
    fun notNullValueToDB(value: Any): Any = value

    /**
     * Returns the SQL representation of the specified [value], for this column type.
     * If the value is `null` and the column is not nullable, an exception will be thrown.
     */
//    fun valueToString(value: Any?): String = when (value) {
//        null -> {
//            check(nullable) { "NULL in non-nullable column" }
//            "NULL"
//        }
//
//        DefaultValueMarker -> "DEFAULT"
//        is Iterable<*> -> value.joinToString(",", transform = ::valueToString)
//        else -> nonNullValueToString(value)
//    }

    /** Returns the SQL representation of the specified **non-null** [value], for this column type. */
    fun nonNullValueToString(value: Any): String = notNullValueToDB(value).toString()

    /** Returns the object at the specified [index] in the [rs]. */
//    fun readObject(rs: ResultSet, index: Int): Any? = rs.getObject(index)

    /** Sets the [value] at the specified [index] into the [stmt]. */
//    fun setParameter(stmt: PreparedStatementApi, index: Int, value: Any?) {
//        if (value == null || value is Op.NULL) {
//            stmt.setNull(index, this)
//        } else {
//            stmt[index] = value
//        }
//    }

    /**
     * Function checks that provided value is suites the column type and throws [IllegalArgumentException] otherwise.
     * [value] can be of any type (including [Expression])
     * */
//    @Throws(IllegalArgumentException::class)
//    fun validateValueBeforeUpdate(value: Any?) {
//    }
}