package com.ruzibekov.uptodo.ui.screens.base

import androidx.lifecycle.ViewModel

abstract class BaseViewModel<T : BaseState> : ViewModel() {

    abstract val state: T
}