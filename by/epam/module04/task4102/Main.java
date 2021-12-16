package by.epam.module04.task4102;

//2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
//менять колесо, вывести на консоль марку автомобиля.

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Engine engine;
        Wheel[] wheels;
        Wheel spareWheel1;
        Wheel spareWheel2;
        FuelTank fuelTank;
        Car car;


        engine = new Engine("2.8 (12V)");

        wheels = new Wheel[4];
        wheels[0] = new Wheel("KFZ", 16, Wheel.TypeOfWheel.ALLOY, Wheel.TypeOfTires.SUMMER);
        wheels[1] = new Wheel("KFZ", 16, Wheel.TypeOfWheel.ALLOY, Wheel.TypeOfTires.SUMMER);
        wheels[2] = new Wheel("KFZ", 16, Wheel.TypeOfWheel.ALLOY, Wheel.TypeOfTires.SUMMER);
        wheels[3] = new Wheel("KFZ", 16, Wheel.TypeOfWheel.ALLOY, Wheel.TypeOfTires.SUMMER);

        spareWheel1 = new Wheel("KFZ", 18, Wheel.TypeOfWheel.STAMPED, Wheel.TypeOfTires.SUMMER);
        spareWheel2 = new Wheel("Trebl", 16, Wheel.TypeOfWheel.STAMPED, Wheel.TypeOfTires.SUMMER);

        fuelTank = new FuelTank(200, 10);

        car = new Car("Audi A8", engine, wheels, fuelTank);

        car.startEngine();
        System.out.println();
        car.pressGas();
        Thread.sleep(2000);
        System.out.println();
        car.releaseGas();
        Thread.sleep(2000);
        System.out.println();
        car.stopEngine();
        Thread.sleep(2000);
        System.out.println();
        car.refuel(10);
        Thread.sleep(2000);
        System.out.println();
        car.startEngine();
        Thread.sleep(2000);
        System.out.println();
        car.pressGas();
        Thread.sleep(2000);
        System.out.println();
        car.pressBrake();
        Thread.sleep(2000);
        System.out.println();
        car.pressGas();
        Thread.sleep(2000);
        System.out.println();
        car.releaseBrake();
        Thread.sleep(2000);
        System.out.println();
        car.refuel(15);
        Thread.sleep(2000);
        System.out.println();
        car.pressGas();
        Thread.sleep(2000);
        System.out.println();
        car.pressBrake();
        Thread.sleep(2000);
        System.out.println();
        car.startEngine();
        Thread.sleep(2000);
        System.out.println();
        car.pressBrake();
        Thread.sleep(2000);
        System.out.println();
        car.releaseBrake();
        Thread.sleep(2000);
        System.out.println();
        car.pressGas();
        Thread.sleep(2000);
        System.out.println();
        car.pressGas();
        Thread.sleep(2000);
        System.out.println();
        car.pressGas();
        Thread.sleep(2000);
        System.out.println();
        car.releaseGas();
        Thread.sleep(2000);
        System.out.println();
        car.pressGas();
        Thread.sleep(2000);
        System.out.println();
        car.stopEngine();
        Thread.sleep(2000);
        System.out.println();
        car.changeTheWheel(4, spareWheel1);
        Thread.sleep(2000);
        System.out.println();
        car.changeTheWheel(4, spareWheel2);

    }
}
