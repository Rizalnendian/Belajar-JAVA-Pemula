package com.tutorial;

public class Main {
    public static void main(String[] args) {
        System.out.println("assignment operators");
        int r = 12;
        System.out.printf("r = %d\n", r);
        int assignment1 = r += 5;
        System.out.printf("r += 5 = %d\n", assignment1);
        System.out.println();


        int s = 12;
        System.out.printf("s = %d\n", s);
        int assignment2 = s -= 5;
        System.out.printf("s -= 5 = %d\n", assignment2);
        System.out.println();

        int t = 10;
        System.out.printf("t = %d\n", t);
        int assignment3 = t *= 5;
        System.out.printf("t *= 5 = %d\n", assignment3);
        System.out.println();

        int u = 12;
        System.out.printf("u = %d\n", u);
        int assignment4 = u /= 5;
        System.out.printf("u /= 5 = %d\n", assignment4);
        System.out.println();

        int v = 12;
        System.out.printf("v = %d\n", v);
        int assignment5 = v %= 5;
        System.out.printf("v %%= 5 = %d\n", assignment5);
        System.out.println();

        int d = 12;
        System.out.printf("d = %d\n", d);
        int assignment6 = d &= 5;
        System.out.printf("d &= 5 = %d\n", assignment6);
        System.out.println();

        int e = 12;
        System.out.printf("e = %d\n", e);
        int assignment7 = e |= 5;
        System.out.printf("e |= 5 = %d\n", assignment7);
        System.out.println();

        int f = 12;
        System.out.printf("f = %d\n", f);
        int assignment8 = f ^= 5;
        System.out.printf("f ^= 5 = %d\n", assignment8);
        System.out.println();

        int g = 1;
        System.out.printf("g = %d\n", g);
        int assignment9 = g >>= 5;
        System.out.printf("g >>= 5 = %d\n", assignment9);
        System.out.println();

        int h = 12;
        System.out.printf("h = %d\n", h);
        int assignment10 = g <<= 5;
        System.out.printf("g >>= 5 = %d\n", assignment10);
        System.out.println();

    }
}
