//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Operator komparasi yang menghasilkan bentuk boolean

        //Operator equal/persamaan
        int a,b;
        boolean hasilkomparasi;
        a = 25;
        b = 5;
        hasilkomparasi = (a == b);
        System.out.printf("Apakah %d == %d ? : %s\n",a,b,hasilkomparasi);

        //Operator not equal/tidak persamaan
        int c,d;
        boolean hasilkomparasi2;
        c = 25;
        d = 5;
        hasilkomparasi2 = (c != d);
        System.out.printf("Apakah %d != %d ? : %s\n",c,d,hasilkomparasi2);

        //Operator greater than/lebih besar dari
        int e,f;
        boolean hasilkomparasi3;
        e = 25;
        f = 5;
        hasilkomparasi3 = (e > f);
        System.out.printf("Apakah %d > %d ? : %s\n",e,f,hasilkomparasi3);

        //Operator less than/lebih kecil dari
        int g,h;
        boolean hasilkomparasi4;
        g = 25;
        h = 5;
        hasilkomparasi4 = (g < h);
        System.out.printf("Apakah %d < %d ? : %s\n",g,h,hasilkomparasi4);

        //Operator  greater than equal/lebih besar dari sama dengan
        int i,j;
        boolean hasilkomparasi5;
        i = 25;
        j = 5;
        hasilkomparasi5 = (e >= f);
        System.out.printf("Apakah %d >= %d ? : %s\n",i,j,hasilkomparasi5);

        //Operator less than equal/lebih kecil dari sama dengan
        int k,l;
        boolean hasilkomparasi6;
        k = 25;
        l = 25;
        hasilkomparasi6 = (k <= l);
        System.out.printf("Apakah %d <= %d ? : %s\n",k,l,hasilkomparasi6);
    }
}