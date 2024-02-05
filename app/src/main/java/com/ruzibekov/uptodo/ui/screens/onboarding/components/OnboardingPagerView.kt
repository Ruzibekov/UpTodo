package com.ruzibekov.uptodo.ui.screens.onboarding.components

import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ruzibekov.uptodo.R
import com.ruzibekov.uptodo.ui.screens.splash.PageType
import com.ruzibekov.uptodo.ui.theme.UpTodoTheme

object OnboardingPagerView {

    @Composable
    fun Default(currentPage: Int, modifier: Modifier = Modifier) {

        Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally) {
            when (currentPage) {
                PageType.FIRST.index -> {
                    PageContentView(
                        iconRes = R.drawable.img_onboarding_1,
                        titleRes = R.string.manage_your_tasks,
                        textRes = R.string.you_can_easily_manage_all_of_your_daily_tasks_in_dome_for_free
                    )
                }

                PageType.SECOND.index -> {
                    PageContentView(
                        iconRes = R.drawable.img_onboarding_2,
                        titleRes = R.string.create_daily_routine,
                        textRes = R.string.in_uptodo_you_can_create_your_personalized_routine_to_stay_productive
                    )
                }

                PageType.THIRD.index -> {
                    PageContentView(
                        iconRes = R.drawable.img_onboarding_3,
                        titleRes = R.string.orgonaize_your_tasks,
                        textRes = R.string.you_can_organize_your_daily_tasks_by_adding_your_tasks_into_separate_categories
                    )
                }
            }
        }
    }

    @Composable
    private fun PageContentView(iconRes: Int, @StringRes titleRes: Int, @StringRes textRes: Int) {
        Box(
            modifier = Modifier.height(296.dp),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = iconRes),
                contentDescription = ""
            )
        }

        Spacer(modifier = Modifier.height(95.dp))

        Text(
            text = stringResource(titleRes),
            style = MaterialTheme.typography.displayLarge,
            fontSize = 32.sp,
        )

        Spacer(modifier = Modifier.height(42.dp))

        Text(
            text = stringResource(textRes),
            style = MaterialTheme.typography.titleLarge,
            fontSize = 16.sp,
            lineHeight = 24.sp,
            textAlign = TextAlign.Center,
            color = MaterialTheme.colorScheme.onSurface.copy(0.87f)
        )
    }
}


@Preview
@Composable
private fun OnboardingPagerViewPreview() {
    UpTodoTheme {
        OnboardingPagerView.Default(currentPage = 1)
    }
}