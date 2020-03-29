package com.itlike.domain;

import com.itlike.dao.AccountDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author Administrator
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class AccountDaoTest {
    @Resource(name = "accountDao")
    private AccountDao accountDao;

    @Test
    public void test(){
        Account id = accountDao.getById(5);
        System.out.println(id);
        id.setMoney(43.3);
        accountDao.update(id);
    }

}
