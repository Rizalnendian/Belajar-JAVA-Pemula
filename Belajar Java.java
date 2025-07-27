public class Belajar Java#"TipedataBoolean"

class DemoBolean {
    public static void main(string[] args) {
        int a = 10;
        int b = 5;
        boolean hasil = !((a < 15) ^ (b > 6));
        System.out.println("Hasilnya adalah : " + hasil);
    }
}

#"TipedataInteger"

class TambahKurang {
    public static void main(string[] args) {
        int x = 10;
        int y = 5;
        System.out.println(x + "+" + y + "=" + (x + y));
        System.out.println(x + "-" + y + "=" + (x - y));
    }
}

#"TipedataFloatingpoint"

class KaliBagi {
    public static void main(string[] args) {
        double x = 7.0d;
        double y = 2.0d;
        System.out.println(x + "*" + y + "=" + (x * y));
        System.out.println(x + "/" + y + "=" + (x / y));
    }
}

#"TipedataCharandstring"

class Karakter {
    public static void main(string[] args) {
        char j = 'J';
        char a = 'A';
        char v = 'V';
        String tulisanJava = "Java";
        System.out.println("char: " + j + a + v + a);
        System.out.println("String:" + tulisanJava);
    }
}

#"Array1dimensi"

class TotalArray {
    public static void main (string[] args){
        int [] AJumlah = new int[10];
        System.out.println("Nilai isi Array adalah:");
        int x = 1;
        for (int i = 0; i < AJumlah.length; i++){
            AJumlah[i] = x;
            x++;
            System.out.println(AJumlah[i]);
        }
        int total = 0;
        for (int i = 0; i < AJumlah.length; i++){
            total+ = AJumlah[i];
        }
        System.out.println("============================");
        System.out.println("Hasil Penjumlahan Array:" +total)
    }
}

#"Array2dimensi"

class matrisk {
    public static void main(string[] args) {
        int[][] DuaDimensi = { { 10, 12 }, { 22, 14 } };
        System.out.println("Array dengan matrisk 2 x 2:");
        for (int i = 0; i < DuaDimensi.length; i++) {
            for (int j = 0; j < DuaDimensi[i].length; j++) {
                System.out.println(DuaDimensi[i][j] + "/t");
            }
            System.out.println();
        }
    }
}

#"Linkedlist"

import java.util.*;

class Latihlist {
    public static void main (string[] args) {
        LinkedList L = new LinkedList ();
        L.add("O");
        L.add("N");
        L.add("E");
        for(Object stacList : L){
            System.out.print(stacList + "->")
        }
    }
}

#"List"

class Latihlist2 {
    public static void main (string[] args) {
        LinkedList Q = new LinkedList ();
        Q.add("D");
        Q.add("O");
        Q.add("N");
        Q.add("E");
        System.out.println("List Java");
        for(Object queueList : Q){
            System.out.print(queueList + "->")
        }
    }
}