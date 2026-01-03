public static void main(String[] args) {
    System.out.println(Pegawai);
}



public class Pegawai{
    public String nama;
    public double gaji;
}

public class Manajer extends Pegawai{
    public String departemen;
}

public void IsiData(String n, String d){
    String nama = n;
    String departemen = d;
}