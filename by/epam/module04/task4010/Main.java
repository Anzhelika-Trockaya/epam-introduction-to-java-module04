package by.epam.module04.task4010;

//10. Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
//и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
//методами. Задать критерии выбора данных и вывести эти данные на консоль.
//Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
//Найти и вывести:
//a) список рейсов для заданного пункта назначения;
//b) список рейсов для заданного дня недели;
//c) список рейсов для заданного дня недели, время вылета для которых больше заданного.

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Airline> airlines;
        AirlineCompanyLogic logic;
        InfoShower shower;
        Set<Airline> filteredAirlines;

        airlines = new HashSet<>();
        airlines.add(new Airline(City.MOSCOW, 125, AirplaneType.LOCAL, LocalTime.of(16, 30),
                DayOfWeek.MONDAY));
        airlines.add(new Airline(City.BERLIN, 1000, AirplaneType.REGIONAL, LocalTime.of(2, 15),
                DayOfWeek.TUESDAY, DayOfWeek.SUNDAY));
        airlines.add(new Airline(City.MOSCOW, 668, AirplaneType.LOCAL, LocalTime.of(0, 10),
                DayOfWeek.TUESDAY, DayOfWeek.WEDNESDAY, DayOfWeek.THURSDAY, DayOfWeek.FRIDAY, DayOfWeek.SUNDAY));
        airlines.add(new Airline(City.MADRID, 777, AirplaneType.INTERNATIONAL, LocalTime.of(15, 35),
                DayOfWeek.MONDAY, DayOfWeek.THURSDAY, DayOfWeek.WEDNESDAY, DayOfWeek.THURSDAY, DayOfWeek.FRIDAY,
                DayOfWeek.SATURDAY));
        airlines.add(new Airline(City.MINSK, 545, AirplaneType.LOCAL, LocalTime.of(20, 20),
                DayOfWeek.THURSDAY, DayOfWeek.FRIDAY, DayOfWeek.SATURDAY));
        airlines.add(new Airline(City.NEW_YORK, 411, AirplaneType.INTERNATIONAL, LocalTime.of(4, 15),
                DayOfWeek.MONDAY, DayOfWeek.THURSDAY, DayOfWeek.SATURDAY, DayOfWeek.SUNDAY));
        airlines.add(new Airline(City.MOSCOW, 6737, AirplaneType.LOCAL, LocalTime.of(5, 0),
                DayOfWeek.MONDAY, DayOfWeek.FRIDAY, DayOfWeek.SATURDAY));
        airlines.add(new Airline(City.NEW_YORK, 1500, AirplaneType.INTERNATIONAL, LocalTime.of(6, 30),
                DayOfWeek.WEDNESDAY, DayOfWeek.FRIDAY, DayOfWeek.SUNDAY));
        airlines.add(new Airline(City.LONDON, 404, AirplaneType.REGIONAL, LocalTime.of(12, 5),
                DayOfWeek.MONDAY, DayOfWeek.WEDNESDAY));
        airlines.add(new Airline(City.PARIS, 505, AirplaneType.REGIONAL, LocalTime.of(23, 45),
                DayOfWeek.MONDAY, DayOfWeek.WEDNESDAY, DayOfWeek.THURSDAY, DayOfWeek.FRIDAY, DayOfWeek.SATURDAY));

        logic = new AirlineCompanyLogic();
        logic.setCompanyData("FlyLines", airlines);
        shower = new InfoShower();

        shower.printAirlines(airlines, "All airlines:");

        filteredAirlines = logic.flightsTo(City.MOSCOW);
        shower.printAirlines(filteredAirlines, "Flights to Moscow:");

        filteredAirlines = logic.flightsOfTheDay(DayOfWeek.SUNDAY);
        shower.printAirlines(filteredAirlines, "Flights on sunday:");

        filteredAirlines = logic.flightsOfTheDay(DayOfWeek.MONDAY, LocalTime.of(12, 0));
        shower.printAirlines(filteredAirlines, "Flights on monday after 12pm:");
    }

}
