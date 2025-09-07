public class Main {
    public static void main(String[] args) {
        int[][] matrix_A = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] matrix_B = {
                {11, 12, 13},
                {14, 15, 16},
                {17, 18, 19}
        };

        int[][] matrix_C = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] matrix_D = {
                {11, 12},
                {13, 14},
                {15, 16}
        };

        System.out.println("Matrix A");
        printarray2d(matrix_A);

        System.out.println("Matrix B");
        printarray2d(matrix_B);

        System.out.println("Matrix C");
        printarray2d(matrix_C);

        System.out.println("Matrix D");
        printarray2d(matrix_D);

        System.out.println("Penjumlahan Matrix A + B");
        int[][] hasilTambah = printJumlahMatrix(matrix_A, matrix_B);
        printarray2d(hasilTambah);

        System.out.println("Perkalian Matrix C + D");
        int[][] hasilKali = printKaliMatrix(matrix_C, matrix_D);
        printarray2d(hasilKali);


    }

    private static void printarray2d(int[][] dataarray) {
        int baris = dataarray.length;
        int kolom = dataarray[0].length;
        for (int i = 0; i < baris; i++) {
            System.out.print("[");
            for (int j = 0; j < kolom; j++) {
                System.out.print(dataarray[i][j]);
                if (j < (kolom - 1)) {
                    System.out.print(",");
                } else {
                    System.out.print("]");
                }

            }
            System.out.print("\n");
        }
        ;
        System.out.print("\n");
    } //Fungsi Print Array

    private static int[][] printJumlahMatrix(int[][] dataMatrix, int[][] dataMatrix2) {
        int baris_A = dataMatrix.length;
        int kolom_A = dataMatrix[0].length;
        int baris_B = dataMatrix2.length;
        int kolom_B = dataMatrix2[0].length;
        int[][] hasil = new int[baris_A][kolom_A];

        if (baris_A == baris_B && kolom_A == kolom_B) {
            for (int i = 0; i < baris_A; i++) {
                for (int j = 0; j < kolom_A; j++) {
                    hasil[i][j] = dataMatrix[i][j] + dataMatrix2[i][j];
                }
            }

        } else {
            System.out.println("Matrix tidak memenuhi syarat penjumlahan");
        }
        return hasil;
    } //Fungsi Penjumlahan Matrix

    private static int[][] printKaliMatrix(int[][] dataMatrix, int[][] dataMatrix2) {
        int baris_1 = dataMatrix.length;
        int kolom_1 = dataMatrix[0].length;
        int baris_2 = dataMatrix2.length;
        int kolom_2 = dataMatrix2[0].length;
        int[][] hasilKali = new int[baris_1][kolom_2];

        //Jika matrix 1 * matrix 2 maka jumlah baris akan mengikuti matrix 1, kolom mengikuti kolom 2
        int buffer;
        if (kolom_1 == baris_2){
            for (int i = 0; i < baris_1; i++) {
                for (int j = 0; j < kolom_2; j++) {
                    buffer = 0;
                    for (int k = 0; k < kolom_1; k++) {
                        buffer += dataMatrix[i][k] * dataMatrix2[k][j];
                    }
                    hasilKali[i][j] = buffer;
                }
            }
        } else {
            System.out.println("Matrix tidak memenuhi syarat perkalian");
        }

        return hasilKali;
    } //Fungsi Pekalian Matrix
}