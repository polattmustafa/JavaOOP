package com.mpolat.oop.polymorphism;

class Animal {
    private String name;

    public Animal (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String speak() {
        return "Animal speaking...";
    }

}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return this.getName() + " meowing";
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return this.getName() + " havliyor";
    }
}

class Horse extends Animal {
    public Horse(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return this.getName() + " kisniyor";
    }
}

public class Polymain {
    public static void konustur(Animal animal) {
        System.out.println(animal.speak());
    }
    public static void main(String[] args) {
       /* Animal animal = new Cat("Peynir");
        Animal animal1 = new Dog("Zeytin");
        Animal animal2 = new Horse("Dortnal");

        System.out.println(animal.speak());
        System.out.println(animal1.speak());
        System.out.println(animal2.speak()); */

        konustur(new Cat("Peynir"));
        konustur(new Dog("Zeytin"));
        konustur(new Horse("Dortnal"));

    }
}
