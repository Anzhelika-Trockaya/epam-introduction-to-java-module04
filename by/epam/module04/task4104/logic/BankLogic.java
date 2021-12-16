package by.epam.module04.task4104.logic;

import by.epam.module04.task4104.BankException;
import by.epam.module04.task4104.ConverterUtil;
import by.epam.module04.task4104.bean.BankAccount;
import by.epam.module04.task4104.BankData;
import by.epam.module04.task4104.bean.Client;

public class BankLogic {
    private final BankData bankData = BankData.getInstance();

    public boolean isExistsClient(int id) {
        for (Client client : bankData.getBank().getClients()) {
            if (id == client.getId()) {
                return true;
            }
        }
        return false;
    }

    public boolean isExistsAccount(int clientId, long number) {
        if (!isExistsClient(clientId)) {
            return false;
        }

        for (BankAccount account : getClient(clientId).getAccounts()) {
            if (number == account.getNumber()) {
                return true;
            }
        }

        return false;
    }

    public Client getClient(int id) {
        for (Client client : bankData.getBank().getClients()) {
            if (id == client.getId()) {
                return client;
            }
        }
        return null;
    }

    public BankAccount getAccount(int clientId, long number) throws BankException {
        if (isExistsClient(clientId)) {
            for (BankAccount account : getClient(clientId).getAccounts()) {
                if (account.getNumber() == number) {
                    return account;
                }
            }
            return null;
        } else {
            throw new BankException("Client with id " + clientId + " is not exist");
        }
    }


    public void putMoneyToAccount(int clientId, long number, double amount) throws BankException {
        BankAccount bankAccount;
        long newBalance;

        if (amount > 0) {
            if (isExistsAccount(clientId, number)) {
                bankAccount = getAccount(clientId, number);

                if (!bankAccount.isBlocked()) {
                    newBalance = bankAccount.getBalance() + ConverterUtil.convertDoubleAmountToLongKopecks(amount);
                    bankAccount.setBalance(newBalance);
                } else {
                    throw new BankException("Account " + number + " is blocked!");
                }
            } else {
                throw new BankException("Account is not exist!");
            }
        } else {
            throw new BankException("Incorrect amount");
        }
    }

    public void withdrawMoneyFromAccount(int clientId, long number, double amount) throws BankException {
        BankAccount bankAccount;
        long newBalance;

        if (amount > 0) {
            if (isExistsAccount(clientId, number)) {
                bankAccount = getAccount(clientId, number);

                if (!bankAccount.isBlocked()) {

                    if (bankAccount.getBalance() >= amount) {
                        newBalance = bankAccount.getBalance() - ConverterUtil.convertDoubleAmountToLongKopecks(amount);
                        bankAccount.setBalance(newBalance);
                    } else {
                        throw new BankException("Not enough money!");
                    }

                } else {
                    throw new BankException("Account " + number + " is blocked!");
                }
            } else {
                throw new BankException("Account is not exist!");
            }
        } else {
            throw new BankException("Incorrect amount");
        }
    }

    public void blockAccount(int clientId, long number) throws BankException {
        BankAccount bankAccount;

        if (isExistsAccount(clientId, number)) {
            bankAccount = getAccount(clientId, number);

            if (!bankAccount.isBlocked()) {
                bankAccount.setBlocked(true);
            } else {
                throw new BankException("Account " + number + " is already blocked!");
            }
        } else {
            throw new BankException("Account is not exist!");
        }
    }

    public void unblockAccount(int clientId, long number) throws BankException {
        BankAccount bankAccount;

        if (isExistsAccount(clientId, number)) {
            bankAccount = getAccount(clientId, number);

            if (bankAccount.isBlocked()) {
                bankAccount.setBlocked(false);
            } else {
                throw new BankException("Account " + number + " is not blocked!");
            }
        } else {
            throw new BankException("Account is not exist!");
        }
    }
}
