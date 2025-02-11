package com.zeth.firstapp.data.useCases

import com.zeth.firstapp.data.models.Message
import com.zeth.firstapp.domain.repositories.ConversationRepository
import com.zeth.firstapp.domain.useCases.GetConversations
import javax.inject.Inject

class GetConversationsFromFile @Inject constructor(private val repository: ConversationRepository) :
    GetConversations {
    override fun run(): List<Message> {
        return repository.getMessages()
    }
}