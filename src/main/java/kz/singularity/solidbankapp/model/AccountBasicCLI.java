package kz.singularity.solidbankapp.model;

import kz.singularity.solidbankapp.service.AccountListingService;
import kz.singularity.solidbankapp.service.BankCore;

public class AccountBasicCLI implements CreateAccountOperationUI{

    CreateAccountOperationUI createAccountOperationUI;
    BankCore bankCore;
    AccountListingService accountListingService;

    @Override
    public AccountType requestAccountType() {
        return null;
    }

    public AccountBasicCLI(CreateAccountOperationUI createAccountOperationUI, BankCore bankCore,
                           AccountListingService accountListingService) {
        this.createAccountOperationUI = createAccountOperationUI;
        this.bankCore = bankCore;
        this.accountListingService = accountListingService;
    }

    public void createAccountRequest(AccountType accountType, String clientID) {
        bankCore.createNewAccount(accountType, clientID);

    }

    public void getAccounts(String clientID) {
        System.out.println(accountListingService.getClientAccounts(clientID));
    }
}

