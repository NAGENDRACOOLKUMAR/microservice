package com.company.account.repository;

import com.company.account.entity.Account;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account,Long> {

    Optional<Account> findByCustomerId(Long customerId);

    @Transactional
    @Modifying      // we are writing two annotation  for transaction and other for modifying data
    void deleteByCustomerId(Long customerId);
}
