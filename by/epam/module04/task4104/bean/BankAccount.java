package by.epam.module04.task4104.bean;

//4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
//счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
//всем счетам, имеющим положительный и отрицательный балансы отдельно.


import java.io.Serializable;
import java.util.Objects;

public class BankAccount implements Serializable {
   // private static long currentNumber = 7487000000000001L;
    private long number;
    private int clientId;
    private long balance;//in kopecks
    private boolean isBlocked = false;

    public BankAccount() {
    }

    public BankAccount(long number, int clientId) {
        this.number = number;
        this.clientId = clientId;
        this.balance = 0;
    }

    public BankAccount(long number, int clientId, long balance) {
        this.number = number;
        this.clientId = clientId;
        this.balance = balance;
    }

    public BankAccount(long number, int clientId, long balance, boolean isBlocked) {
        this.number = number;
        this.clientId = clientId;
        this.balance = balance;
        this.isBlocked = isBlocked;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "number=" + number +
                ", clientId=" + clientId +
                ", balance=" + balance +
                ", isBlocked=" + isBlocked +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BankAccount)) return false;
        BankAccount that = (BankAccount) o;
        return number == that.number &&
                clientId == that.clientId &&
                balance == that.balance &&
                isBlocked == that.isBlocked;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, clientId, balance, isBlocked);
    }
}
