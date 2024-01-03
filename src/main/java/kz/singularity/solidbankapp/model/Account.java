package kz.singularity.solidbankapp.model;
import java.lang.String;


public class Account {

    private AccountType accountType;
    private String id;
    private String clientID;
    private double balance;
    private boolean withdrawAllowed;

    public Account() {
    }

    public Account(AccountType accountType, String id, String clientID,
                   double balance, boolean withdrawAllowed) {
        this.accountType = accountType;
        this.id = id;
        this.clientID = clientID;
        this.balance = balance;
        this.withdrawAllowed = withdrawAllowed;
    }

    public double getBalance() {
        return balance;
    }

    public String getClientID() {
        return clientID;
    }

    public boolean isWithdrawAllowed() {
        return withdrawAllowed;
    }

    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    public void setWithdrawAllowed(boolean withdrawAllowed) {
        this.withdrawAllowed = withdrawAllowed;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {

        String accountNumber = String.format("%03d%06d", 1, Integer.parseInt(id));
        return "Account{" +
                "accountType=" + accountType +
                ", id='" + accountNumber + '\'' +
                ", clientID='" + clientID + '\'' +
                ", balance=" + balance +
                ", withdrawAllowed=" + withdrawAllowed +
                '}';

    }
}

