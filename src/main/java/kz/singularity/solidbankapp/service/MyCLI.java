package kz.singularity.solidbankapp.service;

import kz.singularity.solidbankapp.model.AccountType;
import kz.singularity.solidbankapp.model.CLIUI;

import java.util.Scanner;

public class MyCLI implements CLIUI {
    private Scanner scanner;
    MyCLI() {
        this.scanner = new Scanner(System.in);
    }

    double requestClientAmount() {
        return 0;
    }

    String requestClientAmountNumber() {
        return null;
    }

    public AccountType requestAccountType() {
        return AccountType.valueOf(scanner.nextLine());
    }

    public Scanner getScanner() {
        return scanner;
    }
}
