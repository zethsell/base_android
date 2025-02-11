package com.zeth.firstapp.validation.validators

import com.zeth.firstapp.presentation.protocols.Validation
import com.zeth.firstapp.presentation.protocols.ValidationError

class ValidationComposite : Validation {
    override fun validate(
        field: String,
        input: Map<String, Any?>
    ): ValidationError? {
        return null
    }
}