package basics;
// factorial of a number

public class Factorial {
    static int factorial(int n) {
        int fact = 1;
        for(int i = 1; i <= n; i ++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {

        int n = 5;

        int result = factorial(n);
        System.out.println(n);
    }
}
