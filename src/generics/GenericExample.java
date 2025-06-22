package generics;

public class GenericExample {
    // Single Parameter
    private static <T>void printSomething(T t){
        System.out.println("Type Value is: "+t);
    }
    // double Parameter
    private static <T, U> void printSomething2(T t, U u){
        System.out.println("T : "+t+" U : "+u);
    }
    // single T parameter with T return.
    private static <T> T doSomething(T t){
        System.out.println("Value is: "+t);
        return t;
    }
    // T extends the numbers. any other thing appart from number would be result as Compile time error.
    private static <T extends Number> void doSomething2(T t){
        System.out.println("Value is: "+t);
    }

    public static void main(String[] args) {
        IntCounter intCounter = new IntCounter(2);
        intCounter.display();

        DoubleCounter doubleCounter = new DoubleCounter(2.0);
        doubleCounter.display();

        Counter<Integer> counter1 = new Counter<>(2); // In <> we can pass the type of parameter
        counter1.display();

        printSomething("SpringBoot"); // string
        printSomething(1); // integer
        printSomething(2.3); // double
        printSomething('c'); // Character
    }
}
