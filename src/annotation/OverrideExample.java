package annotation;

public class OverrideExample {
    static class Parent {
        public void display() {
            System.out.println("Display method in Parent class");
        }
    }

    static class Child extends Parent{
        @Override
        public void display() {
            System.out.println("Child class is overriding the Parent class method");
        }
    }

    public static void main(String[] args) {
        Parent parent = new Parent();
        Parent parentRef = new Child(); // Upcasting
        Child child = new Child();

        parent.display();
        parentRef.display();
        child.display();
    }
}
