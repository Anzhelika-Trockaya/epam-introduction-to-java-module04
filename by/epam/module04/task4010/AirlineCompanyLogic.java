package by.epam.module04.task4010;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

public class AirlineCompanyLogic {

    private final AirlineCompany company;

    public AirlineCompanyLogic() {
        company = new AirlineCompany("");
    }

    public void setCompanyName(String name) {
        if (name != null && !name.isEmpty()) {
            company.setName(name);
        } else {
            throw new IllegalArgumentException("Name cannot be an empty string!");
        }
    }

    public void setCompanyData(String name, Set<Airline> airlineSet) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or an empty string!");
        }

        if (airlineSet == null) {
            company.setName(name);
        } else if (areFlightNumbersPositive(airlineSet) && areFlightNumbersUnique(airlineSet)) {
            company.setAirlines(airlineSet);
        } else {
            throw new IllegalArgumentException("Flight numbers are not unique!");
        }

    }

    private boolean areFlightNumbersUnique(Set<Airline> airlineSet) {
        int[] numbers;
        int index;

        numbers = new int[airlineSet.size()];
        index = 0;

        for (Airline line : airlineSet) {
            for (int i = 0; i < index; i++) {
                if (numbers[i] == line.getFlightNumber()) {
                    return false;
                }
            }
            numbers[index] = line.getFlightNumber();
            index++;
        }

        return true;
    }

    private boolean areFlightNumbersPositive(Set<Airline> airlineSet) {
        for (Airline line : airlineSet) {
            if (line.getFlightNumber() <= 0) {
                return false;
            }
        }

        return true;
    }

    public void setAirlines(Set<Airline> airlineSet) {
        if (areFlightNumbersUnique(airlineSet)) {
            company.setAirlines(airlineSet);
        }
    }

    public void addAirline(Airline line) {
        if (notExistAirlineWithNumber(line.getFlightNumber())) {
            company.addAirline(line);
        }
    }

    public void removeAirline(int flightNumber) {
        company.getAirlines().removeIf(line -> line.getFlightNumber() == flightNumber);
    }

    private boolean notExistAirlineWithNumber(int number) {
        for (Airline line : company.getAirlines()) {
            if (line.getFlightNumber() == number) {
                return false;
            }
        }
        return true;
    }

    public Set<Airline> flightsTo(City city) {
        Set<Airline> flightsToCity;

        flightsToCity = new HashSet<>();

        for (Airline airline : company.getAirlines()) {
            if (airline.getDestination().equals(city)) {
                flightsToCity.add(airline);
            }
        }

        return flightsToCity;
    }

    public Set<Airline> flightsOfTheDay(DayOfWeek day) {
        Set<Airline> flights;

        flights = new HashSet<>();

        for (Airline airline : company.getAirlines()) {
            for (DayOfWeek dayOfAirline : airline.getDaysOfTheWeek()) {
                if (dayOfAirline.equals(day)) {
                    flights.add(airline);
                    break;
                }
            }
        }

        return flights;
    }

    public Set<Airline> flightsOfTheDay(DayOfWeek day, LocalTime afterTime) {
        Set<Airline> flightsOfTheDay;
        Set<Airline> result;

        result = new HashSet<>();
        flightsOfTheDay = flightsOfTheDay(day);

        for (Airline airline : flightsOfTheDay) {
            if (airline.getDepartureTime().isAfter(afterTime)) {
                result.add(airline);
            }
        }

        return result;
    }
}
