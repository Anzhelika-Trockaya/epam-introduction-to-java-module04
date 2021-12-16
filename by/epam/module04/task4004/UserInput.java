package by.epam.module04.task4004;

import java.util.Scanner;

public class UserInput {
    private final Scanner scanner = new Scanner(System.in);

    public int inputNumber(String message) {
        int number;

        System.out.print(message);
        if (!scanner.hasNextInt()) {
        }
        number = scanner.nextInt();

        return number;
    }
}
