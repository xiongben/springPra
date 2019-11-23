package com.xiongben.ui;

import com.xiongben.dao.IAccountDao;
import com.xiongben.domain.Account;
import com.xiongben.factory.BeanFactory;
import com.xiongben.service.IAccountService;
import com.xiongben.service.impl.AccountServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Client {
    public static void main(String[] args) {
//        IAccountService as = new AccountServiceImpl();
//        IAccountService as = (IAccountService) BeanFactory.getBean("accountService");
//        as.saveAccount();
//        for(int i=0;i<5;i++) {
//            IAccountService as = (IAccountService) BeanFactory.getBean("accountService");
//            System.out.println(as);
//            as.saveAccount();
//        }

        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        IAccountService as = (IAccountService)ac.getBean("accountService");
        List<Account> accounts = as.findAllAccount();
        for(Account account:accounts){
            System.out.println(account);
        }
//        as.saveAccount();
//        System.out.println(as);
    }
}
