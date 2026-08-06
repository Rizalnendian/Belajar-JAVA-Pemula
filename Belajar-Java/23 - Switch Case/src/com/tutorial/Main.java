package com.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Masukkan hari: ");
        String input = userInput.next();
        switch (input) {
            case "senin":
                System.out.println("Waktunya memulai pekan ini");
                break;
            case "selasa":
                System.out.println("Lanjutkan, ini baru hari ke dua pekan ini");
                break;
            case "rabu":
                System.out.println("Sebentar lagi, jangan menyerah!");
                break;
            case "kamis":
                System.out.println("Sudah separuh pekan, kamu harus semangat!");
                break;
            case "jumat":
                System.out.println("Jangan lupa beribadah!");
                break;
            case "sabtu":
                System.out.println("Selesaikan pekerjaanmu dan bersiap untuk bersenang senang");
                break;
            case "minggu":
                System.out.println("Good job!, waktunya beristirahat dan bersenang senang");
                break;
            default:
                System.out.println("Hari yang Anda masukkan tidak valid");
        }
        System.out.println();
        System.out.println("Switch itu seperti if");
        System.out.println("case berfungsi untuk menyimpan statement");
        System.out.println("break berfungsi untuk menyimpan statement");
        System.out.println("Jika tidak ada break, maka program akan mengeksekusi semua case setelahnya");
        System.out.println("default adalah program awal");
        System.out.println("Jika tidak ada default, maka program akan mengeksekusi case yang sesuai dengan input");
    }
}
