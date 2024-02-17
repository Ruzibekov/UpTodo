package com.ruzibekov.uptodo.ui.screens.onboarding

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.HorizontalPagerIndicator
import com.google.accompanist.pager.rememberPagerState
import com.ruzibekov.uptodo.R
import com.ruzibekov.uptodo.ui.components.buttons.PrimaryButton
import com.ruzibekov.uptodo.ui.screens.onboarding.components.OnboardingPagerView
import com.ruzibekov.uptodo.ui.theme.UpTodoTheme

object OnboardingScreen {

    @OptIn(ExperimentalPagerApi::class)
    @Composable
    fun Default() {
        val pagerState = rememberPagerState()

        Scaffold(
            topBar = {
                TopBar(onClickSkip = {})
            },
            bottomBar = {
                BottomBar(onClickBack = {}, onClickNext = {})
            }
        ) { paddingValues ->

            Box(modifier = Modifier.padding(paddingValues)) {

                HorizontalPager(
                    count = PageType.entries.size,
                    state = pagerState
                ) { page ->
                    OnboardingPagerView.Default(page = page)
                }

                HorizontalPagerIndicator(
                    pagerState = pagerState,
                    modifier = Modifier
                        .padding(top = 330.dp)
                        .align(Alignment.TopCenter),
                    indicatorWidth = 27.dp,
                    indicatorHeight = 4.dp,
                    spacing = 8.dp,
                    activeColor = MaterialTheme.colorScheme.onSurface.copy(0.87f),
                    inactiveColor =MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
        }
    }

    @Composable
    private fun TopBar(onClickSkip: () -> Unit) {
        TextButton(
            onClick = onClickSkip,
            modifier = Modifier
                .padding(start = 24.dp, top = 14.dp)
                .statusBarsPadding(),
            shape = RoundedCornerShape(4.dp),
            contentPadding = PaddingValues()
        ) {
            Text(
                text = stringResource(R.string.skip),
                style = MaterialTheme.typography.titleLarge,
                fontSize = 16.sp,
                color = MaterialTheme.colorScheme.onSurface.copy(0.44f)
            )
        }
    }

    @Composable
    private fun BottomBar(onClickBack: () -> Unit, onClickNext: () -> Unit) {
        Row(
            modifier = Modifier
                .navigationBarsPadding()
                .padding(start = 24.dp, end = 24.dp, bottom = 40.dp)
                .fillMaxWidth()
                .height(50.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            TextButton(
                onClick = onClickBack,
                shape = RoundedCornerShape(4.dp),
                contentPadding = PaddingValues()
            ) {
                Text(
                    text = stringResource(R.string.back),
                    style = MaterialTheme.typography.titleLarge,
                    fontSize = 16.sp,
                    color = MaterialTheme.colorScheme.onSurface.copy(0.44f)
                )
            }

            PrimaryButton.Default(textRes = R.string.next, onClick = onClickNext)
        }
    }
}


@Preview(device = "id:pixel_7_pro")
@Composable
private fun OnBoardingScreenPreview() {
    UpTodoTheme {
        OnboardingScreen.Default()
    }
}