package com.ruzibekov.uptodo.ui.screens.splash

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ruzibekov.uptodo.R
import com.ruzibekov.uptodo.ui.components.buttons.PrimaryButton
import com.ruzibekov.uptodo.ui.theme.UpTodoTheme

object SplashScreen {

    @Composable
    fun Default() {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_app_icon),
                contentDescription = "",
                modifier = Modifier.size(113.dp),
                tint = MaterialTheme.colorScheme.primary
            )

            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = stringResource(id = R.string.app_name),
                fontSize = 40.sp,
                style = MaterialTheme.typography.displayLarge
            )
        }
    }
}


@Preview
@Composable
private fun SplashScreenPreview() {
    UpTodoTheme {
        SplashScreen.Default()
    }
}