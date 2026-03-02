package com.company.account.mapper;

import com.company.account.dto.AccountDto;
import com.company.account.entity.Account;

public class AccountMapper {

// this mapper is going to map entity to dto and dto to entity

    public static AccountDto mapToAccountDto(Account account, AccountDto accountDto) {

        accountDto.setAccountNumber(account.getAccountNumber());
        accountDto.setAccountType(account.getAccountType());
        accountDto.setBranchAddress(account.getBranchAddress());
        return accountDto;
    }

    public static Account mapToAccount(AccountDto accountDto, Account account) {
        account.setAccountNumber(accountDto.getAccountNumber());
        account.setAccountType(accountDto.getAccountType());
        account.setBranchAddress(accountDto.getBranchAddress());
        return account;
    }

}
