package org.example.ASSOCIATION;

class Driver {
    private final String name;

    public Driver(String name) {
        this.name = name;
    }

    public void drive(Car car) {
        System.out.println(this.name + " is driving " + car.getModel());
    }
}