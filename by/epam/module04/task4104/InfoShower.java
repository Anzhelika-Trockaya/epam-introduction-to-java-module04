package by.epam.module04.task4104;

import by.epam.module04.task4104.bean.BankAccount;

import java.util.List;

public class InfoShower {
    public void printAccounts(String message, List<BankAccount> accounts) {
        String format;
        String line;
        String isBlockedString;

        format = " %17s | %16s | %10s | %s";
        line = "-------------------------------------------------";

        System.out.println(message);

        System.out.printf(format, "Account", "Balance", "Status", "\n");
        System.out.println(line);

        for (BankAccount account : accounts) {
            isBlockedString = account.isBlocked() ? "blocked" : "available";

            System.out.printf(format
                    , "№" + account.getNumber()
                    , ConverterUtil.longToDoubleString(account.getBalance())
                    , isBlockedString
                    , "\n");
        }
    }

    public void printMessage(String message) {
        System.out.println(message);
    }


}
