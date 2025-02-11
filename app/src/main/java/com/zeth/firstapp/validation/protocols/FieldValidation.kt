package com.zeth.firstapp.validation.protocols

interface FieldValidation {
    val field: String
    fun validate(value: String?): String?
}