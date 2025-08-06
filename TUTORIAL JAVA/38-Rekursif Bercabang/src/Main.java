import  java.lang.String;
import java.util.Scanner;

//rekursif bercabang tidak direkomendasikan untuk perhitungan dengan nominal yang besar

public class Main {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int nilai  = userinput.nextInt();
        int nilai_fibonacci = fibonacci(nilai, "atas");
        System.out.println("Nilai Fibonacci ke- " + nilai +  " adalah " + nilai_fibonacci);


    }

    private static int fibonacci(int n, String daun){
        System.out.println("Daun " + daun);
        System.out.println("Fibonacci ke :" + n);
        if (n == 1 || n ==0){
            return n;
        } else {
            return fibonacci(n-1, "kiri") + fibonacci(n-2, "kanan");
        }

    }
}