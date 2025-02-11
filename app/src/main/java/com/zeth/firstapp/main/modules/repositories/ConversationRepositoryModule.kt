package com.zeth.firstapp.main.modules.repositories

import com.zeth.firstapp.data.repositories.ConversationRepositoryImpl
import com.zeth.firstapp.domain.repositories.ConversationRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class ConversationRepositoryModule {

    @Provides
    fun providesConversationRepository(): ConversationRepository {
        return ConversationRepositoryImpl()
    }
}