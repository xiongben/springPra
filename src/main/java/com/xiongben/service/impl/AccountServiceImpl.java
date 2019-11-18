package com.xiongben.service.impl;

import com.xiongben.dao.IAccountDao;
import com.xiongben.dao.impl.AccountDaoImpl;
import com.xiongben.factory.BeanFactory;
import com.xiongben.service.IAccountService;

public class AccountServiceImpl implements IAccountService {
    private IAccountDao accountdao = (IAccountDao) BeanFactory.getBean("accountDao");

    public void saveAccount() {
        accountdao.saveAccount();
    }
}
