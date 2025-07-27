import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        float panjang, lebar, tinggi, luas, volume;

        System.out.println("Program menghitung luas");
        System.out.println("Silahkan masukkan panjang dan lebar");
        Scanner userInput = new Scanner(System.in);

        System.out.print("Panjang = ");
        panjang = userInput.nextFloat();
        System.out.print("Lebar = ");
        lebar = userInput.nextFloat();

        luas = panjang * lebar;
        System.out.printf("%f * %f = %f cm2\n",panjang,lebar,luas);

        System.out.println(" ");
        System.out.println("Program menghitung volume");
        System.out.println("Silahkan masukkan tinggi");
        System.out.print("Tinggi = ");
        tinggi = userInput.nextFloat();
        volume = luas * tinggi;
        System.out.println("Volume = " + volume + " cm³");








    }
}