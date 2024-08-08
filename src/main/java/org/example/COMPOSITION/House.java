package org.example.COMPOSITION;

public class House {
    private final Room room;

    public House() {
        room = new Room();
    }

    public void describe() {
        room.describe();
    }
}
