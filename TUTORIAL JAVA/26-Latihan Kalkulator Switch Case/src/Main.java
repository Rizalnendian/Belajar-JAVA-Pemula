import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float a,b,hasil;
        String operator;
        Scanner userInput;
        userInput= new Scanner(System.in);

        System.out.print("Nilai pertama: ");
        a = userInput.nextFloat();
        System.out.print("operator: ");
        operator = userInput.next();
        System.out.print("Nilai kedua: ");
        b = userInput.nextFloat();

        switch (operator){
            case "+":
                hasil = a + b;
                System.out.println("Hasil = " + hasil);
                break;
            case "-":
                hasil = a - b;
                System.out.println("Hasil = " + hasil);
                break;
            case "*":
                hasil = a * b;
                System.out.println("Hasil = " + hasil);
                break;
            case "/":
                hasil = a / b;
                System.out.println("Hasil = " + hasil);
                break;
            default:
                System.out.println("Operator (" + operator + ") tidak ditemukan");
        }
    }
}