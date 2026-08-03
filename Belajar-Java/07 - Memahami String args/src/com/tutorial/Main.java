package com.tutorial;

public class Main {
    static void main(String[] args) {
        System.out.println(args[0]);
//        System.out.println(args[1]);
        System.out.println("Halo, " + args[0]);
        System.out.println("args artinya adalah nama array yang berisi kumpulan string");
        System.out.println("array args tidak bisa dipanggil karena setiap indexnya tidak berisi, kecuali sudah di input melalui cli atau terminal");
    }
}
