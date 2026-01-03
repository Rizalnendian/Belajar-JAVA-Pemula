//Class untuk eksekusi polymorphism
public class Main {
    public static void main (String[] args){
        Manusia[] manusia = new Manusia[4]; //deklarasi array yang berisi objek dari tipe manusia

        //Input tiap class objek ke dalam array
        manusia [0] = new Siswa();
        manusia [1] = new Karyawan();
        manusia [2] = new Programmer();
        manusia [3] = new Dosen();

        for (int i=0; i< manusia.length; i++){
            manusia[i].makan();
            manusia[i].tidur();
            manusia[i].bergerak();

            System.out.println();
        }
    }
}














