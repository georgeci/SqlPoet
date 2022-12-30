package com.mercaux.sqlpoet.test.sample

import org.ktorm.schema.*


object UserK : Table<Nothing>("t_employee") {
    val id: Column<Int> = int("id").primaryKey()
    val name = varchar("name")
    val job = varchar("job")
    val managerId = int("manager_id")
    val hireDate = date("hire_date")
    val salary = long("salary")
    val departmentId = int("department_id")
}