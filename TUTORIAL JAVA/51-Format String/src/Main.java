import java.util.Formatter;

public class Main {
    public static void main(String[] args) {
        String nama = "Udin";
        int umur = 19;

        //Cara 1 (manual)
        System.out.println("Nama saya " + nama + ", Umur saya " + umur);

        //Cara 2 dengan format
        System.out.printf("Nama saya %s, umur saya %d\n", nama, umur);

        //Cara agar % dapat dimunculkan tanpa dianggap sebagai struktur convertion
        System.out.printf("Nama saya %s, umur saya %d %%\n", nama, umur); //"%" diketik double agar muncul

        //Convertion:
        //f = Floating point
        //d = Integer
        //c = Character
        //s = String
        //b = Boolean

        //Format convertion = %[argumen_index$][flags][width][.prescision]convertion

        //[argumen_index$] untuk menampilkan isi argumen yang sama di beberapa posisi
        System.out.println( );
        System.out.println("[argumen_index$]");
        System.out.printf("%1$s, dimana kamu %1$s ?", nama); //nama adalah argumen, 1$ artinya argumen ke 1
        System.out.printf("\nUmur %1$s adalah %2$d, kamu juga %2$d? \n", nama, umur);

        //[flags] untuk menampilkan plus atau minus didepan
        System.out.println("\n[flags]");
        int int1 = 5;
        int int2 = 8;
        int hasil = int1 - int2;
        int hasil2 = int2 - int1;
        System.out.printf("%d - %d = %d\n", int1, int2, hasil); //jika int memang negatif maka defaultnya muncul (-)
        System.out.printf("%d - %d = %+d\n", int2, int1, hasil2); //jika int bukan negatif maka muncul (+)

        //[width]
        System.out.println("\n[width]");
        int int3 = 1000;
        System.out.println("INTEGER");
        System.out.printf("%d\n", int3);
        System.out.printf("%5d\n", int3); //flagnya lebih, slot kosongnya sebelah kiri/isi variabelnya rata kanan
        System.out.printf("%-5d\n", int3); //flagnya kurang(-5 misalnya), slot kosongnya ke sebelah kanan/isi variabelnya rata kiri
        System.out.printf("%+5d\n", int3);// "+" akan mengiisi slot kosong sesuai dengan posisi slot kosong seperti yang dijelaskan di atas
        //flags akan mengambil slot di dalam string literal
        System.out.printf("%+-6d\n", int3); // flags bisa digabungkan
        System.out.printf("%10d\n", int3);
        System.out.printf("% 10d\n", int3);// space akan mengisi atau menjadi leading
        System.out.printf("%010d\n", int3); //menambah leading 0 di depan
        System.out.printf("%+010d\n", int3); //menambah leading 0(di slot kosong) dan +(di slot kosong terdepan saja) di depan
        int int4 = 1000000000;
        System.out.printf("%-,15d\n", int4); // flags koma untuk menandakan delimeter per seribu

        System.out.println("\n FLOATING POINT");
        float float1 = 1.534f;
        System.out.printf("%f\n", float1); //lebar string default 6 desimal
        System.out.printf("%2f\n", float1); //jika %f< lebar string float maka tidak akan merubah nilai lebar string float
        System.out.printf("%10f\n", float1); //jika %f > lebar string float maka akan merubah nilai lebar string float dengan menambah space di depan
        System.out.printf("%+10f\n", float1); // tanda (+) akan berada di space kosong

        //[.precision]
        System.out.println("\n[.pricision]");
        float float2 = 15.678921f;
        System.out.printf("%f\n", float2); //kondisi normal float
        System.out.printf("%.1f\n", float2); //membulatkan menjadi 1 desimal
        System.out.printf("%.2f\n", float2); //membulatkan menjadi 2 desimal
        System.out.printf("%08.2f\n", float2); //kombinasi 2 desimal dan width string 8
        System.out.printf("%+08.2f\n", float2); //kombinasi 2 desimal dan width string 8


        //contoh
        String nama2 = "Rizal";
        float IPK = 3.64574631f;

        System.out.printf("\nIPK %1$s berapa?\n%1$s: saya dapet IPK %2$+5.2f", nama2, IPK);

        //kesimpulan
        // format bisa disimpan ke dalam variabel string
        String infoBiasa = "Nama: " + nama2 + ", IPK: " + IPK; //kekurangan tidak ada format
        System.out.println("\n");
        System.out.println("Biasa: \n" + infoBiasa);

        String infoFormat = String.format("Nama: %1$s\nIPK: %2$+5.2f", nama2, IPK);
        System.out.println("\n");
        System.out.println("String Format: \n" + infoFormat);

        //Save format ke dalam String Builder
        StringBuilder builder_info = new StringBuilder();
        Formatter formatBuilder = new Formatter(builder_info);
        System.out.println( "\n");
        formatBuilder.format("Nama: %1$s\nIPK: %2$+5.2f", nama2, IPK);
        System.out.println("String Builder: \n" + builder_info);


    }
}
