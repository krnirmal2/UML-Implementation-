package org.example.INHERITANCE.LMS;

import org.example.AGGREGATION.Book;
import org.example.Person;

public class Member extends Person {
    public Member(String name) {
        super(name);
    }

    public void borrowBook(Book book) {
        System.out.println(getName() + " is borrowing " + book.getTitle());
    }
}
