package com.company.account.service.impl;

import com.company.account.dto.CustomerDto;
import com.company.account.repository.AccountRepository;
import com.company.account.repository.CustomerRepository;
import com.company.account.service.IAccountService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccountServiceImpl implements IAccountService {

    private AccountRepository accountRepository;
    private CustomerRepository customerRepository;


    /**
     * @param customerDto -CustomerDto Object
     */
    @Override
    public void createAccount(CustomerDto customerDto) {

    }
}
