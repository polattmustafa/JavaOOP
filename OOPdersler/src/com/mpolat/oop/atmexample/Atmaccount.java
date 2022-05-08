package com.mpolat.oop.atmexample;

public class Atmaccount {

    private String userName;
    private String password;
    private int money;

    public Atmaccount(String userName, String password, int money) {
        this.userName = userName;
        this.password = password;
        this.money = money;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void addCash(int sum) {
        this.money += sum;
        System.out.println("Your new money is =>" + money);
    }

    public void withdrawCash(int sum) {
        if (sum > money) {
            System.out.println("You don't have enough money to withdraw");
        }
        else {
            money -= sum;
            System.out.println("Your new money is =>" + money);
        }
    }
}
