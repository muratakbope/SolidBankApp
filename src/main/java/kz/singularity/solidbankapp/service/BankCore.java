package kz.singularity.solidbankapp.service;

import kz.singularity.solidbankapp.model.AccountType;

public class BankCore {
    static long id = 1;
    long lastAccountNumber = 1;
    AccountCreationService accountCreation;

    public BankCore(AccountCreationService accountCreation) {
        this.accountCreation = accountCreation;
    }

    public void createNewAccount(AccountType accountType, String clientID) {
        accountCreation.create(accountType, id, clientID, String.valueOf(lastAccountNumber));
        this.incrementLastAccountNumber();
    }

    void incrementLastAccountNumber(){
        lastAccountNumber++;

    }

}
