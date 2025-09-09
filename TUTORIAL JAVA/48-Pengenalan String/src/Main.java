import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //membuat string
        String kataStr = "Halo nama saya Jale";
        char[] kataChar = {'h','a','l','o'};

        //menampilkan string
        System.out.println(kataStr);
        System.out.println(kataChar);
        System.out.println(Arrays.toString(kataChar));

        //mengakses komponen dari string
        System.out.println("Komponen pertama Char = " + kataChar[0]);
        System.out.println("Komponen pertama Char = " + kataStr.charAt(0));

        //merubah komponen string itu tidak bisa karena imutable
        kataChar[0] = 'c';
        System.out.println("Komponen pertama Char = " + kataChar[0]);

        //trik merubah string secara tidak langsung
        //Pada dasarnya cara ini mengcopy lalu menimpa komponen tertentu, tida benar benar bengganti String yang lama
        String testNimpa = "Hai " + kataStr.substring(5, 19);
        System.out.println(testNimpa);

        printAdress("testNimpa", testNimpa); //Adressnya berbeda
        printAdress("kataStr", kataStr); //Adressnya berbeda

        //Memory dari string
        String str1 = "Test";
        String str2 = "Test"; //Jika isi String sama, maka adressnya akan sama
        String str3 = "Cek toko sebelah";

        printAdress("str1", str1);
        printAdress("str2", str2);
        printAdress("str3", str3);

        str3 = str3.substring(0,4);
        printAdress("str3", str3);

        String str4 = "Halo nama saya Jale";
        printAdress("str4", str4);

        //Kesimpulan
        //1. String di JAVA itu imutable
        //2. String yang berada di string pool itu akan reusable/bisa digunakan kembali karena alamatnya sama, memorynya lebih efisien
        //3. membuat string dengan method baru, maka akan disimpan di memory lain, bukan di string pool



    }
    private static void printAdress(String nama, String data){
        int address = System.identityHashCode(data);
        System.out.println(nama + " = " + data + "\t|| address = " + Integer.toHexString(address));

    }
}