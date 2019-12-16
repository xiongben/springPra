package com.xiongben.dao.impl;

import com.xiongben.dao.IAccountDao;
import com.xiongben.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;


public class AccountDaoImpl2 extends JdbcDaoSupport implements IAccountDao {



    public Account findAccountById(Integer accountId) {
        List<Account> accounts = getJdbcTemplate().query("select * from account where ID = ?",new BeanPropertyRowMapper<Account>(Account.class),accountId);
        return accounts.isEmpty()?null:accounts.get(0);
    }

    public void updateAccount(Account account) {
        getJdbcTemplate().update("update account set MONEY=? where ID=?",account.getMoney(),account.getId());
    }


}
