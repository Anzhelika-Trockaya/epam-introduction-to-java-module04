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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Book implements Serializable {
    private static int currentId = 1;

    private int id;
    private String title;
    private List<String> authors;
    private String publisher;
    private int yearOfPublication;
    private int pages;
    private double price;
    private String bindingType;

    public Book() {
        this.id = currentId++;
        this.title = "";
        this.authors = new ArrayList<>(1);
        this.publisher = "";
        this.yearOfPublication = 1900;
        this.pages = 0;
        this.price = 0.0;
        this.bindingType = "";
    }

    public Book(String title, List<String> authors, String publisher, int yearOfPublication, int pages, double price, String bindingType) {
        if (title.isEmpty()) {
            throw new IllegalArgumentException("Title cannot be an empty string!");
        }
        if (authors.isEmpty() || authors.get(0).isEmpty()) {
            throw new IllegalArgumentException("Author cannot be an empty string!");
        }
        if (publisher.isEmpty()) {
            throw new IllegalArgumentException("Publisher cannot be an empty string!");
        }
        if (yearOfPublication < 0 || yearOfPublication > LocalDate.now().getYear()) {
            throw new IllegalArgumentException("Incorrect year of publication!");
        }
        if (pages < 0) {
            throw new IllegalArgumentException("Number of pages must be positive!");
        }
        if (price < 0) {
            throw new IllegalArgumentException("Price must be positive!");
        }

        this.id = currentId++;
        this.title = title;
        this.authors = authors;
        this.publisher = publisher;
        this.yearOfPublication = yearOfPublication;
        this.pages = pages;
        this.price = price;
        this.bindingType = bindingType;
    }

    public Book(String title, String author, String publisher, int yearOfPublication, int pages, double price, String bindingType) {
        if (title.isEmpty()) {
            throw new IllegalArgumentException("Title cannot be an empty string!");
        }
        if (author.isEmpty()) {
            throw new IllegalArgumentException("Author cannot be an empty string!");
        }
        if (publisher.isEmpty()) {
            throw new IllegalArgumentException("Publisher cannot be an empty string!");
        }
        if (yearOfPublication < 0 || yearOfPublication > LocalDate.now().getYear()) {
            throw new IllegalArgumentException("Incorrect year of publication!");
        }
        if (pages < 0) {
            throw new IllegalArgumentException("Number of pages must be positive!");
        }
        if (price < 0) {
            throw new IllegalArgumentException("Price must be positive!");
        }

        id = currentId++;
        this.title = title;
        this.authors = new ArrayList<>(1);
        authors.add(author);
        this.publisher = publisher;
        this.yearOfPublication = yearOfPublication;
        this.pages = pages;
        this.price = price;
        this.bindingType = bindingType;
    }


    public int getId() {
        return id;
    }

    public void setAuthors(List<String> authors) {
        if (authors != null && !authors.isEmpty() && authors.get(0) != null && !authors.get(0).isEmpty()) {
            this.authors = authors;
        } else {
            throw new IllegalArgumentException("List of authors cannot be empty!");
        }
    }

    public void changeAuthor(String author) {
        if (author != null && !author.isEmpty()) {
            this.authors.clear();
            this.authors.add(author);
        } else {
            throw new IllegalArgumentException("Authors name cannot be an empty string!");
        }
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setTitle(String title) {
        if (!title.isEmpty()) {
            this.title = title;
        } else {
            throw new IllegalArgumentException("Title cannot be an empty string!");
        }
    }

    public String getTitle() {
        return title;
    }

    public void setPublisher(String publisher) {
        if (publisher!=null && !publisher.isEmpty()) {
            this.publisher = publisher;
        } else {
            throw new IllegalArgumentException("Publishing house cannot be an empty string!");
        }
    }

    public String getPublisher() {
        return publisher;
    }

    public void setYearOfPublication(int yearOfPublication) {
        if (yearOfPublication > 0 && yearOfPublication < LocalDate.now().getYear()) {
            this.yearOfPublication = yearOfPublication;
        } else {
            throw new IllegalArgumentException("Incorrect year of publication!");
        }
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setPages(int pages) {
        if (pages > 0) {
            this.pages = pages;
        } else {
            throw new IllegalArgumentException("Number of pages must be positive!");
        }
    }

    public int getPages() {
        return pages;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            throw new IllegalArgumentException("Price must be positive!");
        }
    }

    public double getPrice() {
        return price;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }

    public String getBindingType() {
        return bindingType;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", authors=" + authors +
                ", publishingHouse='" + publisher + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                ", pages=" + pages +
                ", price=" + price +
                ", bindingType='" + bindingType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return id == book.id &&
                yearOfPublication == book.yearOfPublication &&
                pages == book.pages &&
                Double.compare(book.price, price) == 0 &&
                Objects.equals(title, book.title) &&
                Objects.equals(authors, book.authors) &&
                Objects.equals(publisher, book.publisher) &&
                Objects.equals(bindingType, book.bindingType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, authors, publisher, yearOfPublication, pages, price, bindingType);
    }
}
