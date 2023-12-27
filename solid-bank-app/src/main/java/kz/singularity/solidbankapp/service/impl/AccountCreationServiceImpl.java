package kz.singularity.solidbankapp.service.impl;

import kz.singularity.solidbankapp.DAO.AccountDAO;
import kz.singularity.solidbankapp.model.AccountType;
import kz.singularity.solidbankapp.model.CheckingAccount;
import kz.singularity.solidbankapp.model.FixedAccount;
import kz.singularity.solidbankapp.model.SavingAccount;
import kz.singularity.solidbankapp.service.AccountCreationService;

import java.util.Locale;

public class AccountCreationServiceImpl implements AccountCreationService {
    AccountDAO accountDAO;

    public AccountCreationServiceImpl(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    public void create(AccountType accountType, long bankID, String clientID, String accountID) {
        switch (accountType) {
            case CHECKING -> accountDAO.createNewAccount(new CheckingAccount(accountType, accountID, clientID, 0.0, true));
            case SAVING -> accountDAO.createNewAccount(new SavingAccount(accountType, accountID, clientID, 0.0, true));
            case FIXED -> accountDAO.createNewAccount(new FixedAccount(accountType, accountID, clientID, 0.0, true));
            default -> System.out.println("wrong input ");

        }
    }
}
