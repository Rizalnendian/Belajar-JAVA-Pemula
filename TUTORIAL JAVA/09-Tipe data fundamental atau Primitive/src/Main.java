import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Tipe Tipe data Primitive");
        System.out.println("===================Tipe data integer================");
        int a = 1;
        System.out.println("ini adalah tipe data integer berupa angka bilangan bulat: " + a);
        System.out.println("Nilai max integer: " + Integer.MAX_VALUE);
        System.out.println("Nilai min integer: " + Integer.MIN_VALUE);
        System.out.println("Besar data integer: " + Integer.BYTES + " byte");
        System.out.println("Besar data integer: " + Integer.SIZE + " BIT");
        System.out.println("1 byte = 8 bit");
        System.out.println("4 byte = 32 bit");
        System.out.println("Dsetiap deklarasi data integer 2^(23) - 1");
        System.out.println("");

        System.out.println("===================Tipe data byte================");
        byte b = 2;
        System.out.println("ini adalah tipe data integer berupa angka bilangan bulat: " + b);
        System.out.println("Nilai max byte: " + Byte.MAX_VALUE);
        System.out.println("Nilai min byte: " + Byte.MIN_VALUE);
        System.out.println("Besar data byte: " + Byte.BYTES + " Byte");
        System.out.println("Besar data byte: " + Byte.SIZE + " BIT");
        System.out.println("");

        System.out.println("==================Tipe data short=================");
        short c = 3;
        System.out.println("ini adalah tipe data short berupa angka bilangan bulat: " + c);
        System.out.println("Nilai max short: " + Short.MAX_VALUE);
        System.out.println("Nilai min short: " + Short.MIN_VALUE);
        System.out.println("Besar data short: " + Short.BYTES + " byte");
        System.out.println("Besar data short: " + Short.SIZE + " BIT");
        System.out.println("");

        System.out.println("==================Tipe data long=================");
        long d = 4L;
        System.out.println("ini adalah tipe data long berupa angka bilangan bulat: " + d);
        System.out.println("Nilai max long: " + Long.MAX_VALUE);
        System.out.println("Nilai min long: " + Long.MIN_VALUE);
        System.out.println("Besar data long: " + Long.BYTES + " Byte");
        System.out.println("Besar data long: " + Long.SIZE + " BIT");
        System.out.println("");

        System.out.println("===================Tipe data double================");
        double e = 3.14d;
        System.out.println("ini adalah tipe data double berupa angka bilangan desimal: " + e);
        System.out.println("Nilai max double: " + Double.MAX_VALUE);
        System.out.println("Nilai min double: " + Double.MIN_VALUE);
        System.out.println("Besar data double: " + Double.BYTES + " byte");
        System.out.println("Besar data double: " + Double.SIZE + " BIT");
        System.out.println("");

        System.out.println("===================Tipe data char================");
        char g = 'G';
        System.out.println("ini adalah tipe data char berupa huruf & simbol: " + g);
        System.out.println("Nilai max char: " + Character.MAX_VALUE);
        System.out.println("Nilai min char: " + Character.MIN_VALUE);
        System.out.println("Besar data char: " + Character.BYTES + " Byte");
        System.out.println("Besar data char: " + Character.SIZE + " BIT");
        System.out.println("");

        System.out.println("===================Tipe data boolean================");
        boolean h =  true;
        System.out.println("ini adalah tipe data boolean berupa true atau false: " + h);
        System.out.println("Nilai max boolean: " + Boolean.TRUE);
        System.out.println("Nilai min boolean: " + Boolean.FALSE);
        System.out.println("Cuma 1 bit");
        System.out.println("");





    }
}