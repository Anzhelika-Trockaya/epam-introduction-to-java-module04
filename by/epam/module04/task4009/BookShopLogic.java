package by.epam.module04.task4009;

import java.util.ArrayList;
import java.util.List;

public class BookShopLogic {

    public BookShopLogic() {
    }

    public List<Book> booksOfAuthor(BookShop shop, String author) {
        Book[] allBooks;
        List<Book> booksOfAuthor = new ArrayList<>();

        allBooks = shop.getBooks();

        for (Book book : allBooks) {
            for (String authorOfBook : book.getAuthors()) {
                if (authorOfBook.equals(author)) {
                    booksOfAuthor.add(book);
                }
            }
        }

        return booksOfAuthor;
    }

    public List<Book> booksOfPublisher(BookShop shop, String publisher) {
        Book[] allBooks;
        List<Book> booksOfPublisher = new ArrayList<>();

        allBooks = shop.getBooks();

        for (Book book : allBooks) {
            if (book.getPublisher().equals(publisher)) {
                booksOfPublisher.add(book);
            }
        }

        return booksOfPublisher;
    }

    public List<Book> booksPublishedAfterYear(BookShop shop, int year) {
        Book[] allBooks;
        List<Book> publishedAfterYear = new ArrayList<>();

        allBooks = shop.getBooks();

        for (Book book : allBooks) {
            if (book.getYearOfPublication() > year) {
                publishedAfterYear.add(book);
            }
        }

        return publishedAfterYear;
    }
}
