package com.company.account.service;


import com.company.account.dto.CustomerDto;

public interface IAccountService {


    /**
     * @param customerDto -CustomerDto Object
     */
    void createAccount(CustomerDto customerDto);
}
