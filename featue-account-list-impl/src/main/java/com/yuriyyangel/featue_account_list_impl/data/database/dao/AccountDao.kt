package com.yuriyyangel.featue_account_list_impl.data.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.yuriyyangel.featue_account_list_impl.data.database.entities.AccountDb

@Dao
internal interface AccountDao {

    @Query("SELECT * FROM accountdb")
    suspend fun getAll(): List<AccountDb>

    @Insert
    suspend fun insert(accountDb: AccountDb)

    @Query("DELETE FROM accountdb")
    suspend fun deleteAll()

    suspend fun insertAndDeleteAll(accounts: List<AccountDb>) {
        deleteAll()
        accounts.forEach {
            insert(it)
        }
    }
}