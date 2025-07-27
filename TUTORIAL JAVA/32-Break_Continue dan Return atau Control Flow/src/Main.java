public class Main {
    public static void main(String[] args) {

        int a = 0;
        while (true){
            if (a == 25){
                break; // berfungsi untuk memaksa menghentikan perulangan
            } else if ( a >= 15) {
                continue; // untuk memaksa melanjutkaan program
            } else if (a == 5) {
                return; //memaksa sebuah method selesai
            }
            a++;
            System.out.println("Looping ke " + a);
        }
        System.out.println("End program");
    }
}