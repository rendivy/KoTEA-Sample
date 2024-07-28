package com.yuriyyangel.feature_account_list_api.domain.entities

import com.yuriyyangel.feature_account_list_api.domain.usecases.Account

interface GetAllAccountUseCase {

    suspend operator fun invoke(): List<Account>
}
