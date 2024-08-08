package org.example.AGGREGATION;


import org.example.Author;

public class Book {
    private final String title;
    private Author author;

    public Book(String title) {
        this.title = title;
    }
    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }
}
