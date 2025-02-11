package com.zeth.firstapp.ui.pages.conversation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import com.zeth.firstapp.presentation.ConversationViewModel
import com.zeth.firstapp.ui.pages.conversation.components.Conversation
import com.zeth.firstapp.ui.theme.FirstAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ConversationActivity : ComponentActivity() {

    private val conversationViewModel: ConversationViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FirstAppTheme(dynamicColor = false, darkTheme = false) {
                Scaffold { innerPadding ->
                    Surface(modifier = Modifier.Companion.padding(innerPadding)) {
                        val messages = conversationViewModel
                            .conversationMessages
                            .observeAsState(initial = emptyList())
                            .value

                        Conversation(
                            messages = messages,
                        )
                    }
                }
            }
        }
    }
}