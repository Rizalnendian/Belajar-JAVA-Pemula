import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int [] arrayAngka1 = {1,2,3,4,5};

        //merubah array menjadi string
        System.out.println("\nMerubah array menjadi string\n==========================");
        printArray(arrayAngka1);

        //mencopy array
        System.out.println("\nMencopy array menjadi string\n==========================");
        int[] arrayAngka2 = new int[5];
        printArray(arrayAngka1);
        printArray(arrayAngka2);

        //copy dengan loop
        System.out.println("\nMencopy dengan loop\n==========================");
        for (int i =0; i<arrayAngka1.length;i++){
            arrayAngka2[i] = arrayAngka1[i];
        }
        printArray(arrayAngka1);
        System.out.println(arrayAngka1 + " : alamat berbeda dengan alamat array 2");
        printArray(arrayAngka2);
        System.out.println(arrayAngka2 + " : alamat berbeda dengan alamat array 1");

        //copy dengan copyOf
        System.out.println("\nMencopy dengan copyOf\n==========================");
        int[] arrayAngka3 = Arrays.copyOf(arrayAngka1, 5); //Harus memiliki dua parameter, parameter pertama adalah variabel dan parameter ke dua adalah panjangnya
        printArray(arrayAngka1);
        System.out.println(arrayAngka1 + " : alamat berbeda dengan alamat array 3");
        printArray(arrayAngka3);
        System.out.println(arrayAngka3 + " : alamat berbeda dengan alamat array 1");

        //copy dengan copyOfRange
        System.out.println("\nMencopy dengan copyOfRange\n==========================");
        int[] arrayAngka4 = Arrays.copyOfRange(arrayAngka1,2,5); //mengcopy isi array demham range tertentu
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka4);
        System.out.println(arrayAngka4);

        //fill array
        System.out.println("\nFill array\n==========================");
        int[] arrayAngka5 = new int [10];
        printArray(arrayAngka5);
        Arrays.fill(arrayAngka5,1);
        printArray(arrayAngka5);

        //komparasi array
        System.out.println("\nKomparasi  2 buah array\n==========================");
        int[] arrayAngka6 = {1,2,3,4,5};
        int[] arrayAngka7 = {1,2,3,4,9};

        printArray(arrayAngka6);
        printArray(arrayAngka7);

        if (Arrays.equals(arrayAngka6, arrayAngka7)){
            System.out.println("Array ini sama");
        } else {
            System.out.println("Array ini beda");
        }

        System.out.println("\nmengecek mana array yang lebih besar\n==========================");
        printArray(arrayAngka6);
        printArray(arrayAngka7);
        System.out.println(Arrays.compare(arrayAngka6, arrayAngka7));
        //jika hasilnya 0 artinya sama
        //jika hasilnya -1 artinya lebih kecil
        //jika hasilnya 1 artinya lebih besar

        System.out.println("\nmengecek indeks pada array yang berbeda\n==========================");
        printArray(arrayAngka6);
        printArray(arrayAngka7);
        System.out.println("Indeks yang berbeda: " + Arrays.mismatch(arrayAngka6, arrayAngka7));
        //jika hasilnya -1 artinya tidak ada indeks yang berbeda
        //jika ada yang berbeda maka akan menghasilnkan indeks yang berbeda

        //sort array
        System.out.println("\nSort array\n==========================");
        int[] arrayAngka8 = {5,2,7,1,8,3,4,6};
        printArray(arrayAngka8);
        Arrays.sort(arrayAngka8);
        printArray(arrayAngka8);

        //search array
        System.out.println("\nSearch array\n==========================");
        int angka = 1;
        int posisi = Arrays.binarySearch(arrayAngka8, angka); //harus di sorting dulu
        System.out.println("Angka " + angka + " ada di indeks: " + posisi);


        //tugas -> sort kebalik, pakai looping
        System.out.println("\nReverse sort array\n==========================");
        // My version use looping
        for (int i = 7; i > -1; i --){
            Arrays.sort(arrayAngka8);
            System.out.println("Indeks ke - " + i + " adalah " + arrayAngka8[i]);
        }

        System.out.println(" ");

        //Google version
        int[] arrayAngka9 = {5,2,7,1,8,3,4,6};
        Arrays.sort(arrayAngka9);
        for (int i = 0; i < arrayAngka9.length/2; i++ ){
            int temp = arrayAngka9[i];
            arrayAngka9[i] = arrayAngka9[arrayAngka9.length - i -1];
            arrayAngka9[arrayAngka9.length - i - 1] = temp;
        }
        printArray(arrayAngka9);



        // operasi tambahy antara dua buah array, pakai copu0f
        String [] arr1 = {"Halo", "nama", "saya", "Rizal"};
        String [] arr2 = {"Saya", "Sedang", "Belajar", "Java"};
        String [] arrGabung = Arrays.copyOf(arr1, arr1.length + arr2.length);
        System.arraycopy(arr2, 0, arrGabung, arr1.length, arr2.length);
        System.out.println(Arrays.toString(arrGabung));

        //menggabungkan dua buah array, pakai copu0f dan membuat fungsi untuk menambahkan array
        int [] arr3 = {1,2,3,4,5};
        int [] arr4 = {1,2,3,4,5};

        printHasil(arr3, arr4);

    }

    private static void printHasil(int[] arrayVar1, int [] arrayVar2){
        int maxLength = Math.max(arrayVar1.length, arrayVar2.length);
        int [] hasil = Arrays.copyOf(arrayVar1, maxLength);
        for (int i = 0; i < arrayVar2.length; i++){
            hasil[i] = arrayVar1[i] + arrayVar2[i];
        }
        System.out.println(Arrays.toString(hasil));
        return;


    }


    private static void printArray(int[] dataArray){
        System.out.println("Array = " + Arrays.toString(dataArray));
    }
}