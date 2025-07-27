import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Tutorial if statement atau percabangan
        int angka;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan tebakan anda: ");
        angka = input.nextInt();
        if (angka == 5){
            System.out.println("Tebakan benar");
        }
        else {
            System.out.println("Tebakan salah");

        }
        System.out.println(" ");

        System.out.print("Masukkan tebakan anda: ");
        angka = input.nextInt();
        if (angka == 22){
            System.out.println("Tebakan benar");
        }
        else {
            System.out.println("Tebakan salah");

        }

        System.out.println(" ");
        System.out.println("Selesai");
    }
}