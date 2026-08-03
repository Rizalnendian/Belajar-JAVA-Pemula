package com.tutorial;

public class Main {
    public static void main(String[] args) {
        //operator bitwise merupakan operator yang mengoperasikan nilai bit
        byte a = 1;
        String a_bits;

        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d\n", a_bits, a);
    }
}
