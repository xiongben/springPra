package com.xiongben.jdbctemplate;

import com.xiongben.dao.IAccountDao;
import com.xiongben.domain.Account;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcTemplateDemo3 {
    public static void main(String[] args) {
//          1,获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
//          2，获取对象
//        JdbcTemplate jt = ac.getBean("jdbcTemplate",JdbcTemplate.class);
//        3,执行操作
//        jt.execute("insert into account (ID, UID, MONEY) VALUES (6,56,5500)");

//          jt.update("update account set MONEY=? where id=?",6666,6);

        IAccountDao accountdao = ac.getBean("accountDao",IAccountDao.class);
        Account account = accountdao.findAccountById(1);
        System.out.println(account);
        account.setMoney(6666F);
        accountdao.updateAccount(account);
    }
}
