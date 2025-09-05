import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [][] array_2D = {
                {1,2,3},
                {4,5,6}
        };
        System.out.println(array_2D); //Alamat array 2D
        System.out.println(Arrays.toString(array_2D)); //Alamat dari setiap array 1D yang berada pada array 2D
        System.out.println(array_2D[0]); //Alamatnya sama seperti yang di atas, sesuai posisi indeksnya
        System.out.println(array_2D[1]); //Alamatnya sama seperti yang di atas, sesuai posisi indeksnya
        printarray2d(array_2D);

        System.out.println("\n");
        char[] array_char1 = {'a', 'b', 'c'};
        char[] array_char2 = {'d', 'e'};
        char [][] array_char = {array_char1, array_char2};
        System.out.println(array_char);
        System.out.println(Arrays.toString(array_char));
        System.out.println(Integer.toHexString(System.identityHashCode(array_char[0])));
        System.out.println(Integer.toHexString(System.identityHashCode(array_char[1])));
        printarray2d(array_char);
    }
    private static void printarray2d (char[][] dataarray){
        for (int i = 0; i < dataarray.length; i++){
            System.out.println(Arrays.toString(dataarray[i]));
        };
    }

    private static void printarray2d (int[][] dataarray){
        for (int i = 0; i < dataarray.length; i++){
            System.out.println(Arrays.toString(dataarray[i]));
        };
    }
}