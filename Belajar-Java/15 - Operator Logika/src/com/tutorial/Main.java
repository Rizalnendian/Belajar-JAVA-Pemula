package com.tutorial;

public class Main {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = true;
        boolean c = false;
        boolean d = false;

        System.out.println("Jika a = " + a);
        System.out.println("Jika b = " + b);
        System.out.println("Jika c = " + c);
        System.out.println("Jika d = " + d);
        System.out.println( );

        System.out.println("Logika And (&&)");
        boolean and = (a && b);
        boolean and2 = (b && c);
        boolean and3 = (c && b);
        boolean and4 = (c && d);
        System.out.println(a + " && " + b + " = " + and);
        System.out.println(b + " && " + c + " = " + and2);
        System.out.println(c + " && " + b + " = " + and3);
        System.out.println(c + " && " + d + " = " + and4);
        System.out.println();

        System.out.println("Logika Or (||)");
        boolean or = (a || b);
        boolean or2 = (b || c);
        boolean or3 = (c || b);
        boolean or4 = (c || d);
        System.out.println(a + " || " + b + " = " + or);
        System.out.println(b + " || " + c + " = " + or2);
        System.out.println(c + " || " + b + " = " + or3);
        System.out.println(c + " || " + d + " = " + or4);
        System.out.println();

        System.out.println("Logika Xor (^)");
        boolean xor = (a ^ b);
        boolean xor2 = (b ^ c);
        boolean xor3 = (c ^ b);
        boolean xor4 = (c ^ d);
        System.out.println(a + " ^ " + b + " = " + xor);
        System.out.println(b + " ^ " + c + " = " + xor2);
        System.out.println(c + " ^ " + b + " = " + xor3);
        System.out.println(c + " ^ " + d + " = " + xor4);
        System.out.println();

        System.out.println("Logika Negasi (!&)"); //berlaku juga untuk satu variabel
        boolean negand = !(a && b);
        boolean negand2 = !(b && c);
        boolean negand3 = !(c && b);
        boolean negand4 = !(c && d);
        System.out.println(a + " !& " + b + " = " + negand);
        System.out.println(b + " !& " + c + " = " + negand2);
        System.out.println(c + " !& " + b + " = " + negand3);
        System.out.println(c + " !& " + d + " = " + negand4);
        System.out.println();
    }
}
