package by.epam.module04.task4102;

public class Engine {
    private final String model;
    private boolean isWorking = false;
    private Wheel[] wheels;
    private int amountOfFuel;

    public Engine(String model) {
        if (model != null || model.isEmpty()) {
            this.model = model;
        } else {
            throw new IllegalArgumentException("Model of engine cannot be equal null and be null!");
        }

        this.amountOfFuel = 0;
    }

    public void start(int amountOfFuel, Wheel[] wheels) {
        int amountOfFuelToStart = 1;

        this.wheels=wheels;
        this.amountOfFuel += amountOfFuel;
        System.out.println("                                                 - " + amountOfFuel + " L");

        if (this.amountOfFuel >= amountOfFuelToStart) {
            this.amountOfFuel -= amountOfFuelToStart;
            isWorking = true;
            System.out.println("Engine is start!");
        } else {
            System.out.println("Engine is not start! Not enough fuel!");
            System.out.println("Amount of fuel in engine = " + this.amountOfFuel);

        }
    }

    public void stop() {
        isWorking = false;
        System.out.println("Engine is stop!");
    }

    public void spinTheWheels(int amountOfFuel) {
        int amountOfFuelToSpinTheWheel = 5;

        if(isWorking) {
            this.amountOfFuel += amountOfFuel;

            System.out.println("                                                 - " + amountOfFuel + " L");

            if (this.amountOfFuel >= amountOfFuelToSpinTheWheel) {

                this.amountOfFuel -= amountOfFuelToSpinTheWheel;
                spinTheWheels();

            } else {

                if (this.amountOfFuel > 0) {
                    spinTheWheels();
                    this.amountOfFuel = 0;
                    stopToSpinTheWheels(false);
                }

                System.out.println("Engine don't spin the wheels. Not enough fuel!");
                System.out.println("Amount of fuel in engine = " + this.amountOfFuel);
                stop();
            }
        } else{
            throw new RuntimeException("Engine can not to spin the wheels, because is not working!!!");
        }
    }

    private void spinTheWheels(){
        System.out.println("Engine spin the wheels.");
        for (Wheel wheel : wheels) {
            wheel.spin();
        }
    }

    public void stopToSpinTheWheels(boolean isBreakPress) {
        System.out.println("Engine don't spin the wheels.");
        if (!isBreakPress) {
            for (Wheel wheel : wheels) {
                wheel.spinSlowly();
            }
            for (Wheel wheel : wheels) {
                wheel.stop();
            }
        }
    }

    public boolean isWorking() {
        return isWorking;
    }
}
