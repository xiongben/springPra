package com.xiongben.service.impl;

import com.xiongben.dao.IAccountDao;
import com.xiongben.dao.impl.AccountDaoImpl;
import com.xiongben.domain.Account;
import com.xiongben.factory.BeanFactory;
import com.xiongben.service.IAccountService;
import com.xiongben.utils.TransactionManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service("accountService")
//@Scope("prototype")
public class AccountServiceImpl implements IAccountService {
//    private IAccountDao accountdao = (IAccountDao) BeanFactory.getBean("accountDao");

//    @Autowired
//    @Qualifier("accountDao1")
    @Resource(name = "accountDao1")
    private IAccountDao accountdao;
    @Autowired
    private TransactionManager txmanager;

    public void setTxmanager(TransactionManager txmanager) {
        this.txmanager = txmanager;
    }



    public void setAccountdao(IAccountDao accountdao){
        this.accountdao = accountdao;
    }

    public List<Account> findAllAccount() {
        try {
            txmanager.beginTransaction();
            List<Account> accounts = accountdao.findAllAccount();
            txmanager.commit();
            return accounts;
        }catch (Exception e){
            txmanager.rollback();
            throw new RuntimeException(e);
        }finally {
            txmanager.release();
        }
//        return accountdao.findAllAccount();
    }

    public Account findAccountById(Integer accountId) {
        try {
            txmanager.beginTransaction();
            Account account = accountdao.findAccountById(accountId);
            txmanager.commit();
            return account;
        }catch (Exception e){
            txmanager.rollback();
            throw new RuntimeException(e);
        }finally {
            txmanager.release();
        }
//        return accountdao.findAccountById(accountId);
    }

    public void saveAccount(Account account) {
        try {
            txmanager.beginTransaction();
            accountdao.saveAccount(account);
            txmanager.commit();
        }catch (Exception e){
            txmanager.rollback();
            throw new RuntimeException(e);
        }finally {
            txmanager.release();
        }
//         accountdao.saveAccount(account);
    }

    public void updateAccount(Account account) {
        try {
            txmanager.beginTransaction();
            accountdao.updateAccount(account);
            txmanager.commit();
        }catch (Exception e){
            txmanager.rollback();
            throw new RuntimeException(e);
        }finally {
            txmanager.release();
        }
//        accountdao.updateAccount(account);
    }

    public void deleteAccount(Integer acccountId) {
        try {
            txmanager.beginTransaction();
            accountdao.deleteAccount(acccountId);
            txmanager.commit();
        }catch (Exception e){
            txmanager.rollback();
            throw new RuntimeException(e);
        }finally {
            txmanager.release();
        }
//        accountdao.deleteAccount(acccountId);
    }

    public void transfer(String sourceName, String targetName, Float money) {
        try {
            txmanager.beginTransaction();
            Account source = accountdao.findAccountByName(sourceName);
            Account target = accountdao.findAccountByName(targetName);
            source.setMoney(source.getMoney()-money);
            target.setMoney(target.getMoney()+money);
            accountdao.updateAccount(source);
//            int i=1/0;
            accountdao.updateAccount(target);
            txmanager.commit();
        }catch (Exception e){
            txmanager.rollback();
            e.printStackTrace();
            throw new RuntimeException(e);
        }finally {
            txmanager.release();
        }
//        Account source = accountdao.findAccountByName(sourceName);
//        Account target = accountdao.findAccountByName(targetName);
//        source.setMoney(source.getMoney()-money);
//        target.setMoney(target.getMoney()+money);
//        accountdao.updateAccount(source);
//        accountdao.updateAccount(target);
    }

    //    public void saveAccount() {
//        accountdao.saveAccount();
//        System.out.println("service中的saveAccount方法执行了,,,");
//    }

//    public void init(){
//        System.out.println("对象初始化了，，，，，，");
//    }
//
//    public void destroy(){
//        System.out.println("对象销毁了，，，，，");
//    }

//    @PostConstruct
//    public void  init(){
//        System.out.println("初始化方法执行了");
//    }
//
//    @PreDestroy
//    public void  destroy(){
//        System.out.println("销毁方法执行了");
//    }
}
