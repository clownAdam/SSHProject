package com.itlike.service;

import com.itlike.dao.AccountDao;
import com.itlike.domain.Account;

/**
 * @author Administrator
 */
public class AccountServiceImpl implements AccountService {
    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void save(Account account) {
        System.out.println("已经来到业务类："+account);
        //调用dao层保存到数据库中
        accountDao.save(account);
    }
}
