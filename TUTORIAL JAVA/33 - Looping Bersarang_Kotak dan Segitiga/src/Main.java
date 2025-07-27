import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //looping bersarang

        //kotak
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        System.out.println("\n");
        //segitiga siku siku kiri atas
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                System.out.print("* ");
                if (i == j){
                    break;
                }
            }
            System.out.print("\n");
        }

        System.out.println("\n");
        //Segitiga siku siku bawah
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                System.out.print("* ");
                if ((i + j) == 4){
                    break;
                }
            }
            System.out.print("\n");
        }

        System.out.println("\n");

        //Belah ketupat/ wajid
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan tinggi belah ketupat (ganjil): ");
        int n = input.nextInt();

        if (n % 2 == 0) {
            System.out.println("Mohon masukkan angka ganjil agar bentuk simetris.");
            return;
        }

        int tengah = n / 2;

        // Bagian atas
        for (int i = 0; i <= tengah; i++) {
            for (int j = 0; j < tengah - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Bagian bawah
        for (int i = tengah - 1; i >= 0; i--) {
            for (int j = 0; j < tengah - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}