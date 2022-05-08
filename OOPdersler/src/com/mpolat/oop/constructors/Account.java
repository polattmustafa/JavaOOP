package com.mpolat.oop.constructors;

public class Account {
    private String accountNumber;
    private double money;
    private String name;
    private String email;
    private String phone;

    public Account() {
        // Constructor oluştururken Class ismi ile beraber account aynı olmak zorundadır
        // System.out.println("Default Constructor");

      /*  this.accountNumber ="No information";
        this.money = 0;
        this.name ="No information";
        this.email = "No information";
        this.phone = "No information"; */

        this("No information",0.0,"No information","No information","No information");

    }

    public Account(String name,String email,String phone) {
        /* this.name = name;
        this.email = email;
        this.phone = phone;

        this.money = 0.0;
        this.accountNumber = "No information"; */

        this("No information", 0.0,name,email,phone);
    }

    public Account(String accountNumber, double money, String name, String email, String phone) {
        // İçerisine bu class'da oluşturduğum değişkenleri parametre olarak yolladım.
        this.accountNumber = accountNumber;
        this.money = money;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public void addCash(double amount) {
        money += amount;
        System.out.println("New money = " + money);
    }

    public void showInformation() {
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Your Money: " + this.money);
        System.out.println("Mail: "+ this.email);
        System.out.println("Name: " + this.name);
        System.out.println("Phone number: " + this.phone);

    }

    public void withdrawMoney(double amount) {
        if (amount > 1500) {
            System.out.println("You can't withdraw money over 1500 in a day.");
        }
        if (amount > money) {
            System.out.println("You don't have enough money, your money = " + money );
        }
        else {
            money -= amount;
            System.out.println("New money = " + money);
        }
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

/*
    3 tane constructor yazdım ayrıca 2 tane ekstra para ekleme ve çekme fonksiyonları yazdım
    Geri kalan yer getter ver setterlar.
 */
