package by.epam.module04.task4005;


//5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
//на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
//произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
//позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.

public class Main {
    public static void main(String[] args) {
        CounterLogic counterLogic;
        Counter counter1;
        Counter counter2;

        counterLogic=new CounterLogic();
        counter1 = counterLogic.createCounter();
        counter2 = counterLogic.createCounter(7, 1, 14);

        System.out.println("Counter 1: " + counter1);

        System.out.println("Counter1 increment: ");
        for (int i = 0; i < 15; i++) {
            counterLogic.increment(counter1);
            System.out.print(counter1.getValue() + " ");
        }
        System.out.println();

        System.out.println("Counter1 decrement: ");
        for (int i = 0; i < 15; i++) {
            counterLogic.decrement(counter1);
            System.out.print(counter1.getValue() + " ");
        }
        System.out.println();

        System.out.println("\nCounter2: " + counter2);

        System.out.println("Counter2 increment: ");
        for (int i = 0; i < 15; i++) {
            counterLogic.increment(counter2);
            System.out.print(counter2.getValue() + " ");
        }
        System.out.println();

        System.out.println("Counter2 decrement: ");
        for (int i = 0; i < 15; i++) {
            counterLogic.decrement(counter2);
            System.out.print(counter2.getValue() + " ");
        }
    }
}
