public class Main {
    public static void main(String[] args) {

        int hasilInteger;
        hasilInteger = tambah(4,5);
        printAngka(hasilInteger);

        hasilInteger = tambah(4,5, 1);
        printAngka(hasilInteger);

        float hasilFloat;
        hasilFloat = tambah(5.5f, 4);
        printAngka(hasilFloat);

        hasilFloat = tambah(5, 4.5f);
        printAngka(hasilFloat);


        printAngka(10);
        printAngka(10.5f);
        printAngka(17.99d);
    }
    //overload method, method dengan nama yang sama tetapi dengan tipe data yang berbeda
    //memungkinkan eksekusi perintah print method menyesuaikan dengan tipe datanya


    private  static float tambah(float angkaf1, int angkaint2){
        return angkaf1 + angkaint2;
    }

    private  static float tambah(int angkaint1, float angkaf2){
        return angkaint1 + angkaf2;
    }

    private  static int tambah(int angkaint1, int angkaint2){
        return angkaint1 + angkaint2;
    }

    private  static int tambah(int angkaint1, int angkaint2, int angkaint3){
        return angkaint1 + angkaint2 + angkaint3;
    }

///////////////////////
    private static void printAngka(int angkaInteger){
        System.out.println("Angka ini adalah integer dengan nilai = " + angkaInteger);
    }
//////////////////////
    private static void printAngka(float angkaFloat){
        System.out.println("Angka ini adalah float dengan nilai = " + angkaFloat);
    }
//////////////////////
    private static void printAngka(double angkaDouble){
        System.out.println("Angka ini adalah double dengan nilai = " + angkaDouble);
    }
}