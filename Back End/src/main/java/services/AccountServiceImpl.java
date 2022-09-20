package services;

import models.Account;
import repositories.AccountRepoImpl;

import java.util.List;

public class AccountServiceImpl implements AccountService {

    private AccountRepoImpl accRep;

    public AccountServiceImpl(AccountRepoImpl accRep) {this.accRep = accRep;}

    @Override
    public Account addAccount(Account accObj) {
        return accRep.addAccount(accObj);
    }

    @Override
    public Account getAccount(Account accObj) {
        return accRep.getAccount(accObj);
    }

    @Override
    public List<Account> getAllAccounts() {
        return accRep.getAllAccounts();
    }

    @Override
    public Account updateAccount(Account accObj) {
        return accRep.updateAccount(accObj);
    }

    @Override
    public Account deleteAccount(Account accObj) {
        return accRep.deleteAccount(accObj);
    }
}
