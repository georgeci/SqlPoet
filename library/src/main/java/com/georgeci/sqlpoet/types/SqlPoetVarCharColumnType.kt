package com.georgeci.sqlpoet.types

open class SqlPoetVarCharColumnType(
    /** Returns the maximum length of this column. */
    val colLength: Int = 255, collate: String? = null
) : SqlPoetStringColumnType(collate) {
    override fun sqlType(): String = buildString {
        append("VARCHAR($colLength)")
        if (collate != null) {
            append(" COLLATE ${escape(collate)}")
        }
    }

//    override fun validateValueBeforeUpdate(value: Any?) {
//        if (value is String) {
//            require(value.codePointCount(0, value.length) <= colLength) {
//                "Value '$value' can't be stored to database column because exceeds length ($colLength)"
//            }
//        }
//    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        if (!super.equals(other)) return false

        other as SqlPoetVarCharColumnType

        if (colLength != other.colLength) return false

        return true
    }

    override fun hashCode(): Int {
        var result = super.hashCode()
        result = 31 * result + colLength
        return result
    }
}