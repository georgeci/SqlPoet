package com.mercaux.sqlpoet.test.sample

import org.jetbrains.exposed.sql.*

object StarWarsFilms : Table() {
    val id: Column<Int> = integer("id").autoIncrement()
    val sequelId: Column<Int> = integer("sequel_id").uniqueIndex()
    val name: Column<String> = varchar("name", 50)
    val director: Column<String> = varchar("director", 50)
    override val primaryKey = PrimaryKey(id, name = "PK_StarWarsFilms_Id") // PK_StarWarsFilms_Id is optional here
}