package com.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int input,x;
        Scanner userInput=new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        input=userInput.nextInt();

        x = (input == 10) ? (input*input) : (input/2);

        /* jika memakai if
        if (input==10){
            x = input*input;
        } else {
            x = input/2;
        } */
        System.out.println("Nilai x: " + x);
    }
}
