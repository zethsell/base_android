package com.zeth.firstapp.ui.pages.conversation.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.zeth.firstapp.data.models.Message
import com.zeth.firstapp.data.models.SampleData
import com.zeth.firstapp.ui.theme.FirstAppTheme

@Composable
fun Conversation(messages: List<Message>, modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier.padding(16.dp)) {
        items(messages) { message ->
            MessageCard(message = message)
        }
    }
}

@Preview()
@Composable
private fun PreviewConversation() {
    FirstAppTheme(dynamicColor = false, darkTheme = false) {
        Surface {
            Conversation(messages = SampleData.conversationSample)
        }
    }
}