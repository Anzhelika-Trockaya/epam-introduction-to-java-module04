package by.epam.module04.task4009;

//9. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
//метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
//методами. Задать критерии выбора данных и вывести эти данные на консоль.
//Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
//Найти и вывести:
//a) список книг заданного автора;
//b) список книг, выпущенных заданным издательством;
//c) список книг, выпущенных после заданного года.

import java.io.Serializable;
import java.util.Arrays;

public class BookShop implements Serializable {
    private static final int DEFAULT_NUMBER_OF_BOOKS = 100;
    private String name;
    private Book[] books;

    public BookShop() {
        name = "";
        this.books = new Book[DEFAULT_NUMBER_OF_BOOKS];
    }

    public BookShop(String name) {
        this.name = name;
        this.books = new Book[DEFAULT_NUMBER_OF_BOOKS];
    }

    public BookShop(String name, Book[] books) {
        this.name = name;
        this.books = books;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public Book[] getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "name='" + name + '\'' +
                ", books=" + Arrays.toString(books) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BookShop)) return false;
        BookShop bookShop = (BookShop) o;
        return name.equals(bookShop.name) &&
                Arrays.equals(books, bookShop.books);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + Arrays.hashCode(books);
        return result;
    }
}
