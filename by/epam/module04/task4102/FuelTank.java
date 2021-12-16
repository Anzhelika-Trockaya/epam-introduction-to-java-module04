package by.epam.module04.task4102;

public class FuelTank {
    private final int size;
    private int amountOfFuel;

    public FuelTank() {
        size = 200;
        amountOfFuel = 0;
    }

    public FuelTank(int size) {
        this.size = size;
        amountOfFuel = 0;
    }

    public FuelTank(int size, int amountOfFuel) {
        this.size = size;
        this.amountOfFuel = amountOfFuel;
    }

    public int getSize() {
        return size;
    }

    public int getAmountOfFuel() {
        return amountOfFuel;
    }

    public void setAmountOfFuel(int amountOfFuel) {
        this.amountOfFuel = amountOfFuel;
    }

    public int giveFuel(int amountOfFuel) {
        int result;

        result = Math.min(this.amountOfFuel, amountOfFuel);
        this.amountOfFuel -= result;

        return result;
    }

    public void addAmountOfFuel(int amountOfFuel) {
        this.amountOfFuel += amountOfFuel;
    }
}
