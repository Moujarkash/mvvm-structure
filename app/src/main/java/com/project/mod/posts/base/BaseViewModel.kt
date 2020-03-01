package com.project.mod.posts.base

import android.content.Context
import androidx.lifecycle.ViewModel
import com.project.mod.posts.injection.component.DaggerViewModelInjector
import com.project.mod.posts.injection.component.ViewModelInjector
import com.project.mod.posts.injection.module.DatabaseModule
import com.project.mod.posts.injection.module.NetworkModule
import com.project.mod.posts.ui.post.PostListViewModel


abstract class BaseViewModel(context: Context): ViewModel() {
    private val injector: ViewModelInjector = DaggerViewModelInjector
        .builder()
        .networkModule(NetworkModule)
        .databaseModule(DatabaseModule(context = context))
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