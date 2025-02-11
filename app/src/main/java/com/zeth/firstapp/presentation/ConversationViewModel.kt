package com.zeth.firstapp.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.zeth.firstapp.data.models.Message
import com.zeth.firstapp.domain.useCases.GetConversations
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ConversationViewModel @Inject constructor(
    private val getConversations: GetConversations
) : ViewModel() {
    private val _conversationMessages = MutableLiveData<List<Message>>()
    val conversationMessages: LiveData<List<Message>> = _conversationMessages

    init {
        _conversationMessages.value = getConversations.run()
    }
}