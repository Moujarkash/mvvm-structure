package com.project.mod.posts.ui.post

import android.content.Context
import androidx.lifecycle.MutableLiveData
import com.project.mod.posts.base.BaseViewModel
import com.project.mod.posts.model.Post


class PostViewModel(private val context: Context): BaseViewModel(context) {
    private val postTitle = MutableLiveData<String>()
    private val postBody = MutableLiveData<String>()

    fun bind(post: Post){
        postTitle.value = post.title
        postBody.value = post.body
    }

    fun getPostTitle():MutableLiveData<String>{
        return postTitle
    }

    fun getPostBody():MutableLiveData<String>{
        return postBody
    }
}