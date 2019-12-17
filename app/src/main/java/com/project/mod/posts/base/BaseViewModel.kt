package com.project.mod.posts.base

import androidx.lifecycle.ViewModel
import com.project.mod.posts.injection.component.ViewModelInjector
import com.project.mod.posts.injection.module.NetworkModule


abstract class BaseViewModel: ViewModel() {
    private val injector: ViewModelInjector = DaggerViewModelInjector
        .builder()
        .networkModule(NetworkModule)
        .build()
}