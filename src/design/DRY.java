package design;

/**
 * DRY stands for do not repeat yourself.
 * This is a principle of software development which say that we should avoid writing same peace
 * of code multiple times.
 * Instead of writing the same peace of code multiple times, we could put that peace of code inside
 * a method and can call it, when it's needed.
 */
public class DRY {
    int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
    int add (int a, int b, int c, int d) {
        return a + b + c + d;
    }

    /**
     * Using var args we can get rid of repeated same code.
     * This feature allows us to pass a variable number of arguments to a method.
     * Instead of writing separate methods for each number of arguments, we can use a single method
     * that accepts a variable number of arguments.
     */
    int add(int ...args) {
        int sum = 0;
        for (int num : args)
            sum += num;
        return sum;
    }
    public static void main(String[] args) {
        DRY ref = new DRY();

        int add2 = ref.add(10, 20);
        int add3 = ref.add(10, 20, 30);
        int add4 = ref.add(10, 20, 25, 30);

        /**
         * Here, we are violating the principle of DRY.
         * For each 'add' method where the number of parameters is different, we are writing the same piece of code.
         * We could have a better option to resolve this issue, which is using varargs.
         * Varargs allows us
         * to pass a variable number of arguments to a method.
         * It provides a convenient way to handle situations where the number of arguments is not fixed.
         */

        // the method which has variable number of arguments is called here
        int sum = ref.add(4, 3, 8, 9, 2, 4 );
        System.out.println("Sum is: " + sum);
    }
}
