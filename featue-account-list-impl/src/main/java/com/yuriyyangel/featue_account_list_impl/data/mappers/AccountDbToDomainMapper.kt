package com.yuriyyangel.featue_account_list_impl.data.mappers

import com.yuriyyangel.featue_account_list_impl.data.database.entities.AccountDb
import com.yuriyyangel.feature_account_list_api.domain.usecases.Account

internal interface AccountDbToDomainMapper : (AccountDb) -> Account

internal class AccountDbToDomainMapperImpl : AccountDbToDomainMapper {
    override fun invoke(from: AccountDb): Account {
        return Account(
            id = from.id,
            photo = from.photo,
            name = from.name,
            grade = from.grade,
        )
    }
}
