package com.mpolat.arrays;

import java.util.ArrayList;

public class ArrayListTest {

    public static void yazdir(ArrayList<String> a) { //bu fonksiyon sadece arraylist elemanlarını yazdırmayı sağlıyor
        for (int i = 0; i < a.size(); i++) {
            System.out.println((i+1) + ". = " + a.get(i));
        }
    }

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList();

        arrayList.add("Lord of the Rings");
        arrayList.add("Harry Potter");
        arrayList.add("Interstellar");
        arrayList.add("Hobbit"); //arraylist içine ekleme yaptım

        // arraylist.  yazdıktan sonra pek çok fonksiyon çıkmaktadır.

        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(2)); // index numarasına göre çağırdım

        System.out.println(arrayList.size()); //arraylistin boyutunu verir

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        } //arraylist değerlerini tek tek yazdıdır

        arrayList.remove("Hobbit"); // arraylistden hobbit kaldırılır ya da index numarası yazabilirdim.
        System.out.println(arrayList);


    }
}
