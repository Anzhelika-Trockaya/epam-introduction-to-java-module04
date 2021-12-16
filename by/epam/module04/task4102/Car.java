package by.epam.module04.task4102;

//2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
//менять колесо, вывести на консоль марку автомобиля.

public class Car {
    private final String model;
    private final int amountOfFuelToSpinTheWheel;
    private final int amountOfFuelToStartEngine;
    private Engine engine;
    private Wheel[] wheels;
    private FuelTank fuelTank;
    private boolean isGasPress = false;
    private boolean isBrakePress = false;

    public Car(String model, Engine engine, Wheel[] wheels, FuelTank fuelTank) {
        if (model.isEmpty()) {
            throw new IllegalArgumentException("Model cannot be empty string!");
        }
        if (engine == null) {
            throw new IllegalArgumentException("Engine cannot be null!");
        }
        if (fuelTank == null) {
            throw new IllegalArgumentException("Fuel tank cannot be null!");
        }
        if (wheels.length != 4) {
            throw new IllegalArgumentException("Car must have 4 wheels!");
        }
        for (Wheel wheel : wheels) {
            if (wheel == null) {
                throw new IllegalArgumentException("Wheel cannot be null!");
            }
        }
        if (wheels[0].getDiameter() != wheels[1].getDiameter()
                || wheels[2].getDiameter() != wheels[3].getDiameter()
                || wheels[0].getDiameter() != wheels[3].getDiameter()) {
            throw new IllegalArgumentException("Diameter of wheels must be equal!");
        }

        this.model = model;
        this.engine = engine;

        this.wheels = wheels;
        for (int i = 1; i <= wheels.length; i++) {
            wheels[i - 1].setNumber(i);
        }

        this.fuelTank = fuelTank;
        this.amountOfFuelToSpinTheWheel = 5;
        this.amountOfFuelToStartEngine = 1;
    }

    public void startEngine() {
        if (!engine.isWorking()) {

            System.out.println("Amount of fuel in tank                                " + fuelTank.getAmountOfFuel() + " L");
            engine.start(fuelTank.giveFuel(amountOfFuelToStartEngine), wheels);

            if (isGasPress && !isBrakePress) {
                engine.spinTheWheels(fuelTank.giveFuel(amountOfFuelToSpinTheWheel));
            }

        } else {
            System.out.println("It is impossible to start the engine, because it is already running!");
        }
    }

    public void pressGas() {
        isGasPress = true;
        System.out.println("Gas is press.");
        if (!isBrakePress && engine.isWorking()) {
            engine.spinTheWheels(fuelTank.giveFuel(amountOfFuelToSpinTheWheel));
        }
    }

    public void releaseGas() {
        if (isGasPress) {
            isGasPress = false;
            System.out.println("Gas is not press.");
            if (!isBrakePress && engine.isWorking()) {
                engine.stopToSpinTheWheels(false);
            }
        }
    }

    public void pressBrake() {
        isBrakePress = true;
        System.out.println("Brake is press.");
        if (engine.isWorking()) {
            stopTheWheels();
        }
    }

    public void releaseBrake() {
        if (isBrakePress) {
            isBrakePress = false;
            System.out.println("Brake is not press.");
            if (isGasPress && engine.isWorking()) {
                engine.spinTheWheels(fuelTank.giveFuel(amountOfFuelToSpinTheWheel));
            }
        }
    }

    private void stopTheWheels() {
        for (Wheel wheel : wheels) {
            wheel.stop();
        }
    }

    public void stopEngine() {
        if (engine.isWorking()) {
            engine.stop();
            if (isGasPress) {
                engine.stopToSpinTheWheels(isBrakePress);
            }
        }
    }

    public void refuel(int amountOfFuel) {
        if (!engine.isWorking()) {
            if (fuelTank.getAmountOfFuel() + amountOfFuel <= fuelTank.getSize()) {
                fuelTank.addAmountOfFuel(amountOfFuel);
                System.out.println("Fueled " + amountOfFuel + " liters.            Amount of fuel = " + fuelTank.getAmountOfFuel());
            } else {
                throw new IllegalArgumentException("Not fueled! Amount of fuel is too big!");
            }
        } else {
            System.out.println("Do not refuel with the engine running!");
        }
    }

    public void changeTheWheel(int numberOfWheel, Wheel newWheel) {
        if (!engine.isWorking()) {
            if (numberOfWheel >= 1 && numberOfWheel <= 4) {
                if (newWheel.getDiameter() == wheels[numberOfWheel - 1].getDiameter()) {
                    wheels[numberOfWheel - 1] = newWheel;
                    newWheel.setNumber(numberOfWheel);
                    System.out.println("Changed  wheel #" + numberOfWheel + ".");
                } else {
                    System.out.println("Do not change a wheel, because size is wrong!");
                }
            } else {
                throw new IllegalArgumentException("Incorrect number of wheel!");
            }
        } else {
            System.out.println("Do not change a wheel with the engine running!");
        }
    }
}
