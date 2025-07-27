public class Main {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        boolean kondisi = true;

//        do {           Melakukan Aksi sampai kondisi tertentu
//            aksi
//        } while(kondisi);

        do {
            a++;
            System.out.println("do while ke " + a);
            if ( a >= 10){
                kondisi = false;
            }
        } while(kondisi);
        System.out.println("");
        do {
            b--;
            System.out.println("do while ke " + b);
            if ( b < 0){
                kondisi = false;
            }
        } while(kondisi);

        //false eksekusi sekali langsung berhenti perulangan
        //true eksekusi berkali kali sampai whilenya terpenuhi
    } // perulangan ini minimal terjadi sekali jika kondisinya false, dan perulangan terjadi jika kondisinya treu
}