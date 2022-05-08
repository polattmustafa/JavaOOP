package com.mpolat.oop.atmexample;

import java.util.Scanner;

public class ATM {

    public void work(Atmaccount atmaccount) {
        Login login = new Login();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome To Our Bank");
        System.out.println("*******************");
        System.out.println("User Login");
        System.out.println("*******************");
        int entryRight = 3;

        while (true) {
            if (login.login(atmaccount)) {
                System.out.println("Succesful entry");
                break;
            }
            else {
                System.out.println("Unsuccesful entry try again");
                entryRight -= 1;
                System.out.println("Your entry right => " + entryRight);
            }
            if (entryRight == 0) {
                System.out.println("Your entry right has been finished");
                return;
            }
        }

        System.out.println("***********************");
        String islemler = "1. Show money\n" +
                          "2. Add cash\n" +
                          "3. Withdraw money\n" +
                          "Press q for the quit";
        System.out.println(islemler);

        while (true) {
            System.out.println("Choose the process ");
            String islem = scanner.nextLine();

            if (islem.equals("q")) {
                break;
            }
            else if (islem.equals("1")) {
                System.out.println("Your mones is => " + atmaccount.getMoney());
            }
            else if (islem.equals("2")) {
                System.out.println("How much money do you want to add =>");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                atmaccount.addCash(tutar);
            }
            else if (islem.equals("3")) {
                System.out.println("How much money do you want to withdraw =>");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                atmaccount.withdrawCash(tutar);
            }
            else {
                System.out.println("Unexpected process");
            }
        }
    }
}
