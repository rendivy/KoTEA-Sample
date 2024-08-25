package com.yuriyyangel.featue_account_list_impl.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.yuriyyangel.featue_account_list_impl.data.database.dao.AccountDao
import com.yuriyyangel.featue_account_list_impl.data.database.entities.AccountDb

@Database(entities = [AccountDb::class], version = 1, exportSchema = false)
internal abstract class AppDatabase : RoomDatabase() {
    abstract fun accountDao(): AccountDao
}