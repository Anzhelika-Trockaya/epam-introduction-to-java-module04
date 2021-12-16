package by.epam.module04.task4004;

public class TrainsInfoShower {
    private static final String TRAIN_FORMAT = "| %6s | %18s | %18s |%s";
    private static final String LINE = "----------------------------------------------------";

    public void printTrainInfo(Train train) {
        printTableHeader();
        printTrainLine(train);
    }

    private void printTableHeader() {
        System.out.println(LINE);
        System.out.printf(TRAIN_FORMAT, "№", "destination name", "departure time", "\n");
        System.out.println(LINE);
    }

    public void printTrainInfo(Train train, String message) {
        System.out.println(message);
        printTableHeader();
        printTrainLine(train);
    }

    private void printTrainLine(Train train) {
        System.out.printf(TRAIN_FORMAT
                , train.getTrainNumber()
                , train.getDestinationName()
                , train.getDepartureTime().toString()
                , "\n");
        System.out.println(LINE);
    }

    public void printTrainInfo(Train[] trains) {
        printTableHeader();
        for (Train train : trains) {
            printTrainLine(train);
        }
        System.out.println();
    }

    public void printTrainInfo(Train[] trains, String message) {
        System.out.println(message);

        printTableHeader();
        for (Train train : trains) {
            printTrainLine(train);
        }
        System.out.println();
    }

    public void printMessage(String message) {
        System.out.println(message);
        System.out.println();
    }

}
