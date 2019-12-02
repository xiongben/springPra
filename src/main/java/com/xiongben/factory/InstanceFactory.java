package com.xiongben.factory;

import com.xiongben.service.IAccountService;
import com.xiongben.service.impl.AccountServiceImpl;
import com.xiongben.utils.TransactionManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;

import java.lang.reflect.Method;

public class InstanceFactory {
    @Autowired
    private IAccountService accountService;
    @Autowired
    private TransactionManager txManager;

    public IAccountService getAccountService() {
        return (IAccountService) Proxy.newProxyInstance(accountService.getClass().getClassLoader(),
                accountService.getClass().getInterfaces(),
                new InvocationHandler() {
                    public Object invoke(Object o, Method method, Object[] args) throws Throwable {
                        return null;
//                            if("test".equals(method.getName())){
//                                return method.invoke(accountService,args);
//                            }
//
//                            Object rtValue = null;
//                            try {
//                                //1.开启事务
//                                txManager.beginTransaction();
//                                //2.执行操作
//                                rtValue = method.invoke(accountService, args);
//                                //3.提交事务
//                                txManager.commit();
//                                //4.返回结果
//                                return rtValue;
//                            } catch (Exception e) {
//                                //5.回滚操作
//                                txManager.rollback();
//                                throw new RuntimeException(e);
//                            } finally {
//                                //6.释放连接
//                                txManager.release();
//                            }

                    }
                }
        );

    }



//    public IAccountService getAccountService(){
//        return new AccountServiceImpl();
//    }
}
