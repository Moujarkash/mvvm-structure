package com.project.mod.posts.injection.module

import android.content.Context
import androidx.room.Room
import com.project.mod.posts.model.PostDao
import com.project.mod.posts.model.database.AppDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule(private val context: Context) {

    @Provides
    @Singleton
    internal fun providePostDao(appDatabase: AppDatabase): PostDao {
        return appDatabase.postDao()
    }

    @Provides
    @Singleton
    internal fun providerAppDatabaseInstance(): AppDatabase {
        @Suppress("UNCHECKED_CAST")
        return Room.databaseBuilder(context, AppDatabase::class.java, "posts").build()
    }
}