package com.mpolat.oop.atmexample;

import java.util.Scanner;

public class Login {
    public boolean login(Atmaccount atmaccount) {

        Scanner scanner = new Scanner(System.in);
        String kullanici_adi;
        String parola;

        System.out.println("Kullanici adi: ");
        kullanici_adi = scanner.nextLine();
        System.out.println("Parola: ");
        parola = scanner.nextLine();

        if (atmaccount.getUserName().equals(kullanici_adi) && atmaccount.getPassword().equals(parola)) {
            return true;
        }
        else {
            return false;
        }
    }
}
