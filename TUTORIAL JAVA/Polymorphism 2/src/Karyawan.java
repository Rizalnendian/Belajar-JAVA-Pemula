public class Karyawan extends Manusia {

    @Override
    void makan(){
        System.out.println("Karyawan makan");
    }

    @Override
    void tidur(){
        System.out.println("Karyawan tidur");
    }

    @Override
    void bergerak(){
        System.out.println("Karyawan bergerak");
    }
}