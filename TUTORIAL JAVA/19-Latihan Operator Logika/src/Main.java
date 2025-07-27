import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        int nilaiBenar = 7;
        int nilaiTebakan;

        System.out.print("Masukkan angka tebakan anda : ");
        nilaiTebakan = inputUser.nextInt();
        System.out.println("Tebakkan anda adalah " + nilaiTebakan);

        boolean status = (nilaiTebakan == nilaiBenar);
        System.out.println("Tebakkan anda: " + status);

        //operasi aljabar boolean (and/or)
        System.out.println("Masukan nilai antara 1-10");
        nilaiTebakan = inputUser.nextInt();
        status = (nilaiTebakan >= 4) && (nilaiTebakan <= 10);
        System.out.println("Tebakkan anda " + status);


    }
}