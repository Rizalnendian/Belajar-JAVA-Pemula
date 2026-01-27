import java.util.Scanner;
import java.lang.String;

public class Main {
    public static void main(String[] args) {
        String kalimat = "Saya adalah mahasiswa IT ";

        //Mengambil komponen dari string
        System.out.println(kalimat.charAt(0));

        //Subsring
        String kata = kalimat.substring(22,24);
        System.out.println(kata);

        //concatenation (concat) atau menyambungkan
        String kalimat2 = kalimat + "di UT angkatan"; // membuat string baru
        System.out.println(kalimat2);

        String Kalimat3 = kata + " Programmer"; //ditaro di String pool
        System.out.println(Kalimat3);

        //concat dengan non string
        int tahun = 2023; //akan otomatis berubah jadi String atau disebut casting
        String kalimat3 = kalimat2 + " " + tahun;
        System.out.println(kalimat3);

        //lowercase dan uppercase
        String kataBaru = kalimat.substring(0,5);
        System.out.println(kataBaru.toLowerCase());
        System.out.println(kataBaru.toUpperCase());

        //replace
        String kalimat4 = kalimat3.replace("IT", "FST");
        System.out.println(kalimat4); //menyimpan di memory yang baru

        //Comparasi (jarak antar alfabetic huruf)
        String motor1 = "Beat sporty";
        String motor2 = "Beat deluxe";
        System.out.println("Komparasi");
        System.out.println(motor1.compareTo(motor2)); //hasilnya akan menampilkan jarak alfabet pada huruf yang berbeda, diperiksa dari awal kalimat
        System.out.println(motor2.compareTo(motor1)); //jika ada huruf yang sama pada posisi yang sama maka akan langsung memeriksa kedua huruf di posisi selanjutnya

        //equality atau persamaan
        String kataInput = "test"; //ini berada di string pool
        String kataTest = "test"; //ini juga di string pool
        String test2 = new String("test"); // tidak berada di string pool

        System.out.println("Persamaan pada lokasi string pool");
        perbandinganString(kataInput, kataTest); //hasilnya sama karena berada di lokasi string pool yang sama
        perbandinganString(kataInput, test2); //hasilnya akan beda karena bukan string literal dan tidak berada di string pool

        Scanner userInput = new Scanner(System.in);//String dari input user tidak berada di string pool
        System.out.println("\nmengambil input string dari user: ");
        kataInput = userInput.next();
        System.out.println("Ini adalah input user: " + kataInput);
        perbandinganString(kataInput, kataTest);
        perbandinganIsiString(kataInput, kataTest);









    }
    private static void perbandinganString(String dataString1, String dataString2){
        System.out.println("Apakah " + "'" + dataString1 + "'" + " & " + "'" + dataString2 + "'" + " berada di memory/stringpool yang sama?");
        if (dataString1 == dataString2){
            System.out.println("Sama");
        } else {
            System.out.println("Beda");
        }
        System.out.println("\n");
    }

    private static void perbandinganIsiString(String dataString1, String dataString2){
        System.out.println("Apakah " + "'" + dataString1 + "'" + " & " + "'" + dataString2 + "'" + " memiliki isi yang sama?");
        if (dataString1.equals(dataString2)){
            System.out.println("Sama");
        } else {
            System.out.println("Beda");
        }
        System.out.println("\n");
    }
}