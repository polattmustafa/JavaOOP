package com.mpolat.oop.encapsulation;

public class Test {

    public static void main(String[] args) {

        Car car = new Car();  // Car classından car adında obje oluşturma

        car.setColor("Yellow");
        car.setDoors(5);
        car.setEngine("2.3");
        car.setModel("Mustang");
        car.setWheels(4);           // Araba özellikleri atama

        int doorNumber = car.getDoors();
        String strDoor = Integer.toString(doorNumber);
        int wheelsNumber = car.getWheels();
        String strWheel = Integer.toString(wheelsNumber);

        // Aşağısı tüm girdileri alarak toplu şekilde yazdırmama yardımcı olan String.join kullanmamı sağladı
        String fullWrite = String.join(" ", car.getColor(), " => is car's color\n", car.getEngine(), " => is car's engine power\n", car.getModel(), " => is the car's model\n", strWheel, " => is car's wheel number\n", strDoor, " => is car's door number");
        System.out.println(fullWrite);

    }
}
