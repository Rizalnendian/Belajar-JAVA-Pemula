package com.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("===== Program perhitungan luas dan keliling persegi panjang =====");
        System.out.print("Masukkan panjang: ");
        int panjang = userInput.nextInt();
        System.out.print("Masukkan lebar: ");
        int lebar = userInput.nextInt();
        System.out.print("Masukkan tinggi: ");
        int tinggi = userInput.nextInt();
        System.out.println();

        System.out.println("=== Input ===");
        System.out.printf("Panjang: %dcm\n", panjang);
        System.out.printf("Lebar: %dcm\n", lebar);
        System.out.println();

        System.out.println("=== Hasil ===");
        System.out.printf("Luas: %d * %d =  %dcm²\n", panjang, lebar, panjang * lebar);
        System.out.printf("Keliling: 2 * (%d + %d) = %dcm\n", panjang, lebar, 2 * (panjang + lebar));
        System.out.printf("Volume: %d * %d * %d = %dcm³\n", panjang, lebar, tinggi, panjang * lebar * tinggi);
    }
}
