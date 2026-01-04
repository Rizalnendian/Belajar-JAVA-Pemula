import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Shape segitiga = new Triangle(4, 5);

        Shape lingkaran = new Circle(10);

        System.out.println("Luaas segitiga adalah: " + segitiga.getArea());
        System.out.println("Luas lingkaran adalah: " + lingkaran.getArea());
    }
}