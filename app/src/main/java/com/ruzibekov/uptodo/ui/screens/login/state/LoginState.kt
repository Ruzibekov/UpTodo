package com.ruzibekov.uptodo.ui.screens.login.state

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import com.ruzibekov.uptodo.ui.screens.base.BaseState

data class LoginState(
    val username: MutableState<String> = mutableStateOf(""),
    val password: MutableState<String> = mutableStateOf("")
): BaseState()
