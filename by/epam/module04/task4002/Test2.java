package by.epam.module04.task4002;

//2. Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. Добавьте
//конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра
//класса.

public class Test2 {
    private String varString;
    private int varInt;

    public Test2() {
        varString = null;
        varInt = 0;
    }

    public Test2(String varString, int varInt) {
        this.varString = varString;
        this.varInt = varInt;
    }

    public void setVarString(String value) {
        varString = value;
    }

    public void setVarInt(int value) {
        varInt = value;
    }

    public String getVarString() {
        return varString;
    }

    public int getVarInt() {
        return varInt;
    }
}
