package collectionapi.set;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * add Employee(id, name) object into tree set.
 * where, default natural sorting is based on ascending order or employee id.
 * customized sorting is based on alphabetical order of employee name.
 */

class SortByName implements Comparator {

    @Override public int compare(Object o1, Object o2) {
        Employee emp1 = (Employee) o1;
        Employee emp2 = (Employee) o2;

        String empName1 = emp1.name;
        String empName2 = emp2.name;

        return empName2.compareTo(empName1);
    }
}
class Employee implements Comparable{
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override public int compareTo(Object o) {
        Employee emp = (Employee) o;

        int empId1 = this.id;
        int empId2 = emp.id;

        if(empId1 < empId2) return -1;
        else if(empId1 > empId2) return 1;
        else return 0;
    }
}

public class ComparatorQ2 {
    public static void main(String[] args) {

        TreeSet<Employee> emp = new TreeSet<>();

        emp.add(new Employee(10, "sachin"));
        emp.add(new Employee(31, "rahul"));
        emp.add(new Employee(5, "virat"));
        emp.add(new Employee(23, "ankit"));
        emp.add(new Employee(6, "dhoni"));

        System.out.println(emp); // ascending order based on employee id

        TreeSet<Employee> emp2 = new TreeSet<>(new SortByName());
        emp2.add(new Employee(10, "sachin"));
        emp2.add(new Employee(31, "rahul"));
        emp2.add(new Employee(5, "virat"));
        emp2.add(new Employee(23, "ankit"));
        emp2.add(new Employee(6, "dhoni"));

        System.out.println(emp2); // descending order based on employee name

    }
}
