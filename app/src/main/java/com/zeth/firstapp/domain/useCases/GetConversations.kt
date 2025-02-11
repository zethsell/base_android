package com.zeth.firstapp.domain.useCases

import com.zeth.firstapp.data.models.Message

interface GetConversations {
    fun run(): List<Message>
}