package by.epam.module04.task4008;
//8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
//и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
//и методами. Задать критерии выбора данных и вывести эти данные на консоль.
//Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
//Найти и вывести:
//a) список покупателей в алфавитном порядке;
//b) список покупателей, у которых номер кредитной карточки находится в заданном интервале

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Shop shop;
        Customer[] customers;
        List<Customer> customersAlphabetically;
        List<Customer> customersByRangeOfCreditCardNumber;

        customers = new Customer[5];
        customers[0] = new Customer("Zayats", "Elena", "Valerievna", "Grodno",
                1425369874582500L, "25416985900045879865");
        customers[1] = new Customer("Ikasalo", "Petr", "Petrovich", "Minsk",
                1425369874582541L, "25416985900045870001");
        customers[2] = new Customer("Kirkorov", "Filipp", "Bedrosovich", "Kiev",
                1425369874582601L, "25416985900045871401");
        customers[3] = new Customer("Ikasalo", "Petr", "Ivanovich", "Moscow",
                1425369874582600L, "25416985900045870125");
        customers[4] = new Customer("Loboda", "Svetlana", "Romualdovna", "Dnepropetrovsk",
                1425369874582499L, "25416985900045873451");


        shop = new Shop("Market", customers);
        shop.printCustomers();
        System.out.println();

        customersAlphabetically = shop.customersAlphabetically();
        System.out.println("Customers in alphabetical order: ");
        for (Customer customer : customersAlphabetically) {
            System.out.println(customer);
        }
        System.out.println();

        customersByRangeOfCreditCardNumber
                = shop.customersByRangeOfCreditCardNumber(1425369874582500L, 1425369874582600L);
        System.out.println("Customers whose number of credit card is in the range [1425369874582500;1425369874582600]:");
        for (Customer customer : customersByRangeOfCreditCardNumber) {
            System.out.println(customer);
        }

    }
}
