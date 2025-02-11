package com.zeth.firstapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.zeth.firstapp.ui.pages.conversation.components.Conversation
import com.zeth.firstapp.ui.theme.FirstAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            FirstAppTheme(dynamicColor = false, darkTheme = false) {
                Scaffold { innerPadding ->
                    Conversation(
                        messages = SampleData.conversationSample,
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}



