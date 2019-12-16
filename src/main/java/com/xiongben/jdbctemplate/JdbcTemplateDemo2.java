package com.xiongben.jdbctemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class JdbcTemplateDemo2 {
    public static void main(String[] args) {
//          1,获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
//          2，获取对象
        JdbcTemplate jt = ac.getBean("jdbcTemplate",JdbcTemplate.class);
//        3,执行操作
        jt.execute("insert into account (ID, UID, MONEY) VALUES (6,56,5500)");

    }
}
