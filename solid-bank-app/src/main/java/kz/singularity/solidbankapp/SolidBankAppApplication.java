package kz.singularity.solidbankapp;


import kz.singularity.solidbankapp.model.AccountBasicCLI;
import kz.singularity.solidbankapp.service.MyCLI;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SolidBankAppApplication {

    public static void main(String[] args) {
        boolean running = true;
        String clientID = "1";
        ApplicationContext context = new ClassPathXmlApplicationContext("props.xml");
        String helpMessage = "1 - show accounts\n2 - create account\n3 - deposit\n4 - withdraw\n5 - transfer\n6 - this message\n7 - exit\n";

        System.out.printf("Welcome to CLI bank service\n");
        System.out.printf("Enter operation number: \n");
        System.out.printf(helpMessage);
        while (running) {
            try {
                AccountBasicCLI accountBasicCLI = context.getBean(AccountBasicCLI.class);
                MyCLI myCLI = context.getBean(MyCLI.class);

                switch (myCLI.getScanner().nextLine()) {

                    case "1":
                        accountBasicCLI.getAccounts(clientID);
                        break;

                    case "2":
                        System.out.println("Choose account type: [ CHECKING, SAVING, FIXED ]");
                        accountBasicCLI.createAccountRequest(myCLI.requestAccountType(), clientID);
                        break;

                    case "6":
                        System.out.printf(helpMessage);
                        break;

                    case "7":
                        System.out.printf("Application Closed\n");
                        running = false;
                        break;

                    default:
                        System.out.printf("Command not recognized!\n");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Wrong input " + e.getMessage());
            }
        }
    }

        }

