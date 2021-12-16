package by.epam.module04.task4009;

import java.util.List;

public class InfoShower {
    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printBooks(Book[] books) {
        String formatString;
        String line;

        formatString = "%4s |%50s |%20s |%25s |%5s |%5s |%6s |%12s";
        line = "---------------------------------------------------------------------------------------------------------" +
                "-------------------------------------";

        System.out.printf(formatString
                , "id", "title", "authors", "publishingHouse", "year", "pages", "price", "binding type");

        System.out.println();
        System.out.println(line);

        for (Book book : books) {
            System.out.printf(formatString, book.getId(), book.getTitle(), book.getAuthors().toString()
                    , book.getPublisher(), book.getYearOfPublication(), book.getPages(), book.getPrice()
                    , book.getBindingType());

            System.out.println();
        }
        System.out.println();
    }

    public void printBooks(List<Book> books) {
        String formatString;
        String line;

        formatString = "%4s |%50s |%20s |%25s |%5s |%5s |%6s |%12s";
        line = "---------------------------------------------------------------------------------------------------------" +
                "-------------------------------------";

        System.out.printf(formatString
                , "id", "title", "authors", "publishingHouse", "year", "pages", "price", "binding type");

        System.out.println();
        System.out.println(line);

        for (Book book : books) {
            System.out.printf(formatString, book.getId(), book.getTitle(), book.getAuthors().toString()
                    , book.getPublisher(), book.getYearOfPublication(), book.getPages(), book.getPrice()
                    , book.getBindingType());

            System.out.println();
        }
        System.out.println();
    }
}
