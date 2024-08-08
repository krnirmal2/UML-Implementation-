package org.example.COMPOSITION.LMS;

import org.example.AGGREGATION.Book;

import java.util.ArrayList;
import java.util.List;

// Catalog class (composes Books)
public class Catalog {
    private List<Book> books;

    public Catalog() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayCatalog() {
        for(Book book : books) {
            System.out.println(book.getTitle() + " by " + book.getAuthor().getName());
        }
    }
}