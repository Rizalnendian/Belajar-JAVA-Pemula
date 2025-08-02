import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int nilai = userInput.nextInt();
        System.out.println("Anda memasukkan nilai " + nilai);
        System.out.println("======================================");

        printNilai(nilai);
        System.out.println("======================================");
        int jumlah = jumlahNilai(nilai);
        int jumlah2 = jumlahFaktorial(nilai);
        System.out.println("Jumlah = " + jumlah);
        System.out.println("Faktorial = " + jumlah2);
    }

    //Fungsi rekursif sederhana

    private static int jumlahFaktorial (int parameter3){

        if (parameter3 == 1){
            return parameter3;
        }

        return parameter3 * jumlahFaktorial(parameter3 - 1);
    }

    private static int jumlahNilai (int parameter2){

        if (parameter2 == 0){
            return parameter2;
        }

        return parameter2 + jumlahNilai(parameter2 - 1);
    }

    private static void printNilai(int parameter){
        System.out.println("Parameter = " + parameter);

        //fungsi rekursif harus selalu memiliki kondisi
        // untuk membatasi perulangan yang tidak terbatas
        if (parameter <= 0){
            return;
            //memaksa fungsi rekursif keluar dari eksekusi jika memenuhi
            // syarat kondisi if
        }
        parameter--;
        printNilai(parameter);
    }
    //Fungsi rekursif pada dasarnya adalah sebuah
    // pemanggilan fungsi/method yang berada pada fungsi/method itu sendiri
    // sehingga terjadi perulangan tanpa batas.
    // Sistem akan mengeksekusi program tersebut mulai dari fungsi yang utama lalu
    // mengeksekusi pemanggilan fungsi yang sama yang berada dalam fungsi utama
    // sehingga terjadi perulangan tanpa batas

}