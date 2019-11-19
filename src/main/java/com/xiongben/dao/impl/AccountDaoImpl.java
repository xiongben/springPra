package com.xiongben.dao.impl;

import com.xiongben.dao.IAccountDao;
import org.springframework.stereotype.Repository;

@Repository("accountDao1")
public class AccountDaoImpl implements IAccountDao {
    public void saveAccount() {
        System.out.println("保存了账户111111");
    }
}
