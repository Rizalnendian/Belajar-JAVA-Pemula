import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int nilaiAwal, nilaiAkhir, total;
        Scanner inputNilai = new Scanner(System.in);

        System.out.print("Masukkan nilai awal: ");
        nilaiAwal = inputNilai.nextInt();

        System.out.print("Masukkan nilai akhir: ");
        nilaiAkhir = inputNilai.nextInt();

        total = 0;
// Program pertambahan dengan while
        while (nilaiAwal <= nilaiAkhir){
            total = total + nilaiAwal;
            System.out.println("ditambah " + nilaiAwal + " menjadi " + total);
            nilaiAwal++;

        }
// Program pertambahan dengan do while
        do {
            total = total + nilaiAwal;
            System.out.println("ditambah " + nilaiAwal + " menjadi " + total);
            nilaiAwal++;
        } while (nilaiAwal <= nilaiAkhir);

// Program pertambahan dengan for
        for (total = 0; nilaiAwal <= nilaiAkhir; nilaiAwal++){
            total = total + nilaiAwal;
            System.out.println("ditambah " + nilaiAwal + " menjadi " + total);
        }

    }
}