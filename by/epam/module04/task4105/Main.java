package by.epam.module04.task4105;

//5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
//различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
//возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.

import java.util.List;

public class Main {
    public static void main(String[] args) {
        VoucherLogic logic;
        InfoShower shower;
        List<TouristVoucher> filteredVouchers;

        logic = new VoucherLogic();
        shower = new InfoShower();

        filteredVouchers = logic.filterTransport(logic.allVouchers(), Transport.AIRLINER);
        filteredVouchers = logic.filterFood(filteredVouchers, Food.ALL_INCLUSIVE, Food.BED_ANG_BREAKFAST, null);
        filteredVouchers = logic.filterDays(filteredVouchers, 8, 14);
        filteredVouchers = logic.sortByAscendingDays(filteredVouchers);

        shower.printMessage("We will find all vouchers:\ntransport = airliner,\nfood = all_inclusive or bed_and_breakfast,"
                + "\n8-14 days,\nSort by ascending days.");
        shower.printVouchersList(filteredVouchers);

        filteredVouchers = logic.sortByDescendingPrice(filteredVouchers);

        shower.printVouchersList("Sort by descending price", filteredVouchers);

        filteredVouchers = logic.filterType(filteredVouchers, VoucherType.REST, null);

        shower.printVouchersList("filter type = REST", filteredVouchers);
    }
}
