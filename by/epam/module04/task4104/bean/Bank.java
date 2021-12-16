package by.epam.module04.task4104.bean;

//4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
//счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
//всем счетам, имеющим положительный и отрицательный балансы отдельно.

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Bank {
    private String name;
    private Set<Client> clients;

    public Bank(String name, Set<Client> clients) {
        this.name = name;
        this.clients = clients;
    }

    public Bank(String name) {
        this.name = name;
        clients = new HashSet<>();
    }

    public Bank() {
        this.name = null;
        clients = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Client> getClients() {
        return clients;
    }

    public void setClients(Set<Client> clients) {
        this.clients = clients;
    }

    public void addClient(Client client) {
        this.clients.add(client);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", clients=" + clients +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bank)) return false;
        Bank bank = (Bank) o;
        return Objects.equals(name, bank.name) &&
                Objects.equals(clients, bank.clients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, clients);
    }
}
