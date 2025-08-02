import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.print("Panjang = ");
    int inputPanjang = input.nextInt();

    System.out.print("Lebar = ");
    int inputLebar = input.nextInt();

    gambar(inputPanjang, inputLebar);

    luasDankeliling(inputPanjang, inputLebar);

    }
    //Fungsi cetak hasil luas dan keliling
    private static void luasDankeliling(int panjang, int lebar){
        System.out.println("Luas = " + luas(panjang, lebar));
        System.out.println("Keliling = " + keliling(panjang, lebar));
    }

    //FUNGSI keliling
    private static int keliling(int panjang, int lebar){
        int hasilKeliling = (panjang + lebar) * 2;
        return hasilKeliling;
    }

    //FUNGSI luas
    private static int luas(int panjang, int lebar){
        int hasilLuas = panjang * lebar;
        return hasilLuas;
    }

    //FUNGSI GAMBAR PERSEGI
    private static void gambar (int panjang, int lebar){
        for (int i = 0; i < lebar; i++){
            for (int j = 0; j < panjang; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

}