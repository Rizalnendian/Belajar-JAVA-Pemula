public class Main{
    static void main(String[] args) {
        try {
            int a = 1/0; //masukan program yang berpotensi salah
            System.out.println("Perintah selanjutnya");
        }
        catch (Exception kesalahan){
            System.out.println("Terdapat kesalahan");
        }
    }
}