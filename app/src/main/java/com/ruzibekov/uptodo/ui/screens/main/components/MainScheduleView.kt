package com.ruzibekov.uptodo.ui.screens.main.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

object MainScheduleView {

    @Composable
    fun Default() {
        Canvas(
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp),
            onDraw = {
//                drawLine()
            }
        )
    }
}