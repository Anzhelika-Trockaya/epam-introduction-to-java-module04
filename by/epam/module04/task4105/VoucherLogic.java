package by.epam.module04.task4105;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class VoucherLogic {
    private final VoucherData data = VoucherData.getInstance();

    public List<TouristVoucher> allVouchers(){
        return data.getVouchers();
    }

    public List<TouristVoucher> filterTransport(List<TouristVoucher> vouchers, Transport transport) {
        return vouchers.stream()
                .filter(v -> (v.getTransport().equals(transport)))
                .collect(Collectors.toList());
    }

    public List<TouristVoucher> filterHotelStars(List<TouristVoucher> vouchers, int from, int to) {
        return vouchers.stream()
                .filter(v -> (v.getHotelStars() >= from && v.getHotelStars() <= to))
                .collect(Collectors.toList());
    }

    public List<TouristVoucher> filterType(List<TouristVoucher> vouchers, VoucherType type1, VoucherType type2) {
        return vouchers.stream()
                .filter(v -> (v.getType().equals(type1) || v.getType().equals(type2)))
                .collect(Collectors.toList());
    }

    public List<TouristVoucher> filterFood(List<TouristVoucher> vouchers, Food food1, Food food2, Food food3) {
        return vouchers.stream()
                .filter(v -> (v.getFood().equals(food1) || v.getFood().equals(food2) || v.getFood().equals(food3)))
                .collect(Collectors.toList());
    }

    public List<TouristVoucher> filterDays(List<TouristVoucher> vouchers, int from, int to) {
        return vouchers.stream()
                .filter(v -> (v.getDays() >= from && v.getDays() <= to))
                .collect(Collectors.toList());
    }

    public List<TouristVoucher> filterPrice(List<TouristVoucher> vouchers, int from, int to) {
        return vouchers.stream()
                .filter(v -> (v.getPrice() >= from && v.getPrice() <= to))
                .collect(Collectors.toList());
    }

    public List<TouristVoucher> sortByAscendingPrice(List<TouristVoucher> vouchers) {
        List<TouristVoucher> sortedVouchers;

        sortedVouchers=vouchers;
        sortedVouchers.sort(Comparator.comparingDouble(TouristVoucher::getPrice));

        return sortedVouchers;
    }

    public List<TouristVoucher> sortByDescendingPrice(List<TouristVoucher> vouchers) {
        List<TouristVoucher> sortedVouchers;

        sortedVouchers=vouchers;
        sortedVouchers.sort(Comparator.comparingDouble(TouristVoucher::getPrice).reversed());

        return sortedVouchers;
    }

    public List<TouristVoucher> sortByAscendingDays(List<TouristVoucher> vouchers) {
        List<TouristVoucher> sortedVouchers;

        sortedVouchers=vouchers;
        sortedVouchers.sort(Comparator.comparingInt(TouristVoucher::getDays));

        return sortedVouchers;
    }

    public List<TouristVoucher> sortByDescendingDays(List<TouristVoucher> vouchers) {
        List<TouristVoucher> sortedVouchers;

        sortedVouchers=vouchers;
        sortedVouchers.sort(Comparator.comparingInt(TouristVoucher::getDays).reversed());

        return sortedVouchers;
    }
}
