import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] arrayAngka = {11, 12,13,14,15,16,17,18,19,20};
        System.out.println(Arrays.toString(arrayAngka));

        //looping standar
        System.out.println("Looping standart");
        for (int i = 0; i < 10; i++){
            System.out.println("Index ke: " + i + " adalah " + arrayAngka[i]);
        }

        System.out.println("===================================");

        //looping dengan property array
        System.out.println("Looping dengan property array");
        for (int i = 0; i <arrayAngka.length;i++){
            System.out.println("Index ke: " + i + " adalah " + arrayAngka[i]);
        }

        System.out.println("===================================");

        //looping khusus untuk collection <-array
        //dipakai saat kita tidak membutuhkan index dan hanya membutuhkan perulangan
        System.out.println("Looping for each");
        for (int angka : arrayAngka){
            System.out.println("Angka pada looping ini = " + angka);
        }

    }
}