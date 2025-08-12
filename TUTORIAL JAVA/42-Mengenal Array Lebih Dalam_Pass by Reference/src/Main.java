import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
         int[] arrayAngka1 = {1,2,3,4,5};
         int[] arrayAngka2 = new int [5];

         //before alamat memori disamakan
        System.out.println("before alamat memori disamakan");
        System.out.println(arrayAngka1);
        System.out.println(arrayAngka2);


        arrayAngka2 = arrayAngka1;
        //after memori disamakan
        System.out.println("after alamat memori disamakan");
        System.out.println(arrayAngka1);
        System.out.println(arrayAngka2);
        System.out.println("Array 1 -> " + Arrays.toString(arrayAngka1));
        System.out.println("Array 2 -> " + Arrays.toString(arrayAngka2));

        //mengakibatkan isi dari array adalaha sama karena alamat memorinya sama
        //jadi ketika mengedit salah satu array maka array yang alamatnya sama juga akan ikut berubah
        arrayAngka1[0] = 100;
        arrayAngka2[4] = 400;
        System.out.println("Array 1 -> " + Arrays.toString(arrayAngka1));
        System.out.println("Array 2 -> " + Arrays.toString(arrayAngka2));

        ubahArray(arrayAngka1);
        System.out.println("Array 1 -> " + Arrays.toString(arrayAngka1));
        System.out.println("Array 2 -> " + Arrays.toString(arrayAngka2));
    }

    //method yang argumennya adalah reference, pass by reference
    //bukan pass by value
    private static void ubahArray(int[] dataArray){
        dataArray[0] = 125;
    }

}