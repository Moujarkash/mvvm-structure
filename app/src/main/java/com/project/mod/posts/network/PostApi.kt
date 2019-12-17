package com.project.mod.posts.network

import com.project.mod.posts.model.Post
import io.reactivex.Observable
import retrofit2.http.GET


interface PostApi {

    @GET("/posts")
    fun getPosts(): Observable<List<Post>>
}