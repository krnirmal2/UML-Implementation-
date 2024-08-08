package org.example;

import org.example.AGGREGATION.Book;
import org.example.AGGREGATION.Library;
import org.example.DEPENDENCY.Document;
import org.example.DEPENDENCY.Printer;
import org.example.INHERITANCE.LMS.Librarian;
import org.example.COMPOSITION.LMS.Catalog;
import org.example.INHERITANCE.LMS.Member;


public class OnlineLibraryManagementSystem {
    public static void main(String[] args) {
       /*
        Association: A Member can borrow a Book.
        Aggregation: A Library contains many Books.
        Composition: A Catalog is composed of Books.
        Inheritance: Librarian and Member inherit from Person.
        Dependency: Printer uses Document to print details.
        */
    // Creating objects
    Author author = new Author("George Orwell");
    Book book1 = new Book("1984", author);
    Book book2 = new Book("Animal Farm", author);

    Library library = new Library();
    library.addBook(book1);
    library.addBook(book2);

    Catalog catalog = new Catalog();
    catalog.addBook(book1);
    catalog.addBook(book2);

    Member member = new Member("Alice");
    member.borrowBook(book1);

    Librarian librarian = new Librarian("Bob");
    librarian.manageLibrary();

    Document doc = new Document("Library Report");
    Printer printer = new Printer();
    printer.print(doc);

    library.showBooks();
    catalog.displayCatalog();
}
}
