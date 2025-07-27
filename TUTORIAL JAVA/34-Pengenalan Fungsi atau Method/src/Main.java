public class Main {
    public static void main(String[] args) // fungsi atau method utama
    {
        System.out.println("Ini adalah main method atau fungsi utama");
         int x, y;

         x = 20;
         y = hitung(x);
        System.out.println(" x = " + x + " y = " + y);

        x = 30;
        y = hitung(x);
        System.out.println(" x = " + x + " y = " + y);

        x = 40;
        y = hitung(x);
        System.out.println(" x = " + x + " y = " + y);
    }

    private static int hitung (int input){
        int hasil;
        hasil = (input / 2) * input;

        return hasil;
    }
}