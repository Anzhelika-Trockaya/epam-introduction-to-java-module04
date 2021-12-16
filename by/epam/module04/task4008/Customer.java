package by.epam.module04.task4008;
//8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
//и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
//и методами. Задать критерии выбора данных и вывести эти данные на консоль.
//Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
//Найти и вывести:
//a) список покупателей в алфавитном порядке;
//b) список покупателей, у которых номер кредитной карточки находится в заданном интервале


import java.io.Serializable;
import java.util.Objects;

public class Customer implements Comparable<Customer>, Serializable {
    private static int currentId = 1;

    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private String address;
    private long creditCardNumber;
    private String bankAccountNumber;

    public Customer(String surname, String name, String patronymic, String address, long creditCardNumber,
                    String bankAccountNumber) {
        if (surname.isEmpty()) {
            throw new IllegalArgumentException("Surname cannot be an empty string!");
        }
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be an empty string!");
        }
        if (patronymic.isEmpty()) {
            throw new IllegalArgumentException("Patronymic cannot be an empty string!");
        }
        if (creditCardNumber < 1_000_000_000_000_000L || creditCardNumber > 9_999_999_999_999_999L) {
            throw new IllegalArgumentException("Incorrect credit card number!");
        }

        this.id = currentId++;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.address = address;
        this.creditCardNumber = creditCardNumber;
        this.bankAccountNumber = bankAccountNumber;
    }

    public int getId() {
        return id;
    }

    public void setSurname(String surname) {
        if (surname != null && !surname.isEmpty()) {
            this.surname = surname;
        } else {
            throw new IllegalArgumentException("Surname cannot be an empty string!");
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Name cannot be an empty string!");
        }
    }

    public String getName() {
        return name;
    }

    public void setPatronymic(String patronymic) {
        if (patronymic != null && !patronymic.isEmpty()) {
            this.patronymic = patronymic;
        } else {
            throw new IllegalArgumentException("Patronymic cannot be an empty string!");
        }
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setSAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setCreditCardNumber(long creditCardNumber) {
        if (creditCardNumber > 999_999_999_999_999L && creditCardNumber < 10_000_000_000_000_000L) {
            this.creditCardNumber = creditCardNumber;
        } else {
            throw new IllegalArgumentException("Incorrect credit card number!");
        }
    }

    public long getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", address='" + address + '\'' +
                ", credit card number='" + creditCardNumber + '\'' +
                ", bank account number='" + bankAccountNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return id == customer.id &&
                creditCardNumber == customer.creditCardNumber &&
                surname.equals(customer.surname) &&
                name.equals(customer.name) &&
                patronymic.equals(customer.patronymic) &&
                Objects.equals(address, customer.address) &&
                Objects.equals(bankAccountNumber, customer.bankAccountNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, surname, name, patronymic, address, creditCardNumber, bankAccountNumber);
    }

    @Override
    public int compareTo(Customer customer) {
        int compareResult = this.surname.compareTo(customer.surname);
        if (compareResult == 0) {
            compareResult = this.name.compareTo(customer.name);
            if (compareResult == 0) {
                compareResult = this.patronymic.compareTo(customer.patronymic);
                if (compareResult == 0) {
                    compareResult = Integer.compare(this.id, customer.id);
                }
            }
        }

        return compareResult;
    }
}
