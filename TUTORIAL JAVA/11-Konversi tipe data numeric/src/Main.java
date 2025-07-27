//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //program untuk konversi data
        int nilaiInt = 256;
        System.out.println("Nilai Int = " + nilaiInt);

        //Memperluas rentang ke tipe data yang lebih besar
        long nilaiLong = nilaiInt;
        System.out.println("Nilai long= " + nilaiLong);

        //Memperkecil rentang ke tipe data yang lebih kecil
        byte nilaiByte = (byte) nilaiInt;
        System.out.println("Nilai byte = " + nilaiByte);
        System.out.println("nilai max byte = " + Byte.MAX_VALUE);
        System.out.println("nilai max byte = " + Byte.MIN_VALUE);

        System.out.println("Note: Jika mengkonversi data yang diluar rentang tipe data tujuan maka hasilnya akan tidak sesuai");

        //Casting pembagian
        int a = 10;
        float b = 4;
        float c = a/b;
        System.out.printf("%d / %f = %f\n",a,b,c);

        int x = 10;
        int y = 4;
        float z = (float) x/y;
        System.out.printf("%d / %d = %f\n",x,y,z);

    }
}