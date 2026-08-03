package com.tutorial;

public class Main {
    public static void main(String[] args) {

        int angka = 1;
        int angka2 = -3;
        System.out.printf("Unary '+', %d menjadi %d\n", angka2, angka2);
        System.out.printf("Unary '-', %d menjadi %d\n", angka, -angka);
        System.out.println();

        System.out.println("Increment & Decrement");
        int z = 5;
        System.out.println("z = " + z);



        ++z; //increment
        System.out.printf("++z = %d\n", z);
        z = 5;

        --z; //decrement
        System.out.printf("++z = %d\n", z);
        z = 5;
        System.out.println(" ");

        //increment dapat didepan maupun dibelakang variabel
        //prefix, yaitu increment/decrement di eksekusi sebelum dimunculkan
        int a = 2;
        System.out.printf("nilai dengan '--' di prefix akan memunculkan hasil %d\n", ++a);
        //postfix, yaitu increment/decrement di eksekusi sesudah dimunculkan
        int b = 2;
        System.out.printf("nilai dengan '++' di postfix akan memunculkan hasil %d\n", b++);
        System.out.printf("nilai postfix akan dimunculkan setelah 'b++' diatas, ini hasilnya: %d\n", b);
        System.out.println();

        //unary untuk boolean
        boolean c = true;
        boolean d = false;

        System.out.println("c = " + c);
        System.out.println("Jika boolean true diberi '!' hasilnya akan sebaliknya, contoh: !c adalah " + !c);

        System.out.println("d = " + d);
        System.out.println("Jika boolean true diberi '!' hasilnya akan sebaliknya, contoh: !d adalah " + !d);
    }
}
