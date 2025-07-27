//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Unary = operasi yang dilakukan pada satu variabel
        //Unary plus dan minus
        int angka = 1;
        System.out.printf("Unary '-', %d menjadi %d\n",angka,-angka); //unary minus
        System.out.printf("Unary '+', %d menjadi %d\n",angka,+angka); //unary plus tidak akan ditampilkan plusnya

        //Unary Decrement dan Increment
        int x = 1;
        System.out.printf("Unary '++', %d menjadi %d\n",x,++x); //unary Increment untuk menambah +1 dari nilai variabel
        System.out.printf("Unary '--', %d menjadi %d\n",x,--x); //unary Decrement untuk mengurangi -1 dari nilai variabel
        int y = 2;
        int z = 2;
        System.out.printf("Unary '++' postfix, %d menjadi %d\n",y,y++); //++ akan dieksekusi sesudah ditampilkan (dimunculkan dulu, baru di tambahkan saat memanggil variabel terkait)
        System.out.printf("Unary '++' postfix, menjadi %d\n",y);
        System.out.printf("Unary '++' prefix, %d menjadi %d\n",z,++z); //++ akan dieksekusi sebelum ditampilkan (ditambah dulu baru ditampilkan)

        //Unary Boolean dengan ! untuk negasi
        boolean jale = true;
        System.out.println("Nilai boolean = " +true);
        System.out.println("Nilai boolean = " +!true); //membalikkan nilai boolean

    }
}