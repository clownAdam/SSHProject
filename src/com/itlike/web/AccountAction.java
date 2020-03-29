package com.itlike.web;

import com.itlike.domain.Account;
import com.itlike.service.AccountService;
import com.itlike.service.AccountServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.ServletActionContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;

/**
 * @author Administrator
 */
public class AccountAction extends ActionSupport implements ModelDriven<Account> {
    private Account account = new Account();

    @Override
    public Account getModel() {
        return account;
    }
    AccountService accountService;

    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }

    public String save(){
        System.out.println("AccountAction--->save");
        System.out.println(account);

//        AccountService accountService = new AccountServiceImpl();
//        accountService.save(account);
        /*ServletContext servletContext = ServletActionContext.getServletContext();
        WebApplicationContext applicationContext = WebApplicationContextUtils.getWebApplicationContext(servletContext);
        AccountService accountService = (AccountService) applicationContext.getBean("accountService");
        accountService.save(account);
        System.out.println("hello");*/
        accountService.save(account);
        System.out.println("========fefefe======");
        return null;
    }
}
