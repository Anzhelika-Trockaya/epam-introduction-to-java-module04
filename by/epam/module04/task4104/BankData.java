package by.epam.module04.task4104;

import by.epam.module04.task4104.bean.Bank;
import by.epam.module04.task4104.bean.BankAccount;
import by.epam.module04.task4104.bean.Client;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class BankData {
    private static final BankData instance= new BankData();
    private final Bank bank;

    private BankData() {
        Set<BankAccount> accounts;

        accounts=new HashSet<>();
        bank = new Bank("BELARUSBANK");

        bank.addClient(new Client(1, "Trotskaya", "Anzhelika", "Viktorovna",
                LocalDate.of(1993, 2, 24)));
        bank.addClient(new Client(2, "Zayats", "Elena", "Valerievna",
                LocalDate.of(1993, 2, 7)));

        accounts.add(new BankAccount(7487000000000001L, 1, -3501151));
        accounts.add(new BankAccount(7487000000000002L,1, 500000000, true));
        accounts.add(new BankAccount(7487000000000003L,1, 30012501));
        accounts.add(new BankAccount(7487000000000004L,1, -125));
        accounts.add(new BankAccount(7487000000000005L,1, -511));
        accounts.add(new BankAccount(7487000000000006L,1, 8702414));
        accounts.add(new BankAccount(7487000000000007L,1, 4205999));
        accounts.add(new BankAccount(7487000000000010L,1, -100));
        accounts.add(new BankAccount(7487000000000012L,2, 450));
        accounts.add(new BankAccount(7487000000000120L,2, -1000));

        for(Client client: bank.getClients()){
            for(BankAccount account: accounts){
                if(client.getId()==account.getClientId()){
                    client.addAccount(account);
                }
            }
        }
    }

    public Bank getBank(){
        return bank;
    }

    public static BankData getInstance(){
        return instance;
    }

    public int getCurrentID(){
        return 2;
    }

    public long getCurrentAccountNumber(){
        return 7487000000000123L;
    }
}
