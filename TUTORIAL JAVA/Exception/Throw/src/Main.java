public class Main {
    static void main(String[] args) {
        try{
            throw new Exception("Terdapat kesalahan");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}