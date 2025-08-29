package Week2Patika;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ahmet Yılmaz", 2000, 45, 2010);
        System.out.println(emp1.toString());

        System.out.println("-----------------");

        Employee emp2 = new Employee("Ayşe Kaya", 950, 38, 2005);
        System.out.println(emp2.toString());
    }
}
