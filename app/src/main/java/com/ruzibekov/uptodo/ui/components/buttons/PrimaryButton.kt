package com.ruzibekov.uptodo.ui.components.buttons

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ruzibekov.uptodo.R
import com.ruzibekov.uptodo.ui.theme.UpTodoTheme

object PrimaryButton {

    @Composable
    fun Default(@StringRes textRes: Int, onClick: () -> Unit, modifier: Modifier = Modifier) {
        Button(
            onClick = onClick,
            modifier = modifier.height(50.dp),
            shape = RoundedCornerShape(4.dp),
        ) {
            Text(
                text = stringResource(textRes),
                style = MaterialTheme.typography.titleLarge,
                fontSize = 16.sp,
            )
        }
    }
}


@Preview
@Composable
private fun PrimaryButtonPreview() {
    UpTodoTheme {
        PrimaryButton.Default(textRes = R.string.back, onClick = { /*TODO*/ })
    }
}