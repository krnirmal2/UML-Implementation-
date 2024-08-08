package org.example.INHERITANCE.LMS;

import org.example.AGGREGATION.Book;
import org.example.Person;

// Librarian class (inherits from Person)
public class Librarian extends Person {
    public Librarian(String name) {
        super(name);
    }

    public void manageLibrary() {
        System.out.println(getName() + " is managing the library.");
    }
}