package com.tutorial;

public class Main {
    public static void main(String[] args) {
        //Tipe data di Java primitive
        //cara select sekaligus, kalian tekan ctrl+alt+shift+J

        /* 1 Byte = 8 bit
           2 Byte = 16 bit
           4 Byte = 32 bit
           8 Byte = 64 bit
           */
        System.out.println("=====INTEGER=====");
        int a = 1;
        System.out.println("nilai a = " + a);
        System.out.println("menyimpan bilangan bulat (bilangan utuh), tanpa desimal");
        System.out.println("Nilai maxnya = " + Integer.MAX_VALUE);
        System.out.println("Nilai minnya = " + Integer.MIN_VALUE );
        System.out.println("Besaran integer dalam byte = " + Integer.BYTES + " Byte");
        System.out.println("Besaran integer dalam bit = " + Integer.SIZE + " Bit");
        System.out.println( );

        System.out.println("=====FLOAT=====");
        float b = 3.14f;
        System.out.println("nilai b = " + b);
        System.out.println("menyimpan angka floating point, dengan desimal 6 sampai 7 digit");
        System.out.println("Nilai maxnya = " + Float.MAX_VALUE);
        System.out.println("Nilai minnya = " + Float.MIN_VALUE);
        System.out.println("Besaran float dalam byte = " + Float.BYTES + " Byte");
        System.out.println("Besaran float dalam bit = " + Float.SIZE + " Bit");
        System.out.println( );

        System.out.println("=====LONG=====");
        long c = 3000;
        System.out.println("nilai c = " + c);
        System.out.println("menyimpan bilangan bulat (bilangan utuh), tanpa desimal");
        System.out.println("Nilai maxnya = " + Long.MAX_VALUE);
        System.out.println("Nilai minnya = " + Long.MIN_VALUE);
        System.out.println("Besaran long dalam byte = " + Long.BYTES + " Byte");
        System.out.println("Besaran long dalam bit = " + Long.SIZE + " Bit");
        System.out.println( );

        System.out.println("=====SHORT=====");
        long d = 12;
        System.out.println("nilai d = " + d);
        System.out.println("menyimpan bilangan bulat (bilangan utuh), tanpa desimal");
        System.out.println("Nilai maxnya = " + Short.MAX_VALUE);
        System.out.println("Nilai minnya = " + Short.MIN_VALUE);
        System.out.println("Besaran short dalam byte = " + Short.BYTES + " Byte");
        System.out.println("Besaran short dalam bit = " + Short.SIZE + " Bit");
        System.out.println( );

        System.out.println("=====DOUBLE=====");
        double e = 3.146434d;
        System.out.println("nilai e = " + e);
        System.out.println("menyimpan angka floating point, dengan desimal 15 sampai 16 digit");
        System.out.println("Nilai maxnya = " + Double.MAX_VALUE);
        System.out.println("Nilai minnya = " + Double.MIN_VALUE);
        System.out.println("Besaran double dalam byte = " + Double.BYTES + " Byte");
        System.out.println("Besaran double dalam bit = " + Double.SIZE + " Bit");
        System.out.println( );

        System.out.println("=====BYTE=====");
        byte f = 1;
        System.out.println("nilai f = " + f);
        System.out.println("menyimpan bilangan bulat (bilangan utuh), tanpa desimal");
        System.out.println("Nilai maxnya = " + Byte.MAX_VALUE);
        System.out.println("Nilai minnya = " + Byte.MIN_VALUE);
        System.out.println("Besaran Byte= " + Byte.BYTES + " Byte");
        System.out.println("Besaran Byte dalam bit = " + Byte.SIZE + " Bit");
        System.out.println( );

        System.out.println("=====Char=====");
        char g = 'R';
        System.out.println("nilai g = " + g);
        System.out.println("menyimpan simbil ASCII code atau character");
        System.out.println("Nilai maxnya = " + Character.MAX_VALUE);
        System.out.println("Nilai minnya = " + Character.MIN_VALUE);
        System.out.println("Besaran Byte= " + Character.BYTES + " Byte");
        System.out.println("Besaran Byte dalam bit = " + Character.SIZE + " Bit");
        System.out.println( );

        System.out.println("=====BOOLEAN=====");
        boolean h = true;
        boolean i = false;
        System.out.println("nilai h = " + h);
        System.out.println("nilai i = " + i);
        System.out.println("menyimpan true or false values");
        System.out.println("Nilai = " + Boolean.TRUE);
        System.out.println("Nilai = " + Boolean.FALSE);
        System.out.println( );


    }
}
