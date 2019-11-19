package com.xiongben.service.impl;

import com.xiongben.dao.IAccountDao;
import com.xiongben.dao.impl.AccountDaoImpl;
import com.xiongben.factory.BeanFactory;
import com.xiongben.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service("accountService")
public class AccountServiceImpl implements IAccountService {
//    private IAccountDao accountdao = (IAccountDao) BeanFactory.getBean("accountDao");

    @Autowired
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
}
