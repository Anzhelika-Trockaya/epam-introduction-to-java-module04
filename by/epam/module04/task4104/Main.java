package by.epam.module04.task4104;

//4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
//счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
//всем счетам, имеющим положительный и отрицательный балансы отдельно.

public class Main {
    public static void main(String[] args) {
        UserActionViewer viewer;

        viewer = new UserActionViewer();
        viewer.accountsInAscendingOrderOfBalance(1);
        viewer.blockAccount(1,7487000000000006L);
        viewer.accountsInDescendingOrderOfBalance(1);
        viewer.sumOfAccounts(2);
        viewer.putMoneyToAccount(2,7487000000000120L,300);
        viewer.sumOfAccounts(2);
        viewer.sumOfAccounts(1);
        viewer.sumOfAccountsWithPositiveBalance(1);
        viewer.sumOfAccountsWithNegativeBalance(1);
    }
}
