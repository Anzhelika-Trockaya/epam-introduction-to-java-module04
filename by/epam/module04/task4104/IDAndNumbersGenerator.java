package by.epam.module04.task4104;

public class IDAndNumbersGenerator {
    private final IDAndNumbersGenerator instance = new IDAndNumbersGenerator();
    private int currentId;
    private long currentAccountNumber;
    private final BankData data;

    private IDAndNumbersGenerator() {
        data = BankData.getInstance();
        this.currentId = data.getCurrentID();
        this.currentAccountNumber = data.getCurrentAccountNumber();
    }

    public IDAndNumbersGenerator getInstance(){
        return instance;
    }

    public int nextID() {
        currentId++;
        return currentId;
    }

    public long nextAccountNumber(){
        currentAccountNumber++;
        return currentAccountNumber;
    }
}
