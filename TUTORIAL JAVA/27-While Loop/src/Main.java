public class Main {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        boolean kondisi = true;
        boolean kondisi2  = true;

//        while (kondisi){
//            System.out.println("Looping ke " + a);
//            a++;
//            if (a >= 25){
//                kondisi = false;
//            }
        System.out.println("increment/decrement setelah print");
         while (kondisi){
             System.out.println("Looping ke " + a);
             a++;
             if (a >= 10){
                 kondisi = false; //merubah kondisi di tengah perulangan
             }
         }
        System.out.println( );
        System.out.println("increment/decrement sebelum print");
        while (kondisi2){
            b++;
            System.out.println("Looping ke " + b);
            if (b >= 10){
                kondisi2 = false; //merubah kondisi di tengah perulangan
            }
        }
    }
} // perulangan ini langsung berakhir ketika kondisinya false, perulangan terjadi ketika kondisinya treu