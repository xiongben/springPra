package com.xiongben.service.impl;

import com.xiongben.dao.IAccountDao;
import com.xiongben.dao.impl.AccountDaoImpl;
import com.xiongben.factory.BeanFactory;
import com.xiongben.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import java.util.Date;

@Service("accountService")
//@Scope("prototype")
public class AccountServiceImpl implements IAccountService {
//    private IAccountDao accountdao = (IAccountDao) BeanFactory.getBean("accountDao");

//    @Autowired
//    @Qualifier("accountDao1")
    @Resource(name = "accountDao1")
    private IAccountDao accountdao;


    public void saveAccount() {
        accountdao.saveAccount();
        System.out.println("service中的saveAccount方法执行了,,,");
    }

//    public void init(){
//        System.out.println("对象初始化了，，，，，，");
//    }
//
//    public void destroy(){
//        System.out.println("对象销毁了，，，，，");
//    }

    @PostConstruct
    public void  init(){
        System.out.println("初始化方法执行了");
    }

    @PreDestroy
    public void  destroy(){
        System.out.println("销毁方法执行了");
    }
}
