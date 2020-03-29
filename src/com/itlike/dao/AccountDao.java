package com.itlike.dao;

import com.itlike.domain.Account;

import java.util.List;

/**
 * @author Administrator
 */
public interface AccountDao {
    /**
     * this is account save method
     * @param account
     */
    public void save(Account account);
    /**
     * this is account save method
     * @param account
     */
    public void update(Account account);
    /**
     * this is account save method
     * @param account
     */
    public void delete(Account account);
    /**
     * this is account save method
     * @param id
     * @return
     */
    public Account getById(Integer id);

    /**
     * this is select all account
     * @return
     */
    public List<Account> getAllAccount();
}
