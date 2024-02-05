package com.ruzibekov.uptodo.ui.components

import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ruzibekov.uptodo.ui.theme.UpTodoTheme

object CircularProgressView {

    @Composable
    fun Default(progress: Float) {

        val progressAnimator = animateFloatAsState(
            targetValue = progress,
            label = "circular progress indicator animation",
            animationSpec = tween(durationMillis = 1000, easing = LinearOutSlowInEasing),
        )

        CircularProgressIndicator(
            modifier = Modifier.size(213.dp),
            progress = progressAnimator.value,
            color = Color(0xFF8687E7),
            strokeCap = StrokeCap.Round,
            strokeWidth = 12.dp
        )
    }
}

@Preview
@Composable
private fun MainFocusModePreview() {
    UpTodoTheme {
        var progress by remember { mutableFloatStateOf(0f) }
        CircularProgressView.Default(progress)
    }
}