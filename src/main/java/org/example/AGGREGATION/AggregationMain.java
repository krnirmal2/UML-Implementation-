package org.example.AGGREGATION;

public class AggregationMain {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("1984");
        Book book2 = new Book("Brave New World");

        library.addBook(book1);
        library.addBook(book2);

        library.showBooks();
    }
}
