package by.epam.module04.task4009;
//9. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
//метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
//методами. Задать критерии выбора данных и вывести эти данные на консоль.
//Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
//Найти и вывести:
//a) список книг заданного автора;
//b) список книг, выпущенных заданным издательством;
//c) список книг, выпущенных после заданного года.

import java.util.List;

public class Main {
    public static void main(String[] args) {
        BookShop shop;
        Book[] books;
        InfoShower shower;
        List<Book> filteredBooks;
        BookShopLogic bookShopLogic;
        BooksData data;

        data = new BooksData();
        books = data.getBooks();
        shop = new BookShop("House of book", books);
        bookShopLogic = new BookShopLogic();
        shower = new InfoShower();

        shower.printBooks(shop.getBooks());

        filteredBooks = bookShopLogic.booksOfAuthor(shop, "J. K. Rowling");
        shower.printMessage("Books of J. K. Rowling:");
        shower.printBooks(filteredBooks);

        filteredBooks = bookShopLogic.booksOfPublisher(shop, "The Russian Messenger");
        shower.printMessage("Books of publishing house \"The Russian Messenger\":");
        shower.printBooks(filteredBooks);

        filteredBooks = bookShopLogic.booksPublishedAfterYear(shop, 1900);
        shower.printMessage("Books published after 1900: ");
        shower.printBooks(filteredBooks);
    }
}
