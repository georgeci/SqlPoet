package com.mercaux.sqlpoet.test

import com.georgeci.sqlpoet.*
import com.mercaux.sqlpoet.test.sample.Role
import com.mercaux.sqlpoet.test.sample.StarWarsFilms
import com.mercaux.sqlpoet.test.sample.UserK
import org.jetbrains.exposed.sql.SqlExpressionBuilder.eq
import org.jetbrains.exposed.sql.andWhere
import org.jetbrains.exposed.sql.select
import org.junit.Test
import org.ktorm.database.Database
import org.ktorm.dsl.*

class SqlPoetTest {
    @Test
    fun r(){
//        assert(Role.id.peq(1).sql == "id = 1")
    }

    @Test
    fun te(){
        StarWarsFilms.name eq ""

        StarWarsFilms.select{
            StarWarsFilms.name eq ""
        }
//            .whe
//            .prepareSQL()

        val database = Database.connect("jdbc:mysql://localhost:3306/ktorm", user = "root", password = "***")

        database.from(UserK)
            .select(UserK.id)
            .limit(1)
            .where{
                UserK.name eq "1"
            }
            .sql

//        SqlPoet.select(Role.id.withTable())
//            .from(Role)
//            .sql
//
//        Role.id.peq(1).sql
//        Role.id.peq(1)
//
//        SqlPoet.select(Role.id.withTable())
//            .from(Role)
//            .limit(1)
//            .where(Role.id.peq(1))
//            .sql
//
//        SqlPoet.select(Role.id.withTable())
//            .from(Role)
//            .limit(1)
//            .where(Role.id peq 1)
//            .sql


    }
}