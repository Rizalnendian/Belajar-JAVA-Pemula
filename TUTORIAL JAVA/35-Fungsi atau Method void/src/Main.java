public class Main {
    public static void main(String[] args) {

        //void bisa diartikan tipe data kosong dan tidak memerlukan return
        System.out.println(simple());

        fungsiVoid("apapun");
        selamatPagi("Sayang");
    }

    private static void selamatPagi (String nama){
        System.out.println("Selamat pagi " + nama);
    }

    // fungsi atau method tanpa kembalian
    //hanya melakukan/mendeklarasikan kegiatan atau aksi saja
    // tanpa mengambil nilai dan tanpa proses perhitungan
    private static void fungsiVoid(String input){
        System.out.println(input);
    }

    //fungsi atau method dengan kembalian
    //sehingga menggunakan return untuk mengembalikan nilainya (10.0f)
    private static float simple(){
        return 10.0f; //melakukan perhitungan dan mengambil hasilnya
    }
}