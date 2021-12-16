package by.epam.module04.task4004;

//4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
//Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
//номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
//Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
//назначения должны быть упорядочены по времени отправления.

import java.io.Serializable;
import java.time.LocalTime;

public class Train implements Serializable {
    private String destinationName;
    private int trainNumber;
    private LocalTime departureTime;

    public Train() {
        destinationName = "";
        trainNumber = 0;
        departureTime = LocalTime.of(0, 0);
    }

    public Train(String destinationName, int trainNumber, LocalTime departureTime) {
        this.destinationName = destinationName;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
    }

    public String getDestinationName() {
        return destinationName;
    }

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Train)) return false;
        Train train = (Train) o;
        return trainNumber == train.trainNumber &&
                destinationName.equals(train.destinationName) &&
                departureTime.equals(train.departureTime);
    }

    @Override
    public int hashCode() {
        int result = destinationName.hashCode();
        result = result * 31 + Integer.hashCode(trainNumber);
        result = result * 31 + departureTime.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "destinationName='" + destinationName + '\'' +
                ", trainNumber=" + trainNumber +
                ", departureTime=" + departureTime +
                '}';
    }
}
