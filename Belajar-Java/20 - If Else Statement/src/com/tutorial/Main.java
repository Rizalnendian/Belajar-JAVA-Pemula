package com.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //if else statement
        int nilaiBenar = 22;

        Scanner UserInput = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int a = UserInput.nextInt();
         if (a == nilaiBenar) {
            System.out.println("Benar!");
        } else  {
            System.out.println("Salah!");
        }
    }
}
