package by.epam.module04.task4104.logic;

import by.epam.module04.task4104.BankException;
import by.epam.module04.task4104.bean.BankAccount;

import java.util.ArrayList;
import java.util.List;

public class ClientLogic {

    public List<BankAccount> getAccountsInAscendingOrderOfBalance(int clientId) throws BankException {
        List<BankAccount> sortedAccounts;
        BankAccount temp;
        BankLogic bankLogic;

        bankLogic = new BankLogic();

        if (bankLogic.isExistsClient(clientId)) {
            sortedAccounts = new ArrayList<>(bankLogic.getClient(clientId).getAccounts());

            for (int i = 0; i < sortedAccounts.size() - 1; i++) {
                for (int j = i + 1; j < sortedAccounts.size(); j++) {
                    if (sortedAccounts.get(j).getBalance() < sortedAccounts.get(i).getBalance()) {
                        temp = sortedAccounts.get(i);
                        sortedAccounts.set(i, sortedAccounts.get(j));
                        sortedAccounts.set(j, temp);
                    }
                }
            }

            return sortedAccounts;
        } else {
            throw new BankException("Client with id " + clientId + " is not exist!");
        }
    }

    public List<BankAccount> getAccountsInDescendingOrderOfBalance(int clientId) throws BankException {
        List<BankAccount> sortedAccounts;
        BankAccount temp;
        BankLogic bankLogic;

        bankLogic = new BankLogic();

        if (bankLogic.isExistsClient(clientId)) {
            sortedAccounts = new ArrayList<>(bankLogic.getClient(clientId).getAccounts());

            for (int i = 0; i < sortedAccounts.size() - 1; i++) {
                for (int j = i + 1; j < sortedAccounts.size(); j++) {
                    if (sortedAccounts.get(j).getBalance() > sortedAccounts.get(i).getBalance()) {
                        temp = sortedAccounts.get(i);
                        sortedAccounts.set(i, sortedAccounts.get(j));
                        sortedAccounts.set(j, temp);
                    }
                }
            }

            return sortedAccounts;
        } else {
            throw new BankException("Client with id " + clientId + " is not exist!");
        }
    }


    public long getSumOfAccounts(int clientId) throws BankException {
        long sum = 0;
        BankLogic bankLogic;

        bankLogic = new BankLogic();

        if (bankLogic.isExistsClient(clientId)) {
            for (BankAccount account : bankLogic.getClient(clientId).getAccounts()) {
                sum += account.getBalance();
            }

            return sum;
        } else {
            throw new BankException("Client with id " + clientId + " is not exist!");
        }
    }

    public long getSumOfAccountsWithPositiveBalance(int clientId) throws BankException {
        long sum = 0;
        BankLogic bankLogic;

        bankLogic = new BankLogic();

        if (bankLogic.isExistsClient(clientId)) {
            for (BankAccount account : bankLogic.getClient(clientId).getAccounts()) {
                if (account.getBalance() > 0) {
                    sum += account.getBalance();
                }
            }

            return sum;
        } else {
            throw new BankException("Client with id " + clientId + " is not exist!");
        }
    }

    public long getSumOfAccountsWithNegativeBalance(int clientId) throws BankException {
        long sum = 0;
        BankLogic bankLogic;

        bankLogic = new BankLogic();

        if (bankLogic.isExistsClient(clientId)) {
            for (BankAccount account : bankLogic.getClient(clientId).getAccounts()) {
                if (account.getBalance() < 0) {
                    sum += account.getBalance();
                }
            }

            return sum;
        } else {
            throw new BankException("Client with id " + clientId + " is not exist!");
        }
    }
}
