import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        System.out.println("==========Array Multidimensi==========\n");
        System.out.println("==========Array Dua dimensi==========\n");

        //Cara membuat array 2 dimensi dengan assignment
        int[] array1D = {1,2,3,4,5};
        int[][] array2d = {
                {1,2,3,4,5},
                {10,9,8,7,6}
        };

        System.out.println("Ini adalah array 1 Dimensi");
        printarray1d(array1D);

        System.out.println("\n");

        System.out.println("Ini adalah array 2 Dimensi");
        printarray2d(array2d);

        System.out.println("\n");

        //Cara membuat array 2 dimensi dengan deklarasi
        System.out.println("Ini adalah array 1 Dimensi");
        int[] arrayAngka1 = new int[5];
        printarray1d(arrayAngka1);

        System.out.println("\n");

        System.out.println("Ini adalah array 2 Dimensi");
        int[][] arrayAngka2 = new int[5][5]; //[] pertama adalah baris, [] kedua adalah kolom
        printarray2d(arrayAngka2);

        System.out.println("\n");

        System.out.println("Looping secara manual");
        //looping lengkap secara manual dengan for
        int[][] arrayAngka3 = new int[3][4];
        for (int i = 0; i < arrayAngka3.length; i++){
            System.out.print("[");
            for (int j = 0; j < arrayAngka3.length; j++){
                System.out.print(arrayAngka3[i][j] + ",");
            }
            System.out.print("]\n");
        }

        System.out.print("\n");
        //looping lengkap secara manual dengan foreach
        for (int[] baris: arrayAngka3){
            System.out.print("[");
            for (int angka: baris){
                System.out.print(angka + ",");
            }
            System.out.print("]\n");
        }

        System.out.print("\n");
        int[][] array_ragged = {
                {1,2,3,4,5,6,7},
                {1,2,3,4,5},
                {1}
        };
        System.out.println("Ini adalah anomali Array multidimensi di java");
        System.out.println("Dimana jumlah tiap kolom tidak perlu sama");
        printarray2d(array_ragged);

    }
    //Fungsi print array 2D
    private static void printarray2d (int[][] dataarray){
        for (int i = 0; i < dataarray.length; i++){
            System.out.println(Arrays.toString(dataarray[i]));
        };
    }
    //Fungsi print array 1D
    private static void printarray1d (int[] dataarray){
        System.out.println(Arrays.toString(dataarray));
    }
}