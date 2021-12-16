package by.epam.module04.task4009;

public class BooksData {
    public Book[] getBooks() {
        Book[] books;

        books = new Book[7];
        books[0] = new Book("Harry Potter and the Philosopher's Stone", "J. K. Rowling",
                "Bloomsbury Publishing", 1997, 223, 100, "hardcover");
        books[1] = new Book("The Thorn Birds", "Colleen McCullough",
                "Harper & Row", 1977, 692, 120, "hardcover");
        books[2] = new Book("Anna Karenina", "Leo Tolstoy",
                "The Russian Messenger", 1878, 864, 170, "hardcover");
        books[3] = new Book("War and Peace", "Leo Tolstoy",
                "The Russian Messenger", 1869, 1225, 200, "hardcover");
        books[4] = new Book("Family Happiness", "Leo Tolstoy",
                "The Russian Messenger", 1859, 214, 80, "hardcover");
        books[5] = new Book("Harry Potter and and the Half-Blood Prince", "J. K. Rowling",
                "Bloomsbury Publishing", 2005, 607, 160, "hardcover");
        books[6] = new Book("Harry Potter and the Deathly Hallows", "J. K. Rowling",
                "Bloomsbury Publishing", 2007, 607, 150, "hardcover");

        return books;
    }
}
