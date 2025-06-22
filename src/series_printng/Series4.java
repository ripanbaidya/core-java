package series_printng;

import java.util.Scanner;

// This program calculates the sum of a series of factorials from 1! to n!.
// sum = 1! + 2! + 3! + .... n! where n is natural number.
public class Series4 {
    // calculate factorial of a number
    static int factorial(int n) {
        int fact = 1;

        for(int i = 1; i <= n; i ++){
            fact *= i;
        }

        return fact;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of terms (n): ");
        int n = scan.nextInt();

        int sum = 0;

        for(int i = 1 ; i <= n ; i ++){
            sum += factorial(i);
        }

        System.out.println("The sum is " +sum);
    }
}
