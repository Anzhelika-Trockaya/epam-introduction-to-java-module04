package by.epam.module04.task4104.bean;

//4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
//счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
//всем счетам, имеющим положительный и отрицательный балансы отдельно.

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Client {
    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private LocalDate bd;
    private Set<BankAccount> accounts;


    public Client(){
        accounts = new HashSet<>();
    }

    public Client(String surname, String name, String patronymic, LocalDate bd) {
        this.id = 0;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.bd = bd;
        accounts = new HashSet<>();
    }

    public Client(int id, String surname, String name, String patronymic, LocalDate bd) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.bd = bd;
        accounts = new HashSet<>();
    }

    public Client(int id, String surname, String name, String patronymic, LocalDate bd, Set<BankAccount> accounts) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.bd = bd;
        this.accounts=accounts;
    }

    public int getId() {
        return id;
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public LocalDate getBd() {
        return bd;
    }

    public void setBd(LocalDate bd) {
        this.bd = bd;
    }

    public Set<BankAccount> getAccounts() {
        return accounts;
    }

    public void setAccounts(Set<BankAccount> accounts) {
        this.accounts = accounts;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", bd=" + bd +
                ", accounts=" + accounts +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client)) return false;
        Client client = (Client) o;
        return id == client.id &&
                Objects.equals(surname, client.surname) &&
                Objects.equals(name, client.name) &&
                Objects.equals(patronymic, client.patronymic) &&
                Objects.equals(bd, client.bd) &&
                Objects.equals(accounts, client.accounts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, surname, name, patronymic, bd, accounts);
    }
}
