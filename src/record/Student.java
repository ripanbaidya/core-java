package record;

import java.util.Objects;

/**
 * This is a Normal POJO class. this class would have instance variables and methods.
 * For each variable, we might need to create getter and setter methods, Constructor, toString(), hashCode(), equals().
 * and to do all these, we need to manually write the code or need to override the methods.
 * this kills time and degrades the readability of the code.
 *
 * We have alternative way to do this.
 * we can use record class.
 */
public class Student {
    private String name;
    private String address;

    // Constructor
    public Student(String name, String address){
        this.name = name;
        this.address = address;
    }

    // Getter, Setter Methods
    public void setName(String name){ this.name = name; }
    public void setAddress(String address) { this.address = address; }

    public String getName(){ return name; }
    public String getAddress(){ return address; }

    // Overriding equals() method
    // this would depend on the Programming Requirement
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student that = (Student) o;
        return Objects.equals(name, that.name) && Objects.equals(address, that.address);
    }

    // Overriding toString() method
    @Override
    public String toString() {
        return "StudentClass{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    // Overriding hashCode() method
    @Override
    public int hashCode() {
        return Objects.hash(name, address);
    }
}
