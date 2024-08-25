package com.yuriyyangel.featue_account_list_impl.data.di

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.yuriyyangel.featue_account_list_impl.data.database.AppDatabase
import com.yuriyyangel.featue_account_list_impl.data.database.dao.AccountDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
data object DataModule {

    @Singleton
    @Provides
    fun provideDatabase(@ApplicationContext context: Context): AppDatabase {
        return Room
            .databaseBuilder(context, AppDatabase::class.java, "app_database")
            .build()
    }

    @Provides
    fun provideDao(appDatabase: AppDatabase): AccountDao {
        return appDatabase.accountDao()
    }

}