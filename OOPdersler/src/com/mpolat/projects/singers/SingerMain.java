package com.mpolat.projects.singers;

import java.util.Scanner;

public class SingerMain {
    private static Singers singers = new Singers();
    private static Scanner scanner = new Scanner(System.in);

    public static void islemleri_bastir() {
        System.out.println("\t 0-Islemleri goruntule");
        System.out.println("\t 1-Sarkicilari goruntule");
        System.out.println("\t 2-Sarkici ekle");
        System.out.println("\t 3-Sarkici gunceller");
        System.out.println("\t 4-Sarkici sil");
        System.out.println("\t 5-Sarkici ara");
        System.out.println("\t 6-Uygulamadan cik");
    }

    public static void goruntule() {
        singers.sarkicilari_bastir();
    }

    public static void ekle() {
        System.out.println("Eklemek istediginiz sarkici ismi: ");
        String isim = scanner.nextLine();
        singers.sarkici_ekle(isim);
    }

    public static void guncelle() {
        System.out.println("Guncellemek istediginiz pozsiyon(1,2,3)");
        int pozisyon = scanner.nextInt();
        scanner.nextLine();

        String yeni_isim = scanner.nextLine();
        singers.sarkici_guncelle(yeni_isim,pozisyon - 1);
    }

    public static void sil() {
        System.out.println("Silmek istediginiz pozisyon(1,2,3)");
        int pozisyon = scanner.nextInt();
        singers.sarkici_sil(pozisyon-1);

    }

    public static void ara() {
        System.out.println("Aramak istediginiz sarkici");
        String isim = scanner.nextLine();

        singers.sarkici_ara(isim);
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Singers Application");
        islemleri_bastir();

        boolean cikis = false;

        int islem;
        while (!cikis) {
            System.out.println("Bir islem seciniz");

            islem = scanner.nextInt();
            scanner.nextLine();

            switch (islem) {
                case 0:
                    islemleri_bastir(); break;

                case 1:
                    goruntule(); break;

                case 2:
                    ekle(); break;

                case 3:
                    guncelle(); break;

                case 4:
                    sil(); break;

                case 5:
                    ara(); break;

                case 6:
                    cikis = true;
                    System.out.println("Uygulamadan cikiliyor");
                    break;
            }

        }
    }
}
