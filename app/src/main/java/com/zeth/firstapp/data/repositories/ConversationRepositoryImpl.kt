package com.zeth.firstapp.data.repositories

import com.zeth.firstapp.SampleData
import com.zeth.firstapp.data.models.Message
import com.zeth.firstapp.domain.repositories.ConversationRepository

class ConversationRepositoryImpl : ConversationRepository {
    override fun getMessages(): List<Message> {
        return SampleData.conversationSample
    }
}