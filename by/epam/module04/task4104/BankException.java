package by.epam.module04.task4104;

public class BankException extends Exception {
    public BankException(Exception exception) {
        super(exception);
    }

    public BankException(String message, Exception exception) {
        super(message, exception);
    }

    public BankException(String message) {
        super(message);
    }

    public BankException() {
        super();
    }
}
