package com.zeth.firstapp.presentation.protocols

interface Validation {
    fun validate(field: String, input: Map<String, Any?>): ValidationError?
}

enum class ValidationError {
    REQUIRED_FIELD,
    INVALID_FIELD;
}
