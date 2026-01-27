public class Main {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("halo");
        printData(builder);

        //append (ditaruh di belakang)
        System.out.println("========== Append ==========");
        builder.append(" teman teman");
        printData(builder);

        builder.append(" semuanya");
        printData(builder);

        //insert (ditambahkan di antara atau sesuai posisi)
        System.out.println("========== Insert ==========");
        builder.insert(0, "Pagi, "); //indexnya merupakan index posisi awal penambahan data string
        printData(builder);

        //delete (menghapus di antara atau sesuai posisi)
        System.out.println("========== Delete ==========");
        builder.delete(10, 22);
        printData(builder);

        //rubah karakter pada index tertentu
        System.out.println("========== Rubah karakter pada index tertentu ==========");
        builder.setCharAt(6, 'H');
        printData(builder);

        //Replace (mengganti kata dengan kata yang lain)
        System.out.println("========== Replace ==========");
        builder.replace(0,4, "Malam");
        printData(builder);


        //Casting string builder menjadi string
        System.out.println("========== Casting string builder menjadi string ==========");
        String kalimat = builder.toString();
        System.out.println(kalimat);
        int adressKalimat2 = System.identityHashCode(kalimat);
        System.out.println("address = " + Integer.toHexString(adressKalimat2));
        System.out.println( );






    }
    private static void printData(StringBuilder data1){
        System.out.println("Data = " + data1);
        System.out.println("Panjang = " + data1.length());
        System.out.println("Kapasitas = " + data1.capacity()); //defaultnya 16 lalu akan bertambah sesuai dengan jumlah panjang string

        int adressBuilder = System.identityHashCode(data1);
        System.out.println("address = " + Integer.toHexString(adressBuilder));
        System.out.println( );
    }
}