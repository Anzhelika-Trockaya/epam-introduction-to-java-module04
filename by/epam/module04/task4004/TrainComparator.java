package by.epam.module04.task4004;

import java.util.Comparator;

public class TrainComparator implements Comparator<Train> {
    @Override
    public int compare(Train t1, Train t2) {
        int trainsCompare;

        trainsCompare = t1.getDestinationName().compareTo(t2.getDestinationName());

        if (trainsCompare == 0) {
            trainsCompare = t1.getDepartureTime().compareTo(t2.getDepartureTime());
        }

        return trainsCompare;
    }
}
