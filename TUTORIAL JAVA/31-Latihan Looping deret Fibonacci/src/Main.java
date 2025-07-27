import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int fn, fn1, fn2, n;
        Scanner inputNilai = new Scanner(System.in);
        System.out.print("Mengambil nilai fibonacci ke ");
        n = inputNilai.nextInt();

        fn2 = 0;
        fn1 = 1;
        fn = 1;

//        for (int i = 1; i <= n; i++){
//            System.out.println("Nilai ke " + i + " adalah " + fn);
//            fn = fn1 + fn2;
//            fn2 = fn1;
//            fn1 = fn;
//            }

//        int i = 0;
//        while (i < n){
//            i++;
//            System.out.println("Nilai ke " + i + " adalah " + fn);
//            fn = fn1 + fn2;
//            fn2 = fn1;
//            fn1 = fn;
//        }
        int i = 0;
        do {
            i++;
            System.out.println("Nilai ke " + i + " adalah " + fn);
            fn = fn1 + fn2;
            fn2 = fn1;
            fn1 = fn;
        } while (i < n);
    }
}