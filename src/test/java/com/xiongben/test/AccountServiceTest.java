package com.xiongben.test;


import com.xiongben.domain.Account;
import com.xiongben.service.IAccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:bean.xml")
public class AccountServiceTest {
    @Autowired
    private IAccountService as;

    @Test
    public void testfun(){
        List<Account> accounts =  as.findAllAccount();
        for (Account account: accounts){
            System.out.println(accounts.toString());
        }
    }
}
