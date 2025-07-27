import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int umur, pengalamanKerja;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan usia anda: ");
        umur = input.nextInt();


        if (umur >= 18){
            System.out.print("Masukkan durasi pengalaman kerja anda: ");
            pengalamanKerja = input.nextInt();

            if (pengalamanKerja <= 1) {
                System.out.println("Pekerja Pemula");
            } else if (pengalamanKerja >=1 && pengalamanKerja <=5) {
                System.out.println("Pekerja Menengah");
            } else if (pengalamanKerja >=5 && pengalamanKerja <= 10) {
                System.out.println("Pekerja Senior");
            } else if (pengalamanKerja >= 10) {
                System.out.println("Pekerja Eksekutif");
            } else {
                System.out.println("Tidak bekerja");
            }
        } else {
            System.out.println("Belum siap bekerja");
        }
    }
}