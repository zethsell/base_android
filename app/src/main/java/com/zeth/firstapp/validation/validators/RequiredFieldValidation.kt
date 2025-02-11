package com.zeth.firstapp.validation.validators

import com.zeth.firstapp.ui.helpers.errors.UIError
import com.zeth.firstapp.validation.protocols.FieldValidation

class RequiredFieldValidation(override val field: String) : FieldValidation {
    override fun validate(value: String?): String? {
        return if (value?.isNotEmpty() == true) null else UIError.REQUIRED_FIELD.description;
    }
}