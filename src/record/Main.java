package record;

public class Main {
    public static void main(String[] args) {
        // Creating a Student object using StudentClass
        Student student = new Student("Ryan", "ryan@gmail.com");

        // Accessing properties
        System.out.println("Name: " + student.getName());
        System.out.println("Email: " + student.getAddress());

        Employee employee = new Employee(1, "Rohit", "HR", 150000.00);

        // accessing method declared in record
        employee.display();

        // accessing properties
        System.out.println("name :"+ employee.name());
        System.out.println("role :"+ employee.role());

        // accessing other method
        System.out.println(employee.toString());

        System.out.println(employee.hashCode());
    }
}
