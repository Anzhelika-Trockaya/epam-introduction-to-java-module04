package by.epam.module04.task4005;

//5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
//на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
//произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
//позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.

import java.io.Serializable;

public class Counter implements Serializable {
    private int value;
    private int rangeStart;
    private int rangeEnd;

    public Counter() {
        value = 0;
        rangeStart = 0;
        rangeEnd = 10;
    }

    public Counter(int rangeStart, int rangeEnd) {
        this.value = rangeStart;
        this.rangeStart = rangeStart;
        this.rangeEnd = rangeEnd;
    }

    public Counter(int value, int rangeStart, int rangeEnd) {
        this.value = value;
        this.rangeStart = rangeStart;
        this.rangeEnd = rangeEnd;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getRangeStart() {
        return rangeStart;
    }

    public void setRangeStart(int rangeStart) {
        this.rangeStart = rangeStart;
    }

    public int getRangeEnd() {
        return rangeEnd;
    }

    public void setRangeEnd(int rangeEnd) {
        this.rangeEnd = rangeEnd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Counter)) return false;
        Counter counter = (Counter) o;
        return value == counter.value &&
                rangeStart == counter.rangeStart &&
                rangeEnd == counter.rangeEnd;
    }

    @Override
    public int hashCode() {
        int result = value;
        result = result * 31 + rangeStart;
        result = result * 31 + rangeEnd;
        return result;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "value=" + value +
                ", rangeStart=" + rangeStart +
                ", rangeEnd=" + rangeEnd +
                '}';
    }
}
