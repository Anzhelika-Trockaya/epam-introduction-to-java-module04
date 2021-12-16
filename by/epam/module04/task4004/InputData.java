package by.epam.module04.task4004;

import java.time.LocalTime;

public class InputData {
    public Train[] getTrains(){
        Train[] trains;
        int numberOfTrains;

        numberOfTrains = 5;
        trains = new Train[numberOfTrains];
        trains[0] = new Train("Moscow", 4562, LocalTime.of(17, 35));
        trains[1] = new Train("Moscow", 1247, LocalTime.of(4, 30));
        trains[2] = new Train("Paris", 777, LocalTime.of(10, 0));
        trains[3] = new Train("Moscow", 7789, LocalTime.of(2, 10));
        trains[4] = new Train("New York", 2354, LocalTime.of(5, 10));

        return trains;
    }
}
