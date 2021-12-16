package by.epam.module04.task4105;

import java.util.ArrayList;
import java.util.List;

public class VoucherData {
    private static final VoucherData instance = new VoucherData();
    private final List<TouristVoucher> vouchers;

    private VoucherData() {
        vouchers = new ArrayList<>();
        vouchers.add(new TouristVoucher(1, VoucherType.REST, Country.TURKEY, Transport.AIRLINER,
                "Hotel REST", 3, Food.ALL_INCLUSIVE, 10, 450.00));
        vouchers.add(new TouristVoucher(2, VoucherType.REST, Country.TURKEY, Transport.AIRLINER,
                "Hotel Super", 5, Food.ALL_INCLUSIVE, 14, 600.00));
        vouchers.add(new TouristVoucher(3, VoucherType.ENTERTAINMENT, Country.BULGARIA, Transport.AIRLINER,
                "Hotel Bulgaria", 4, Food.BED_ANG_BREAKFAST, 8, 350.00));
        vouchers.add(new TouristVoucher(4, VoucherType.EXCURSION, Country.FRANCE, Transport.AIRLINER,
                "Hotel 5", 5, Food.HIGH_CLASS_ALL_INCLUSIVE, 5, 520.00));
        vouchers.add(new TouristVoucher(5, VoucherType.SAFARI_HUNTING_FISHING, Country.EGYPT, Transport.AIRLINER,
                "Hotel 3", 3, Food.FULL_BOARD_PLUS, 10, 700.00));
        vouchers.add(new TouristVoucher(6, VoucherType.REST, Country.BULGARIA, Transport.AIRLINER,
                "Hotel BG", 5, Food.ALL_INCLUSIVE, 7, 650.00));
        vouchers.add(new TouristVoucher(7, VoucherType.REST, Country.RUSSIA, Transport.BUS,
                "Hotel 564", 4, Food.ALL_INCLUSIVE, 14, 250.00));
        vouchers.add(new TouristVoucher(8, VoucherType.REST, Country.HUNGARY, Transport.AIRLINER,
                "Hotel 46223", 2, Food.FULL_BOARD_PLUS, 10, 345.00));
        vouchers.add(new TouristVoucher(9, VoucherType.REST, Country.GEORGIA, Transport.AIRLINER,
                "Hotel G", 4, Food.BED_ANG_BREAKFAST, 10, 625.00));
        vouchers.add(new TouristVoucher(10, VoucherType.FESTIVALS_COMPETITIONS_TOURNAMENTS, Country.BRASILIA, Transport.AIRLINER,
                "Hotel 56462324", 3, Food.BED_ANG_BREAKFAST, 5, 610.00));
        vouchers.add(new TouristVoucher(11, VoucherType.EXCURSION, Country.EGYPT, Transport.AIRLINER,
                "Hotel 9893", 2, Food.BED_ANG_BREAKFAST, 8, 245.00));
        vouchers.add(new TouristVoucher(12, VoucherType.REST, Country.ITALY, Transport.AIRLINER,
                "Hotel Italy", 3, Food.BED_ANG_BREAKFAST, 9, 420.00));
    }

    public static VoucherData getInstance() {
        return instance;
    }

    public List<TouristVoucher> getVouchers() {
        return vouchers;
    }

}
