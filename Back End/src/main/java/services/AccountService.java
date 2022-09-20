package services;

import models.Account;

import java.util.List;

public interface AccountService {

    Account addAccount(Account accObj);
    Account getAccount(Account accObj);
    List<Account> getAllAccounts();
    Account updateAccount(Account accObj);
    Account deleteAccount(Account accObj);

}
