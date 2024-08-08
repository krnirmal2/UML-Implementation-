package org.example.DEPENDENCY;

public class Printer {
    public void print(Document doc) {
        System.out.println("Printing document: " + doc.getContent());
    }
}
