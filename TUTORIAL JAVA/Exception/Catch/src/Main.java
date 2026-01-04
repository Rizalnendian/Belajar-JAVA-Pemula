public class Main {
    static void main(String[] args) {
        try {
            int a = 1/0;
            System.out.println("Program aman");
        }
        //catch berkali kali
        catch (NullPointerException e){

        }
        catch (ArrayIndexOutOfBoundsException e){

        }
        catch (Exception e){

        }
    }
}