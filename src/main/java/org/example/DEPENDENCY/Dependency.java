package org.example.DEPENDENCY;

public class Dependency {
    public static void main(String[] args) {
        Document doc = new Document("Hello, world!");
        Printer printer = new Printer();
        printer.print(doc);
    }
}
