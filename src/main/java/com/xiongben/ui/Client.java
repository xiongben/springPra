package com.xiongben.ui;

import com.xiongben.factory.BeanFactory;
import com.xiongben.service.IAccountService;
import com.xiongben.service.impl.AccountServiceImpl;

public class Client {
    public static void main(String[] args) {
//        IAccountService as = new AccountServiceImpl();
//        IAccountService as = (IAccountService) BeanFactory.getBean("accountService");
//        as.saveAccount();
        for(int i=0;i<5;i++) {
            IAccountService as = (IAccountService) BeanFactory.getBean("accountService");
            System.out.println(as);
            as.saveAccount();
        }
    }
}
