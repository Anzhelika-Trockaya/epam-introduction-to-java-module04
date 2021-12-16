package by.epam.module04.task4005;

public class CounterLogic {

    public Counter createCounter(int value, int rangeStart, int rangeEnd) {
        Counter counter;

        if (rangeStart <= value && value <= rangeEnd) {
            counter = new Counter(value, rangeStart, rangeEnd);
            return counter;
        } else {
            throw new IllegalArgumentException("Counter is not created! Incorrect data of counter!");
        }
    }

    public Counter createCounter(int rangeStart, int rangeEnd) {
        Counter counter;

        if (rangeStart <= rangeEnd) {
            counter = new Counter(rangeStart, rangeEnd);
            return counter;
        } else {
            throw new IllegalArgumentException("Counter is not created! Incorrect data of counter!");
        }
    }

    public Counter createCounter() {
        return new Counter();
    }

    public void increment(Counter counter) {
        if (counter.getValue() < counter.getRangeEnd()) {
            counter.setValue(counter.getValue() + 1);
        } else {
            counter.setValue(counter.getRangeStart());
        }
    }

    public void decrement(Counter counter) {
        if (counter.getValue() > counter.getRangeStart()) {
            counter.setValue(counter.getValue() - 1);
        } else {
            counter.setValue(counter.getRangeEnd());
        }
    }
}
