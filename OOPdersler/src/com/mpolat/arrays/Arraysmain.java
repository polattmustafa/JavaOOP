package com.mpolat.arrays;

public class Arraysmain {
    public void arrayiBastir(int[] array) { // bu fonksiyon sayesinde direk array yazdırılır.


        for (int i = 0; i < array.length; i++) {
            System.out.println(i+1 + ". sıradaki eleman = " + array[i]);
        }

    }

    public static void main(String[] args) {

        int[] a = new int[5]; // a dizi referansı içinde 5 tane değer tanımlanıyor
        a[2] = 57; // a'nın 2. indeksine 57 değerini atıyor

        int[] b = {10,20,30,40,50};
       // System.out.println(b[0]);
        //System.out.println(b[6]); // hata verir çünkü array 5 elemanlı ve son indeksi 4

        int[] c = new int[5];
        for (int i = 0; i < c.length;i++) {
            c[i] = i * 3 + 5;
            System.out.println(c[i]);
            // for döngüsü i'yi 0'dan başlatıp 1 arttırarak 3 katının 5 fazlasını veriyor
        }

        int[] d = new int[6];
        System.out.println(d.length); // arrayin uzunlugunu verir


    }
}
