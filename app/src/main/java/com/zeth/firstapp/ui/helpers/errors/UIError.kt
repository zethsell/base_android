package com.zeth.firstapp.ui.helpers.errors

enum class UIError(val description: String) {
    REQUIRED_FIELD("Campo obrigatório"),
    INVALID_FIELD("Campo inválido"),
    INVALID_CREDENTIALS("Credenciais inválidas."),
    EMAIL_IN_USE("Campo obrigatório"),
    UNEXPECTED("Algo errado aconteceu. Tente novamente em breve.");
}