package com.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //if else if statemen;
        int angkaBenar = 77;

        Scanner UserInput = new Scanner(System.in);

        System.out.print("Masukkan angka antara 50-100: ");
        int a = UserInput.nextInt();

        if (a > 100) {
            System.out.println("Terlalu besar!");
        } else if (a < 50) {
            System.out.println("Terlalu kecil!");
        } else if (a == angkaBenar)  {
            System.out.println("Benar!");
        } else  {
            System.out.println("Salah!");
        }

    }
}
