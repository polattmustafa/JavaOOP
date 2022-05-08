package com.mpolat.oop.atmexample;

public class ATMmain {
    public static void main(String[] args) {
        ATM atm = new ATM();

        Atmaccount atmaccount = new Atmaccount("Mustafa Polat","12345",2000);

        atm.work(atmaccount);
        System.out.println("Exiting the program");
    }
}
