package com.mpolat.arrays;

public class ForEach {
    public static void main(String[] args) {

        String[] array = {"Muz", "Kiraz", "Elma", "Armut"};
        int[] array2 = {1,2,3,4,5,6,7};

       /* for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        } */// for döngüsüyle normal olarak bir array böyle yazdırılır


        for (String a : array)  {
            System.out.println(a);
        } // foreach döngüsü budur. Daha kısa sürede bastırmayı sağlar
        for (int b : array2) {
            System.out.println(b);
        }

    }

}
