package by.epam.module04.task4010;

import java.util.Set;

public class InfoShower {
    public void printAirlines(Set<Airline> lines, String message) {
        String format;
        String firstString;
        String line;

        format = " %10s | %13s | %13s | %8s | %s";
        firstString = String.format(format,"flight №","dest","type","time","days");
        line="---------------------------------------------------------------------------------------------------";

        System.out.println(message);
        System.out.println(firstString);
        System.out.println(line);

        for (Airline airline : lines) {
            System.out.printf(format
                    , airline.getFlightNumber(), airline.getDestination(), airline.getAirplaneType()
                    , airline.getDepartureTime(), airline.getDaysOfTheWeek());

            System.out.println();
        }

        System.out.println();
    }

}
