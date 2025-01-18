package com.example.androidlab.todo.ui

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidlab.theme.AndroidLabTheme
import com.example.androidlab.todo.domain.entity.Priority
import com.example.androidlab.todo.domain.entity.TodoEntity


@Composable
fun TodoListItem(data: TodoEntity) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(12.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surface // 動的な色設定
        ),
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            // 日付
            Text(
                text = data.date, style = MaterialTheme.typography.bodySmall.copy(
                    fontWeight = FontWeight.Light, fontSize = 14.sp
                ),
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )

            Spacer(modifier = Modifier.height(8.dp))

            // タイトル
            Text(
                text = data.title, style = MaterialTheme.typography.headlineSmall.copy(
                    fontWeight = FontWeight.Bold, fontSize = 20.sp
                ),
                color = MaterialTheme.colorScheme.onSurface
            )

            Spacer(modifier = Modifier.height(8.dp))

            // 優先度
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Priority:", style = MaterialTheme.typography.bodyMedium.copy(
                        fontSize = 16.sp, fontWeight = FontWeight.Bold
                    ),
                    color = MaterialTheme.colorScheme.onSurface
                )
                Spacer(modifier = Modifier.padding(end = 8.dp))
                Box(
                    modifier = Modifier
                        .background(
                            data.priority.color, shape = RoundedCornerShape(8.dp)
                        )
                        .padding(horizontal = 12.dp, vertical = 4.dp)
                ) {
                    Text(
                        text = data.priority.label,
                        style = MaterialTheme.typography.bodyMedium.copy(
                            color = MaterialTheme.colorScheme.onPrimary,
                            fontWeight = FontWeight.Bold
                        )
                    )
                }
            }
        }
    }
}

@Preview("Light colors", showBackground = true)
@Preview("Dark colors", uiMode = UI_MODE_NIGHT_YES)
@Composable
fun TodoListItemPreview() {
    AndroidLabTheme {
        TodoListItem(
            data = TodoEntity(
                date = "2023/01/01", title = "Task 1", priority = Priority.HIGH
            )
        )
    }
}