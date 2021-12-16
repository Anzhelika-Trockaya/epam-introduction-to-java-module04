package by.epam.module04.task4101;

import java.io.Serializable;

public class Word implements Serializable {
    private final String string;

    public Word(String string) {
        if (string != null && string.matches("[A-Za-zА-Яа-яЁё0-9]+(?:[-_][A-Za-zА-Яа-яЁё0-9]+)*")) {
            this.string = string;
        } else {
            throw new IllegalArgumentException("Incorrect word!");
        }
    }

    public String getString() {
        return string;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "string='" + string + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Word)) return false;
        Word word = (Word) o;
        return string.equals(word.string);
    }

    @Override
    public int hashCode() {
        return string.hashCode();
    }
}
