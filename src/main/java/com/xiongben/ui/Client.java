package com.xiongben.ui;

import com.xiongben.service.IAccountService;
import com.xiongben.service.impl.AccountServiceImpl;

public class Client {
    public static void main(String[] args) {
        IAccountService as = new AccountServiceImpl();
        as.saveAccount();
    }
}
