package com.zeth.firstapp.main.modules.useCases

import com.zeth.firstapp.data.useCases.GetConversationsFromFile
import com.zeth.firstapp.domain.repositories.ConversationRepository
import com.zeth.firstapp.domain.useCases.GetConversations
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class ConversationUseCases {

    @Provides
    fun provideGetConversationsFromFile(repository: ConversationRepository): GetConversations {
        return GetConversationsFromFile(repository)
    }
}