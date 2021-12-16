package by.epam.module04.task4010;

//10. Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
//и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
//методами. Задать критерии выбора данных и вывести эти данные на консоль.
//Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
//Найти и вывести:
//a) список рейсов для заданного пункта назначения;
//b) список рейсов для заданного дня недели;
//c) список рейсов для заданного дня недели, время вылета для которых больше заданного.

import java.io.Serializable;
import java.util.*;

public class AirlineCompany implements Serializable {
    private String name;
    private Set<Airline> airlines;

    public AirlineCompany() {
    }

    public AirlineCompany(String name) {
        this.name = name;
        this.airlines = new HashSet<>();
    }

    public AirlineCompany(String name, Set<Airline> airlines) {
        this.name = name;
        this.airlines = airlines;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Airline> getAirlines() {
        return airlines;
    }

    public void setAirlines(Set<Airline> airlines) {
        if (airlines != null) {
            this.airlines = airlines;
        }
    }

    public void addAirline(Airline line) {
        this.airlines.add(line);
    }

    @Override
    public String toString() {
        return "AirlineCompany{" +
                "name='" + name + '\'' +
                ", airlines=" + airlines +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AirlineCompany)) return false;
        AirlineCompany that = (AirlineCompany) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(airlines, that.airlines);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, airlines);
    }
}

