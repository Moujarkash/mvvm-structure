package com.project.mod.posts.network

import android.database.Observable
import com.project.mod.posts.model.Post
import retrofit2.http.GET


interface PostApi {

    @GET("/posts")
    fun getPosts(): Observable<List<Post>>
}