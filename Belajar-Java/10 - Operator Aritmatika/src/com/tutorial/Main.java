package com.tutorial;

public class Main {
    public static void main(String[] args) {
        // aritmatika bisa diterapkan saat deklarasi maupun print

        //contoh aritmatika saat deklarasi
        System.out.println("Aritmatika saat deklarasi variabel yang menyimpan hasil");
        int a = 1;
        int b = 2;
        int c = a + b;
        System.out.println(c);
        System.out.println(" ");


        //contoh aritmatika saat print
        int x = 10;
        int y = 2;
        int hasil;


        System.out.println("Aritmatika langsung di print hasilnya");
        System.out.println(x + y); // Tambah
        System.out.println(x - y); // Kurang
        System.out.println(x * y); // Kali
        System.out.println(x / y); // Bagi
        System.out.println(x % y); // Modulus atau sisa bagi
        System.out.println(" ");

        //menggunakan prinf
        System.out.println("Aritmatika dengan print format");
        System.out.printf("%d + %d = %d\n", x, y, hasil = x + y);
        System.out.printf("%d - %d = %d\n", x, y, hasil = x - y);
        System.out.printf("%d * %d = %d\n", x, y, hasil = x * y);
        System.out.printf("%d / %d = %d\n", x, y, hasil = x / y);
        System.out.printf("%d %% %d = %d\n", x, y, hasil = x % y);
        System.out.println(" ");


       










    }
}
