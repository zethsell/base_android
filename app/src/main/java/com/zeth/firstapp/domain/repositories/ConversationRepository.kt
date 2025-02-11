package com.zeth.firstapp.domain.repositories

import com.zeth.firstapp.data.models.Message

interface ConversationRepository {
    fun getMessages(): List<Message>
}