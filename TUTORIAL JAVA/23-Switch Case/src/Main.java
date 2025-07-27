import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //switch case

        //ekspresi berupa satuan(int, long, byte, short), String, atau enum
        String input;

        Scanner inputUser = new Scanner(System.in);

        System.out.print("Nama: ");
        input = inputUser.next();

        switch (input){
            case "upin": //sama seperti if
                System.out.println("Nama saya " + input);
            break;
            case "ipin":
                System.out.println("Saya adiknya upin");
            break;
            default: //sama seperti else
                System.out.println("Kami kawannya upin & ipin");
        }
    }
}