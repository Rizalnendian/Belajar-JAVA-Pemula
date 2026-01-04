public class Main {
    static void main(String[] args) {
        try {
            int a = 1/0;
        }
        catch (Exception e){
            System.out.println("Terdapat kesalahan dalam program");
        }
        finally {
            System.out.println("Program berhasil dijalankan");
        }
    }
}