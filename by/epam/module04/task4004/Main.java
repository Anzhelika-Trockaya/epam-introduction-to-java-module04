package by.epam.module04.task4004;

//4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
//Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
//номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
//Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
//назначения должны быть упорядочены по времени отправления.

public class Main {
    public static void main(String[] args) {
        UserActionViewer viewer;

        viewer = new UserActionViewer();
        viewer.viewAllTrains();
        viewer.viewTrainsSortedByNumber();
        viewer.viewTrainsSortedByDestinationNameAndDepartureTime();
        viewer.infoAboutTrain();

    }
}
