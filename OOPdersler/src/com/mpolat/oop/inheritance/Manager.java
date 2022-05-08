package com.mpolat.oop.inheritance;

public class Manager extends Workers{ //Sub Class extends kelimesiyle base class'dan kalıtım(tüm özellikklerini) aldım

    private int outhorizePerson;
    public Manager(String name,int salary, String department, int outhorizePerson) {
        super(name,salary,department); //super anahtar kelimesiyle baseclass'da olan constructoru direk olarak çağırmış oldum
        this.outhorizePerson = outhorizePerson;
    }

    public void makeRaise(int raiseAmount) {
        System.out.println("Worker were given a => " + raiseAmount);
    }

    @Override //Override inheritance ettiğimiz metot'dan aynı isimdeki metodun içeriğini değiştirmemizi sağlar
    public void showInformation() {
        System.out.println("Name: " +getName());
        System.out.println("Salary: " + getSalary());
        System.out.println("Department: " + getDepartment());
        System.out.println("Outhorized person : " + this.outhorizePerson);
    }
}
