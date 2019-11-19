package com.xiongben.service.impl;

import com.xiongben.dao.IAccountDao;
import com.xiongben.dao.impl.AccountDaoImpl;
import com.xiongben.factory.BeanFactory;
import com.xiongben.service.IAccountService;

import java.util.Date;

public class AccountServiceImpl implements IAccountService {
//    private IAccountDao accountdao = (IAccountDao) BeanFactory.getBean("accountDao");
//    private IAccountDao accountdao;

    private String name;
    private Integer age;
    private Date birthday;

    public AccountServiceImpl(String name,Integer age,Date birthday){
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public void saveAccount() {
        System.out.println("service中的saveAccount方法执行了,,," + name + "," + age + "," + birthday);
    }

//    public void init(){
//        System.out.println("对象初始化了，，，，，，");
//    }
//
//    public void destroy(){
//        System.out.println("对象销毁了，，，，，");
//    }
}
