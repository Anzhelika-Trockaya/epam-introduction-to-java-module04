package by.epam.module04.task4105;

//5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
//различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
//возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.

import java.io.Serializable;
import java.util.Objects;

public class TouristVoucher implements Serializable {
    private int id;
    private VoucherType type;
    private Country country;
    private Transport transport;
    private String hotelName;
    private int hotelStars;
    private Food food;
    private int days;
    private double price;

    public TouristVoucher() {
    }

    public TouristVoucher(VoucherType type, Country country, Transport transport,
                          String hotelName, int hotelStars, Food food, int days, double price) {
        this.id = 0;
        this.type = type;
        this.country = country;
        this.transport = transport;
        this.hotelName = hotelName;
        this.hotelStars = hotelStars;
        this.food = food;
        this.days = days;
        this.price = price;
    }

    public TouristVoucher(int id, VoucherType type, Country country, Transport transport,
                          String hotelName, int hotelStars, Food food, int days, double price) {
        this.id = id;
        this.type = type;
        this.country = country;
        this.transport = transport;
        this.hotelName = hotelName;
        this.hotelStars = hotelStars;
        this.food = food;
        this.days = days;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public int getDays() {
        return days;
    }

    public int getId() {
        return id;
    }

    public VoucherType getType() {
        return type;
    }

    public Country getCountry() {
        return country;
    }

    public Transport getTransport() {
        return transport;
    }

    public String getHotelName() {
        return hotelName;
    }

    public int getHotelStars() {
        return hotelStars;
    }

    public Food getFood() {
        return food;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "id=" + id +
                ", type=" + type +
                ", country=" + country +
                ", transport=" + transport +
                ", hotelName='" + hotelName + '\'' +
                ", hotelStars=" + hotelStars +
                ", food=" + food +
                ", days=" + days +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TouristVoucher)) return false;
        TouristVoucher that = (TouristVoucher) o;
        return id == that.id &&
                hotelStars == that.hotelStars &&
                days == that.days &&
                Double.compare(that.price, price) == 0 &&
                type == that.type &&
                country == that.country &&
                transport == that.transport &&
                Objects.equals(hotelName, that.hotelName) &&
                food == that.food;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, country, transport, hotelName, hotelStars, food, days, price);
    }
}
