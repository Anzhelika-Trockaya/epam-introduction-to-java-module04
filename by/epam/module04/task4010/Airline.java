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
import java.time.LocalTime;
import java.util.*;

public class Airline implements Serializable {

    private City destination;
    private int flightNumber;
    private AirplaneType airplaneType;
    private LocalTime departureTime;
    private Set<DayOfWeek> daysOfTheWeek;

    public Airline(){
    }

    public Airline(City destination, int flightNumber, AirplaneType airplaneType, LocalTime departureTime,
                   DayOfWeek... daysOfTheWeek) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.airplaneType = airplaneType;
        this.departureTime = departureTime;
        this.daysOfTheWeek = new TreeSet<>();
        this.daysOfTheWeek.addAll(Arrays.asList(daysOfTheWeek));
    }

    public City getDestination() {
        return destination;
    }

    public void setDestination(City destination) {
        this.destination = destination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
            this.flightNumber = flightNumber;
    }

    public AirplaneType getAirplaneType() {
        return airplaneType;
    }

    public void setAirplaneType(AirplaneType airplaneType) {
        this.airplaneType = airplaneType;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    public Set<DayOfWeek> getDaysOfTheWeek() {
        return daysOfTheWeek;
    }

    public void setDaysOfTheWeek(Set<DayOfWeek> daysOfTheWeek) {
        this.daysOfTheWeek = daysOfTheWeek;
    }

    public void addDayOfTheWeek(DayOfWeek dayOfWeek){
        this.daysOfTheWeek.add(dayOfWeek);
    }

    public void removeDayOfTheWeek(DayOfWeek dayOfWeek){
        this.daysOfTheWeek.remove(dayOfWeek);
    }

    @Override
    public String toString() {
        return "Airline{" +
                "destination=" + destination +
                ", flightNumber=" + flightNumber +
                ", airplaneType=" + airplaneType +
                ", departureTime=" + departureTime +
                ", daysOfTheWeek=" + daysOfTheWeek +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Airline)) return false;
        Airline airline = (Airline) o;
        return flightNumber == airline.flightNumber &&
                destination == airline.destination &&
                airplaneType == airline.airplaneType &&
                Objects.equals(departureTime, airline.departureTime) &&
                Objects.equals(daysOfTheWeek, airline.daysOfTheWeek);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destination, flightNumber, airplaneType, departureTime, daysOfTheWeek);
    }
}
