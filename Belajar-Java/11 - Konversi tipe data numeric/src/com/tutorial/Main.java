package com.tutorial;

public class Main {
    public static void main(String[] args) {
        //program untuk konversi data

        int nilaiInt = 220; //32 bit
        System.out.println("Nilai Int = " + nilaiInt);

        //Memperluas rentang ke tipe data  yang lebih besar
        long nilaiLong = nilaiInt; //long 64 bit, pindah dari bit ke bit besar tidak akan bermasalah
        System.out.println("Nilai Long = " + nilaiLong);

        //Memperluas rentang ke tipe data  yang lebih kecil
        byte nilaiByte = (byte) nilaiInt; //(tipe data) di samping disebut casting
        System.out.println("Nilai Byte = " + nilaiByte);
        System.out.println("Nilai Byte Max = " + Byte.MAX_VALUE);
        System.out.println("Nilai Byte Min = " + Byte.MIN_VALUE);
        /*Jika nilai tipe data awal lebih besar dari batas max tipe data
        dengan rentang yang lebih kecil maka nilai hasil castingnya akan memutar dari max ke min lalu ke max lagi */


        //casting pembagian
        float a = 10;
        int b = 4;
        float c = a / b; //float dibagi int hasilnya tetao float
        System.out.printf("%f / %d = %f\n", a, b, c);


        //casting juga dapat dilakukan dengan cara
        int d = 10;
        int e = 7;
        float f = (float) d / e;
        System.out.printf("%d / %d = %f\n", d, e, f);

    }
}
