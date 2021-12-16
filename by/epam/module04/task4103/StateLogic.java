package by.epam.module04.task4103;

public class StateLogic {
    private final State state;

    public StateLogic(State state){
        this.state=state;
    }

    public void printCenter() {
        System.out.println("Center - " + state.getCenter().getName());
    }

    public void printNumberOfRegions() {
        System.out.println("Number of regions - " + state.getRegions().length);
    }

    public void printSquare() {
        if (state.getSquare() > 0) {
            System.out.println("Square - " + state.getSquare() + " km^2");
        } else {
            System.out.println("Square not specified.");
        }
    }

    public void printRegionsCentres() {
        System.out.println("Names of the centres of the regions: ");
        for (Region region : state.getRegions()) {
            System.out.println(region.getCenter().getName());
        }
    }
}
