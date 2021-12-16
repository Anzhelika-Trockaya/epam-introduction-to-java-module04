package by.epam.module04.task4001;

//1. Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
//переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
//наибольшее значение из этих двух переменных.

public class Main {
    public static void main(String[] args) {
        Test1 test1 = new Test1();

        test1.setVar1(5);
        test1.setVar2(10);

        test1.printVariables();

        System.out.println("Sum = " + test1.sum());
        System.out.println("Max = " + test1.max());
    }
}
