package com.xiongben.service.impl;

import com.xiongben.dao.IAccountDao;
import com.xiongben.domain.Account;
import com.xiongben.service.IAccountService;

import java.util.List;

public class AccountServiceImpl implements IAccountService {
    private IAccountDao accountDao;

    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public List<Account> findAllAccount() {
        return accountDao.findAllAccount();
    }

    public Account findAccountById(Integer accountId) {
        return null;
    }

    public void saveAccount(Account account) {

    }

    public void updateAccount(Account account) {

    }

    public void deleteAccount(Integer acccountId) {

    }

    public void transfer(String sourceName, String targetName, Float money) {

    }
}
