import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float a,b,hasil;
        char operator;
        Scanner userInput;

        userInput= new Scanner(System.in);
        System.out.print("Nilai pertama: ");
        a = userInput.nextFloat();
        System.out.print("operator: ");
        operator = userInput.next().charAt(0);
        System.out.print("Nilai kedua: ");
        b = userInput.nextFloat();

        System.out.println("User input: " + a + " " + operator + " " + b);

        if (operator == '+'){
            hasil = a + b;
            System.out.println("Hasil = " + hasil);
        } else if (operator == '-') {
            hasil = a - b;
            System.out.println("Hasil = " + hasil);
        } else if (operator == '*') {
            hasil = a * b;
            System.out.println("Hasil = " + hasil);
        } else if (operator == '/') {
            if (b == 0){
                System.out.println("Pembagian tak hingga");
            } else {
                hasil = a / b;
                System.out.println("Hasil = " + hasil);
            }
        }else {
            System.out.println("Error");
        }
    }
}