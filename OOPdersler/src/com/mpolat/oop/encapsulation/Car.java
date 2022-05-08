package com.mpolat.oop.encapsulation;

public class Car {

    private String color;
    private int doors;
    private int wheels;
    private String engine;
    private String model;
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getDoors() {
        return doors;
    }
    public void setDoors(int doors) {
        if (doors < 0 ) {
            System.out.println("Door number can't be under 0!");
        }
        else {
            this.doors = doors;
        }
    }
    public int getWheels() {
        return wheels;
    }
    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
    public String getEngine() {
        return engine;
    }
    public void setEngine(String engine) {
        this.engine = engine;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    // Buraya kadar Private özellikler tanımlayıp getter and setter alındı

}
