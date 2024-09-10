package com.yuriyyangel.featue_account_list_impl.domain.repositories

import com.yuriyyangel.featue_account_list_impl.data.database.dao.AccountDao
import com.yuriyyangel.featue_account_list_impl.data.mappers.AccountDbToDomainMapper
import com.yuriyyangel.feature_account_list_api.domain.usecases.Account


internal class AccountsRepository(
    private val accountDao: AccountDao,
    private val accountDbToDomainMapper: AccountDbToDomainMapper,
) {

    suspend fun getAllAccounts(): List<Account> {
        return accountDao
            .getAll()
            .map { accountDbToDomainMapper(it) }
    }


}