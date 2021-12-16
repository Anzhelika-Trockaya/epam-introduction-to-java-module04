package by.epam.module04.task4104;

import by.epam.module04.task4104.bean.BankAccount;
import by.epam.module04.task4104.bean.Client;
import by.epam.module04.task4104.logic.BankLogic;
import by.epam.module04.task4104.logic.ClientLogic;

import java.util.List;

public class UserActionViewer {
    private final ClientLogic clientLogic = new ClientLogic();
    private final BankLogic bankLogic = new BankLogic();
    private final InfoShower infoShower = new InfoShower();

    public UserActionViewer() {
    }

    public void putMoneyToAccount(int clientId, long number, double amount) {
        try {
            bankLogic.putMoneyToAccount(clientId, number, amount);
            infoShower.printMessage("Operation completed successfully.");
        } catch(BankException exception){
            infoShower.printMessage("The money no deposited!\n"+exception.getMessage());
        }
    }

    public void withdrawMoneyFromAccount(int clientId, long number, double amount){
        try{
            bankLogic.withdrawMoneyFromAccount(clientId, number, amount);
            infoShower.printMessage("Operation completed successfully.");
        }catch(BankException exception){
            infoShower.printMessage("The money has not been withdrawn!\n"+exception.getMessage());
        }
    }

    public void blockAccount(int clientId, long number){
        try{
            bankLogic.blockAccount(clientId, number);
            infoShower.printMessage("The account is blocked.");
        }catch(BankException exception){
            infoShower.printMessage("The account is not blocked!\n"+exception.getMessage());
        }
    }

    public void unblockAccount(int clientId, long number){
        try{
            bankLogic.unblockAccount(clientId, number);
            infoShower.printMessage("The account is unblocked.");
        }catch(BankException exception){
            infoShower.printMessage("The account is not unblocked!\n"+exception.getMessage());
        }
    }


    private String clientString(Client client) {
        return "Client №" + client.getId()
                + " | " + client.getSurname()
                + " " + client.getName()
                + " " + client.getPatronymic();
    }

    public void accountsInAscendingOrderOfBalance(int clientId) {
        List<BankAccount> sortedAccounts;
        String clientString;

        try {
            sortedAccounts = clientLogic.getAccountsInAscendingOrderOfBalance(clientId);
            clientString = clientString(bankLogic.getClient(clientId));

            if (sortedAccounts != null) {
                infoShower.printAccounts(
                        "Accounts of " + clientString + " in ascending order of balance:"
                        , sortedAccounts);
            } else {
                infoShower.printMessage("The client " + clientId + " has no accounts");
            }
        } catch (BankException exception) {
            infoShower.printMessage(exception.getMessage());
        }
    }

    public void accountsInDescendingOrderOfBalance(int clientId) {
        List<BankAccount> sortedAccounts;
        String clientString;

        try {
            sortedAccounts = clientLogic.getAccountsInDescendingOrderOfBalance(clientId);
            clientString = clientString(bankLogic.getClient(clientId));

            if (sortedAccounts != null) {
                infoShower.printAccounts(
                        "Accounts of " + clientString + " in descending order of balance:"
                        , sortedAccounts);
            } else {
                infoShower.printMessage("The client " + clientId + " has no accounts");
            }
        } catch (BankException exception) {
            infoShower.printMessage(exception.getMessage());
        }
    }

    public void sumOfAccounts(int clientId){
        long sum;

        try{
            sum=clientLogic.getSumOfAccounts(clientId);
            infoShower.printMessage("Sum of all accounts = "+ConverterUtil.longToDoubleString(sum));
        }catch(BankException exception){
            infoShower.printMessage(exception.getMessage());
        }
    }

    public void sumOfAccountsWithPositiveBalance(int clientId){
        long sum;

        try{
            sum=clientLogic.getSumOfAccountsWithPositiveBalance(clientId);
            infoShower.printMessage("Sum of all accounts with positive balance = "+ConverterUtil.longToDoubleString(sum));
        }catch(BankException exception){
            infoShower.printMessage(exception.getMessage());
        }
    }

    public void sumOfAccountsWithNegativeBalance(int clientId){
        long sum;

        try{
            sum=clientLogic.getSumOfAccountsWithNegativeBalance(clientId);
            infoShower.printMessage("Sum of all accounts with negative balance = "+ConverterUtil.longToDoubleString(sum));
        }catch(BankException exception){
            infoShower.printMessage(exception.getMessage());
        }
    }
}
