import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Urutan operasi aritmatika
        //perkalian dan pembagian didahulukan dibanding + dan -, dilakukan dari yang paling kiri
        int kali = 10 * 5 + 8;
        int kali2 = 8 + 10 * 5;
        System.out.println(kali);
        System.out.println(kali2);

        int bagi = 10/ 5 + 8;
        int bagi2 = 8 + 10 / 5;
        System.out.println(bagi);
        System.out.println(bagi2);

        int kaliBagi = 10 * 5 + 10/ 5;
        System.out.println(kaliBagi);

        //Operasi aritmatika pengoperasiannya dapat diatur dengan pengelompokkan operasi
        int kelompok = 5 * (2 +10); //Pada dasarnya operasi diutamakan pada operasi yang ada di dalam kurung dahulu lalu kali & bagi, dan terakhiur tambah dan kurang
        System.out.println(kelompok);

        //Urutan operasi aritmatika: dalam kurung, eksonen/pangkat, kali bagi, tambah kurang

        System.out.println("==============================");
        Scanner userInput = new Scanner(System.in);
        //perhitungan persamaan kuadrat
        int m,x,c;
        System.out.print("Nilai x = ");
        x = userInput.nextInt();
        System.out.print("Gradient m = ");
        m = userInput.nextInt();
        System.out.print("Bias c = ");
        c = userInput.nextInt();
        int y = m * x * x + c;

        System.out.println("Nilai y = " + y);


    }
}