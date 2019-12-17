package com.project.mod.posts.ui.post

import com.project.mod.posts.base.BaseViewModel
import com.project.mod.posts.network.PostApi
import javax.inject.Inject


class PostListViewModel: BaseViewModel() {

    @Inject
    lateinit var postApi: PostApi
}