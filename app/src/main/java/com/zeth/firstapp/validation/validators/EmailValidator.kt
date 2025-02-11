package com.zeth.firstapp.validation.validators

import com.zeth.firstapp.ui.helpers.errors.UIError
import com.zeth.firstapp.validation.protocols.FieldValidation

class EmailValidator(override val field: String) : FieldValidation {
    override fun validate(value: String?): String? {
        val regex = Regex("^[a-zA-Z0-9.a-z-A-Z0-9!#\$%&'*+\\-/=?^_`{|}~]+@[a-zA-Z0-9]+\\.[a-zA-Z]+")
        val isValid = value.isNullOrEmpty() || regex.matches(value)
        return if (isValid) null else UIError.INVALID_FIELD.description
    }
}