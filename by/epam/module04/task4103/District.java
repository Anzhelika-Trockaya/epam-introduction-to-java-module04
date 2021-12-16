package by.epam.module04.task4103;

//3. Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
//столицу, количество областей, площадь, областные центры.

import java.util.Objects;

public class District {
    private final String name;
    private City center;

    public District(){
        this.name = "";
        this.center = null;
    }

    public District(String name, City center) {
            this.name = name;
            this.center = center;
    }

    public String getName() {
        return name;
    }

    public City getCenter(){
        return center;
    }

    public void setCenter(City center) {
            this.center = center;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", center=" + center +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof District)) return false;
        District district = (District) o;
        return name.equals(district.name) &&
                center.equals(district.center);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, center);
    }
}
