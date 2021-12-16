package by.epam.module04.task4103;

//3. Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
//столицу, количество областей, площадь, областные центры.

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

public class Region implements Serializable {
    private final String name;
    private City center;
    private District[] districts;

    public Region() {
        this.name="";
    }

    public Region(String name, City center, District[] districts) {
        this.name = name;
        this.center = center;
        this.districts = districts;
    }

    public String getName() {
        return name;
    }

    public void setCenter(City center) {
        this.center = center;
    }

    public City getCenter() {
        return center;
    }

    public void setDistricts(District[] districts) {
        this.districts = districts;
    }

    public District[] getDistricts() {
        return districts;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", center=" + center +
                ", districts=" + Arrays.toString(districts) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Region)) return false;
        Region region = (Region) o;
        return name.equals(region.name) &&
                center.equals(region.center) &&
                Arrays.equals(districts, region.districts);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, center);
        result = 31 * result + Arrays.hashCode(districts);
        return result;
    }
}
