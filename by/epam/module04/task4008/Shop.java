package by.epam.module04.task4008;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {
    private String name;
    private Customer[] customers;

    public Shop(String name, Customer[] customers) {
        this.name = (name != null) ? name : "";
        this.customers = customers;
    }

    public void setCustomers(Customer[] customers) {
        this.customers = customers;
    }

    public Customer[] getCustomers() {
        return customers;
    }

    public Customer getCustomer(int id) {
        for (Customer customer : customers) {
            if (customer.getId() == id) {
                return customer;
            }
        }
        return null;
    }

    public List<Customer> customersAlphabetically() {
        List<Customer> customersAlphabetically;

        customersAlphabetically = (ArrayList<Customer>) Arrays
                .stream(customers)
                .sorted(Customer::compareTo)
                .collect(Collectors.toList());

        return customersAlphabetically;
    }

    public List<Customer> customersByRangeOfCreditCardNumber(long from, long to) {
        List<Customer> result = new ArrayList<>();

        for (Customer customer : customers) {
            if (customer.getCreditCardNumber() >= from && customer.getCreditCardNumber() <= to) {
                result.add(customer);
            }
        }

        return result;
    }

    public void printCustomers() {
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }

}
