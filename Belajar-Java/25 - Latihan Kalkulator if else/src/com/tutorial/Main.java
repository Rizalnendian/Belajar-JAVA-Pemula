package com.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputUser;
        float a,b;
        char operator;

        inputUser = new Scanner(System.in);
        System.out.println("=== KALKULATOR ===");

        System.out.print("Masukkan angka pertama: ");
        a = inputUser.nextFloat();

        System.out.print("Masukkan operator (+, -, *, /): ");
        operator = inputUser.next().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        b = inputUser.nextFloat();

        System.out.println("==================");

        if (operator == '+') {
            System.out.printf("%f + %f = %f\n", a, b, (float) (a + b));
        } else if (operator == '-') {
            System.out.printf("%f - %f = %f\n", a, b, (float) (a - b));
        } else if (operator == '*') {
            System.out.printf("%f * %f = %f\n", a, b, (float) (a * b));
        } else if (operator == '/') {
            if (b != 0) {
                System.out.printf("%f / %f = %f\n", a, b, (float) (a / b));
            } else {
                System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
            }
        } else {
            System.out.println("Error: Operator tidak valid.");
            
        }


    }
}
