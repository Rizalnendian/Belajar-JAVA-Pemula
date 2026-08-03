package com.tutorial;

public class Main {
    static void main(String[] args) {
        int a = 1;
        int b = 2;

        boolean hasil1 = (a==b);
        boolean hasil2 = (a!=b);
        boolean hasil3 = (a>b);
        boolean hasil4 = (a<b);
        boolean hasil5 = (a>=b);
        boolean hasil6 = (a<=b);

        System.out.printf("Apakah %d == %d?, %s\n", a, b, hasil1);
        System.out.printf("Apakah %d != %d?, %s\n", a, b, hasil2);
        System.out.printf("Apakah %d > %d?, %s\n", a, b, hasil3);
        System.out.printf("Apakah %d < %d?, %s\n", a, b, hasil4);
        System.out.printf("Apakah %d >= %d?, %s\n", a, b, hasil5);
        System.out.printf("Apakah %d <= %d?, %s\n", a, b, hasil6);


    }
}
