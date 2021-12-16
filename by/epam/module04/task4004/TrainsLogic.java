package by.epam.module04.task4004;

import java.util.Arrays;
import java.util.Comparator;

public class TrainsLogic {
    private final InputData inputData = new InputData();

    public Train[] getAllTrains() {
        return inputData.getTrains();
    }

    public Train[] getSortedByDestinationNameAndDepartureTime() {
        Train[] sortedTrains;

        sortedTrains = inputData.getTrains();
        Arrays.sort(sortedTrains, new TrainComparator());

        return sortedTrains;
    }

    public Train[] getSortedByNumber() {
        Train[] sortedTrains;

        sortedTrains = inputData.getTrains();
        Arrays.sort(sortedTrains, Comparator.comparingInt(Train::getTrainNumber));

        return sortedTrains;
    }

    public Train[] getManualSortedByNumber() {
        Train[] sortedTrains;
        Train temp;

        sortedTrains = inputData.getTrains();

        for (int i = 0; i < sortedTrains.length - 1; i++) {
            for (int j = i + 1; j < sortedTrains.length; j++) {
                if (sortedTrains[j].getTrainNumber() < sortedTrains[i].getTrainNumber()) {
                    temp = sortedTrains[i];
                    sortedTrains[i] = sortedTrains[j];
                    sortedTrains[j] = temp;
                }
            }
        }

        return sortedTrains;
    }

    public Train[] getManualSortedByDestinationNameAndDepartureTime() {
        Train[] sortedTrains;
        Train temp;

        sortedTrains = getManualSortedByDestinationName();

        for (int i = 0; i < sortedTrains.length - 1; i++) {
            for (int j = i + 1; j < sortedTrains.length; j++) {

                if (sortedTrains[j].getDestinationName().equals(sortedTrains[i].getDestinationName())
                        && sortedTrains[j].getDepartureTime().isBefore(sortedTrains[i].getDepartureTime())) {

                    temp = sortedTrains[i];
                    sortedTrains[i] = sortedTrains[j];
                    sortedTrains[j] = temp;
                }
            }
        }

        return sortedTrains;
    }

    public Train[] getManualSortedByDestinationName() {
        Train[] sortedTrains;
        Train temp;

        sortedTrains = inputData.getTrains();

        for (int i = 0; i < sortedTrains.length - 1; i++) {
            for (int j = i + 1; j < sortedTrains.length; j++) {
                if (sortedTrains[j].getDestinationName().compareTo(sortedTrains[i].getDestinationName()) < 0) {
                    temp = sortedTrains[i];
                    sortedTrains[i] = sortedTrains[j];
                    sortedTrains[j] = temp;
                }
            }
        }

        return sortedTrains;
    }

    public Train findTrain(int trainNumber) {
        for (Train train : inputData.getTrains()) {
            if (train.getTrainNumber() == trainNumber) {
                return train;
            }
        }
        return null;
    }
}
