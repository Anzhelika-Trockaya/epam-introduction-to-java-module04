package by.epam.module04.task4104;

public class ConverterUtil {
    public static long convertDoubleAmountToLongKopecks(double amount) {
        return (long) (amount * 100);
    }

    public static String longToDoubleString(long balance) {
        String longStr;

        longStr = Long.toString(balance);
        longStr = (longStr.length() > 2) ? longStr : ((longStr.length() == 2) ? "0" + longStr : "00" + longStr);

        return longStr.substring(0, longStr.length() - 2) + "." + longStr.substring(longStr.length() - 2);
    }
}
