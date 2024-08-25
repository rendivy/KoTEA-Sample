package com.yuriyyangel.featue_account_list_impl.data.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
internal class AccountDb(
    @PrimaryKey
    val id: String,
    val photo: String,
    val name: String,
    val grade: String,
)