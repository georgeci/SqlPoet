package com.georgeci.sqlpoet.operators

sealed class SqlPoetSelectQualifierType(val value: String){
    object Distinct : SqlPoetSelectQualifierType("DISTINCT")
    object All : SqlPoetSelectQualifierType("ALL")
    object Any : SqlPoetSelectQualifierType("ANY")
    object None : SqlPoetSelectQualifierType("NONE")
}

