import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // if else if statement
        int Umur;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan usia anda: ");
        Umur = input.nextInt();
        if (Umur <= 5){
            System.out.println("Balita");
        } else if (Umur >= 5 && Umur <=18) {
            System.out.println("Anak anak dan Remaja");
        }  else if (Umur <= 50) {
            System.out.println("Dewasa");
        } else if (Umur >= 50 ) {
            System.out.println("Lansia");
        }
    }
}