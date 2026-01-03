public class Employee extends Person{
    float salary = 2200000f;
    String name = "Rizal Nendian Rezkita";
    int age = 21;

    public Employee(String rizal, int i, float v) {
        super();
    }

    public void showInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age );
        System.out.println("Salary: Rp " + salary);
    }
}