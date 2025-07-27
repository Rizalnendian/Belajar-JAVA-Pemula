//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Operator Logika adalah operasi yang bisa dilakukan pada tipe data boolean
        boolean a,b,c;

        //or/atau (||)
        System.out.println("==== OR (||) ====");
        a = false;
        b = false;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c);

        a = true;
        b = false;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c);

        a = true;
        b = false;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c);

        a = true;
        b = true;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c);
        System.out.println("");

        //XOR/exlusif OR (^)
        System.out.println("==== XOR (^) ====");
        a = false;
        b = false;
        c = (a^b);
        System.out.println(a + " ^ " + b + " = " + c);

        a = true;
        b = false;
        c = (a^b);
        System.out.println(a + " ^ " + b + " = " + c);

        a = true;
        b = false;
        c = (a^b);
        System.out.println(a + " ^ " + b + " = " + c);

        a = true;
        b = true;
        c = (a^b);
        System.out.println(a + " ^ " + b + " = " + c);
        System.out.println("");

        //AND/dan (&&)
        System.out.println("==== AND (&&) ====");
        a = false;
        b = false;
        c = (a&&b);
        System.out.println(a + " && " + b + " = " + c);

        a = true;
        b = false;
        c = (a||b);
        System.out.println(a + " && " + b + " = " + c);

        a = true;
        b = false;
        c = (a||b);
        System.out.println(a + " && " + b + " = " + c);

        a = true;
        b = true;
        c = (a||b);
        System.out.println(a + " && " + b + " = " + c);
        System.out.println("");

        // NOT/negasi adalah flipping/membalikkan (!)
        System.out.println("==== NOT (!) ====");
        a = true;
        c = !a;
        System.out.println(a + " (!) = " + c);
        a = false;
        c = !a;
        System.out.println(a + " (!) = " + c);




    }
}