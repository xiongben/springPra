package com.xiongben.ui;

import com.xiongben.dao.IAccountDao;
import com.xiongben.factory.BeanFactory;
import com.xiongben.service.IAccountService;
import com.xiongben.service.impl.AccountServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
        IAccountService as = (IAccountService)ac.getBean("accountService3");
        as.saveAccount();
//        System.out.println(as);
    }
}
