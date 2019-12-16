package com.xiongben.dao;

import com.xiongben.domain.Account;

public interface IAccountDao {
    /**
     * 根据id查询账户
     * @param accountId
     * @return
     */
   Account findAccountById(Integer accountId);


    /**
     * 更新账户
     * @param account
     */
   void updateAccount(Account account);
}
