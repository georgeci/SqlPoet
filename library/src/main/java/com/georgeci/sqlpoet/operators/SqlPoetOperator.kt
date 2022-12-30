//package com.georgeci.sqlpoet
//
//import org.jetbrains.exposed.sql.*
//import org.jetbrains.exposed.sql.EqOp
//import org.ktorm.dsl.eq
//import org.ktorm.expression.BinaryExpression
//import org.ktorm.schema.ColumnDeclaring
//
//class SqlPoetOperator {
//}
//
//infix fun <T> ExpressionWithColumnType<T>.peq(t: T): Op<Boolean> = if (t == null) isNull() else EqOp(this, wrap(t))
//
//fun <T> Expression<T>.isNull(): IsNullOp = IsNullOp(this)
//
//class EqOp(expr1: Expression<*>, expr2: Expression<*>) : ComparisonOp(expr1, expr2, "=")
//
//abstract class ComparisonOp(
//    /** Returns the left-hand side operand. */
//    val expr1: Expression<*>,
//    /** Returns the right-hand side operand. */
//    val expr2: Expression<*>,
//    /** Returns the symbol of the comparison operation. */
//    val opSign: String
//) : Op<Boolean>(), ComplexExpression, Op.OpBoolean {
//    override fun toQueryBuilder(queryBuilder: QueryBuilder): Unit = queryBuilder {
//        appendExpression(expr1)
//        append(" $opSign ")
//        appendExpression(expr2)
//    }
//}