import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ternary operator

        int input, x;
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        input = inputUser.nextInt();
        System.out.println(input);

        //variabel x = ekspresi ? statment_true : statment_false
        x = (input == 10) ? input*input : (input/2);
        //mempersingkat program
        //if (innput == 10){x = input*input}
        // else{ x = input/2}

        System.out.println("Hasilnya " + x);

    }
}