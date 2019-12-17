package com.project.mod.posts.base

import androidx.lifecycle.ViewModel
import com.project.mod.posts.injection.component.DaggerViewModelInjector
import com.project.mod.posts.injection.component.ViewModelInjector
import com.project.mod.posts.injection.module.NetworkModule
import com.project.mod.posts.ui.post.PostListViewModel


abstract class BaseViewModel: ViewModel() {
    private val injector: ViewModelInjector = DaggerViewModelInjector
        .builder()
        .networkModule(NetworkModule)
        .build()

    init {
        inject()
    }

    private fun inject() {
        when (this) {
            is PostListViewModel -> injector.inject(this)
        }
    }
}