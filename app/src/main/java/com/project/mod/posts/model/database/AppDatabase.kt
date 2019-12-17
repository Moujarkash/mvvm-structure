package com.project.mod.posts.model.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.project.mod.posts.model.Post
import com.project.mod.posts.model.PostDao

@Database(entities = arrayOf(Post::class), version = 1)
abstract class AppDatabase: RoomDatabase() {
    abstract fun postDao(): PostDao
}