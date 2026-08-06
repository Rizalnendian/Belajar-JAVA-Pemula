package com.tutorial;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);
        int angka1 = 1;
        int angka2 = 2;

        System.out.print("Masukkan nilai pertama:");
        int input1 = UserInput.nextInt();


        //nested pada intinya kondisional if yang berada di dalam kondisional if induk
        if (input1 == angka1){
            System.out.println("Nilai pertama benar");
            System.out.print("Masukkan nilai kedua:");
            int input2 = UserInput.nextInt();

            if (input2 == angka2){
                System.out.println("Keduanya benar");
            } else {
                System.out.println("Nilai kedua salah");
            }
        } else {
            System.out.println("Nilai pertama salah");
        }



    }
}
