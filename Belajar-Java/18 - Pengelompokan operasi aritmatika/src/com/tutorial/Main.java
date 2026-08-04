package com.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Order of Operations");
        System.out.println("1. [ () ] - Dalam kurung");
        System.out.println("2. [*, /, %] - Perkalian, Pembagian, Modulus");
        System.out.println("3. [+, -] - Pertambahan, Pengurangan");
        System.out.println("4. [>, <, >=, <=] - Operasi perbandingan");
        System.out.println("5. [==, !=] - Operasi Kesetaraan");
        System.out.println("6. [&&] - Logika AND");
        System.out.println("7. [||] - Logika OR");
        System.out.println("9. [=] - Sama dengan");

        System.out.println();
        System.out.println("Contoh");
        int result1 = 10 - 2 + 5;    // (10 - 2) + 5 = 13
        int result2 = 10 - (2 + 5);  // 10 - 7 = 3
        int result3 = 2 + 3 * 4;     // 2 + 12 = 14
        int result4 = (2 + 3) * 4;   // 5 * 4 = 20

        System.out.printf("10 - 2 + 5 = %d\n", result1);
        System.out.printf("10 - (2 + 5) = %d\n", result2);
        System.out.printf("2 + 3 * 4 = %d\n", result3);
        System.out.printf("(2 + 3) * 4 = %d\n", result4);

        System.out.println();
        System.out.println("========================================");
        System.out.println("Menghitung persamaan kuadrat");
        int m, x, c;
        System.out.print("Nilai x = ");
        x = userInput.nextInt();
        System.out.print("Gradient m = ");
        m = userInput.nextInt();
        System.out.print("Bias c = ");
        c = userInput.nextInt();
        int y = (m * x * x) + c;
        System.out.printf("Nilai y = %d\n", y);
    }
}
