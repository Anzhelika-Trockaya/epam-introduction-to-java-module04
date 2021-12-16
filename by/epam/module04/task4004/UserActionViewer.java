package by.epam.module04.task4004;

public class UserActionViewer {
    private final TrainsLogic logic = new TrainsLogic();
    private final TrainsInfoShower trainsInfoShower = new TrainsInfoShower();
    private final UserInput input = new UserInput();

    public void viewAllTrains() {
        Train[] trains;

        trains = logic.getAllTrains();
        if (trains != null) {
            trainsInfoShower.printTrainInfo(trains, "All trains");
        } else {
            trainsInfoShower.printMessage("Error! Trains not founded!");
        }
    }

    public void infoAboutTrain() {
        Train train;
        int number;

        number = input.inputNumber("Enter train number:");
        train = logic.findTrain(number);
        if (train != null) {
            trainsInfoShower.printTrainInfo(train);
        } else {
            trainsInfoShower.printMessage("Not found train with number " + number + "!");
        }
    }

    public void viewTrainsSortedByNumber() {
        Train[] trains;

        trains = logic.getManualSortedByNumber();

        if (trains != null) {
            trainsInfoShower.printTrainInfo(trains, "All trains, sorted by number");
        } else {
            trainsInfoShower.printMessage("Error! Trains not founded!");
        }
    }

    public void viewTrainsSortedByDestinationNameAndDepartureTime() {
        Train[] trains;

        trains = logic.getManualSortedByDestinationNameAndDepartureTime();

        if (trains != null) {
            trainsInfoShower.printTrainInfo(trains, "All trains, sorted by destination name and departure time");
        } else {
            trainsInfoShower.printMessage("Error! Trains not founded!");
        }
    }


}
