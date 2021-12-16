package by.epam.module04.task4105;

import java.util.List;

public class InfoShower {
    public void printMessage(String message) {
        System.out.println(message);
        System.out.println();
    }

    public void printVouchersList(List<TouristVoucher> vouchers) {
        String format;
        String line;

        format = " %4s | %15s | %15s | %10s | %20s | %6s | %20s | %4s | %6s |%s";
        line = "-----------------------------------------------------------------------------------------------------" +
                "--------------------------";

        System.out.println(line);
        System.out.printf(format, "ID", "Type", "Country", "Transport", "Hotel", "Stars", "Food", "Days", "Price", "\n");
        System.out.println(line);

        for (TouristVoucher voucher : vouchers) {
            System.out.printf(format
                    , voucher.getId()
                    , voucher.getType()
                    , voucher.getCountry()
                    , voucher.getTransport()
                    , voucher.getHotelName()
                    , voucher.getHotelStars()
                    , voucher.getFood()
                    , voucher.getDays()
                    , voucher.getPrice()
                    , "\n");
        }

        System.out.println(line);
        System.out.println();
    }

    public void printVouchersList(String message, List<TouristVoucher> vouchers) {
        System.out.println(message);
        printVouchersList(vouchers);
    }
}
