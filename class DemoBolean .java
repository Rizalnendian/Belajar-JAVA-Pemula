
class DemoBolean {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        Boolean hasil = !((a < 15) ^ (b > 6));
        System.out.println("Hasilnya adalah : " + hasil);
    }
}