import java.util.Arrays; //library ini dapat berfungsi merubah array menjadi string

public class Main {
    public static void main(String[] args) {
        // assigmeny
        //Array adalah sebuah kumpulan data primitif
        //tipe data [] nama = {komponen}

        System.out.println("Assignment Array");

        //         index = 0 1 2 3 4 5
        //                 | | | | | |
        int [] arrayInt = {1,2,3,4,5,6}; //array 1 dimensi
        arrayInt[2] = 5;

        System.out.println(arrayInt[0]); //isikan nomor index untuk memunculkan data yang berada pada sesuai posisi index
        System.out.println(arrayInt[1]); //cara menampilkan array harus dengan indexnya
        System.out.println(arrayInt[2]);
        System.out.println(arrayInt[3]);

        System.out.println("=============================");

        // Deklarasi
        // tipedata[] nama = new int [jumlah array];

        System.out.println("Deklarasi Array");
        float[] arrayFloat = new float[5];

        arrayFloat[2] = 3.14f; //cara mengisi array yang kosong dan index yang diinginkan
        arrayFloat[3] = 22; // tipe data int akan otomatis di casting menjadi float

        System.out.println(arrayFloat[0]); //hanya untuk menampilkan satu data pada satu index tertentu saja

        System.out.println(Arrays.toString(arrayFloat)); //jika ingin menampilkan seluruh isi array lebih rekomen dengan cara ini


        int [][] array2d = {{1,2,3,4}, {6,7,8,9}}; //array 2 dimensi

    }
}