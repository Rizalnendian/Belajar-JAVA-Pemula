package Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);

        int nilaiBenar = 16;
        int nilaiTebakan, nilaiTebakan2;
        System.out.print("Masukkan nilai anda : ");
        nilaiTebakan = inputUser.nextInt();
        System.out.println("Nilai tebakan: " + nilaiTebakan);

        boolean statustebakan = (nilaiTebakan == nilaiBenar);
        System.out.println("Status tebakan: " + statustebakan);

        System.out.println("============");
        System.out.print("Masukkan nilai antara 5-9: ");
        nilaiTebakan2 = inputUser.nextInt();
        System.out.println("Nilai tebakan: " + nilaiTebakan2);
        boolean statustebakan2 = (nilaiTebakan2 >=5) && (nilaiTebakan2 <=9);
        System.out.println("Status tebakan: " + statustebakan2);
    }
}
