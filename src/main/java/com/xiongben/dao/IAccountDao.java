package com.xiongben.dao;

import com.xiongben.domain.Account;

import java.util.List;

public interface IAccountDao {
    void saveAccount(Account account);

    List<Account> findAllAccount();

    Account findAccountById(Integer accountId);

    void updateAccount(Account account);

    void deleteAccount(Integer accountId);

    Account findAccountByName(String accountName);
}
