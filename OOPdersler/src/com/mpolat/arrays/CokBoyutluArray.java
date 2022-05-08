package com.mpolat.arrays;

import java.util.Scanner;

public class CokBoyutluArray {
    public static void main(String[] args) {

        int[][] array = new int[2][2]; //2x2 matris array oluşturuldu

        array[0][0] = 5;
        array[0][1] = 8;
        array[1][0] = 12;
        array[1][1] = 23; //arrayin satır ve sütunlarına atamalar yaptım

        int[][] array2 = {{1,2},{3,4}}; // 2x2 matris oluşturup atama yapmayı tek satırda yapmak

        System.out.println(array2[0][1]);

        Scanner scanner = new Scanner(System.in);

        int[][] array3 = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                array3[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(array3[i][j] + " ");
            }
            System.out.println("");
        }


    }
}
