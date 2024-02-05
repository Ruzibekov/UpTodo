package com.ruzibekov.uptodo.ui.screens.login

import androidx.core.util.Consumer
import com.ruzibekov.uptodo.ui.screens.base.BaseViewModel
import com.ruzibekov.uptodo.ui.screens.login.state.LoginState

class LoginViewModel : BaseViewModel<LoginState>(), Consumer<LoginEvent> {

    override val state: LoginState = LoginState()

    override fun accept(event: LoginEvent) {
        when (event) {
            is LoginEvent -> login()
        }
    }

    private fun login() {

    }
}

sealed class LoginEvent {
    data object Login : LoginEvent()
}