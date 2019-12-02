package com.xiongben.ui;

import com.xiongben.domain.Account;
import com.xiongben.factory.BeanFactory;
import com.xiongben.service.IAccountService;
import config.SpringConfiguration;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfiguration.class)
public class ClientTest {
    private ApplicationContext ac;

    @Autowired
    private IAccountService as;

    @Autowired
    @Qualifier("accountServiceproxy")
    private  IAccountService asf;

//    @Before
//    public void init(){
//         ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
//        //2.得到业务层对象
//         as = ac.getBean("accountService",IAccountService.class);
//    }

    @Test
    public void testFindAll() {
        //1.获取容易
//        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");

        //3.执行方法
//        List<Account> accounts = as.findAllAccount();

//        IAccountService asf = (IAccountService) BeanFactory.getBean("accountServiceproxy");
        List<Account> accounts = asf.findAllAccount();
        for(Account account : accounts){
            System.out.println(account);
        }
    }

    @Test
    public void testTransfer(){
        as.transfer("aaa","bbb",100f);
    }

}