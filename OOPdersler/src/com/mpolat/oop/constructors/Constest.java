package com.mpolat.oop.constructors;

public class Constest {
    public static void main(String[] args) {

        Account account = new Account();

      /*  Account account1 = new Account("1232",1000,"Mustafa Polat","mustfplt4@gmail.com","05123");
        account1.addCash(500); // hesaba 500tl para ekliyor
        account1.withdrawMoney(2000); // 1500 üzeri para çekmeye çalışıldığı için hata verecek

      */

        Account account1 = new Account("Ahmet","example@gmail.com","5645635");

        /* System.out.println(account1.getEmail());
        System.out.println(account1.getMoney());
        System.out.println(account1.getName()); */

        account1.showInformation();

    }
}
