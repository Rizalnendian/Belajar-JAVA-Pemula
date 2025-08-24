import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("===============Jawaban yang benar tugas kemarin===============");
        System.out.println(" ");

        System.out.println("===============penjumlahan antara dua buah array===============");
        int [] arrayAngka1 = {1,2,3,4,5,6,7,8};
        int [] arrayAngka2 = {98,34,7466,87,54,3325, 932,21};

        int [] arrayHasil = tambahArray(arrayAngka1, arrayAngka2);
        printArray(arrayAngka1, "Arr 1");
        printArray(arrayAngka2, "Arr 2");
        printArray(arrayHasil, "Hasil");
        System.out.println(" ");

        System.out.println("===============penggabungan antara dua buah array===============");
        int [] arrayHasil2 = new int[arrayAngka1.length + arrayAngka2.length];
        for (int i =0; i <arrayAngka1.length; i++){
            arrayHasil2[i] = arrayAngka1[i];
        }
        for (int i =0; i <arrayAngka1.length; i++){
            arrayHasil2[i+arrayAngka1.length] = arrayAngka2[i];
        }
        printArray(arrayAngka1, "Arr 1");
        printArray(arrayAngka2, "Arr 2");
        printArray(arrayHasil2, "Hasil 2");
        System.out.println(" ");

        System.out.println("===============reverse sort array part 1===============");
        printArray(arrayAngka1, "Array 1");
        Arrays.sort(arrayAngka1);
        printArray(arrayAngka1, "Array shorted");
        reverseArray(arrayAngka1);
        printArray(arrayAngka1, "Reverse short array");
        reverseArray(arrayHasil2);
        printArray(arrayHasil2, "Contoh lain");
        System.out.println(" ");

        System.out.println("===============reverse sort array part 2===============");
        printArray(arrayAngka2,"Array 2");
        reverseArray2(arrayAngka2);
        printArray(arrayAngka2,"Reverse sort");








    }

//fungsi reverse sort
private static void reverseArray2(int[] dataArray){
        Arrays.sort(dataArray);
        int buffer;
        for (int i = 0; i < dataArray.length/2; i++){
            buffer = dataArray[i];
            dataArray[i] = dataArray[(dataArray.length - 1) - i];
            dataArray[(dataArray.length - 1) - i] = buffer;
        }
}
//fungsi reverse sort
private static void reverseArray(int[] dataArray){
        Arrays.sort(dataArray);
    int [] arrayBuffer = Arrays.copyOf(dataArray, dataArray.length);
    for (int i = 0; i < dataArray.length; i++){
        dataArray[i] = arrayBuffer[(arrayBuffer.length - 1) - i];
    }


}
//fungsi tambah array
    private static int [] tambahArray(int [] array1, int[] array2){
        int [] arrayHasil = new int [array1.length];
        for (int i = 0; i < array1.length; i++){
            arrayHasil[i] = array1[i] + array2[i];

        }
        return arrayHasil;
    }
//Fungsi print array
    private static void printArray(int [] dataArray, String message){
        System.out.println(message + " = " + Arrays.toString(dataArray));
    }
}