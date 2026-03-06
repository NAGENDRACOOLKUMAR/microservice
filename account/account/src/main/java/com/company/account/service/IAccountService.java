package com.company.account.service;


import com.company.account.dto.CustomerDto;

public interface IAccountService {


    /**
     * @param customerDto -CustomerDto Object
     */
    void createAccount(CustomerDto customerDto);


    /**
     *
     * @param mobileNumber -Input mobile Number
     * @return Account details based on given mobile number
     */

    CustomerDto fetchAccount(String mobileNumber);

    /**
     *
     * @param customerDto -CustomerDto Object
     * @return boolean indicating if the update of account details is successful or not
     */

    boolean updateAccount(CustomerDto customerDto);

    /**
     *
     * @param mobileNumber - Input Mobile Number
     * @return boolean indicating if delete of account details is successful or not
     */

    boolean deleteAccount(String mobileNumber);

}
