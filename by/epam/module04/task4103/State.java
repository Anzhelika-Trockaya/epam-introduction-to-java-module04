package by.epam.module04.task4103;

//3. Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
//столицу, количество областей, площадь, областные центры.

import java.util.Arrays;
import java.util.Objects;

public class State {
    private final String name;
    private City center;
    private Region[] regions;
    private double square;

    public State() {
        name="";
    }

    public State(String name, City center) {
        this.name = name;
        this.center = center;
        this.regions = null;
        this.square = 0.0;
    }

    public State(String name, City center, Region[] regions) {
        this.name = name;
        this.center = center;
        this.regions = regions;
        this.square = 0.0;
    }

    public State(String name, City center, Region[] regions, double square) {
        this.name = name;
        this.center = center;
        this.regions = regions;
        this.square = square;
    }

    public String getName() {
        return name;
    }

    public City getCenter() {
        return center;
    }

    public void setCenter(City center) {
        this.center = center;
    }

    public Region[] getRegions() {
        return regions;
    }

    public void setRegions(Region[] regions) {
        this.regions = regions;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", center=" + center +
                ", regions=" + Arrays.toString(regions) +
                ", square=" + square +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof State)) return false;
        State state = (State) o;
        return Double.compare(state.square, square) == 0 &&
                Objects.equals(name, state.name) &&
                Objects.equals(center, state.center) &&
                Arrays.equals(regions, state.regions);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, center, square);
        result = 31 * result + Arrays.hashCode(regions);
        return result;
    }
}
