package by.epam.module04.task4102;

public class Wheel {
    private int number;
    private final String mark;
    private final TypeOfTires typeOfTires;
    private final TypeOfWheel typeOfWheel;
    private final int diameter;
    private boolean isSpinning = false;

    public Wheel(String mark, int diameter, TypeOfWheel typeOfWheel, TypeOfTires typeOfTires) {
        if (diameter < 14 || diameter > 22) {
            throw new IllegalArgumentException("Incorrect diameter!");
        }

        this.mark = mark;
        this.number = 0;
        this.diameter = diameter;
        this.typeOfTires = typeOfTires;
        this.typeOfWheel = typeOfWheel;
    }

    public void setNumber(int number){
        this.number=number;
    }

    public void spin() {
        isSpinning = true;
        System.out.println(string() + " is spinning!");
    }

    public void stop() {
        if (isSpinning) {
            isSpinning = false;
            System.out.println(string() + " is stop!");
        }
    }

    public void spinSlowly() {
        if (isSpinning) {
            System.out.println(string() + " spinning slowly...");
        }
    }

    public int getDiameter() {
        return diameter;
    }

    public boolean isSpinning() {
        return isSpinning;
    }

    public String string() {
        return "Wheel " + number;
    }

    public enum TypeOfTires {
        SUMMER,
        WINTER,
        ALL_SEASON
    }

    public enum TypeOfWheel {
        ALLOY,
        FORGED,
        STAMPED
    }
}
