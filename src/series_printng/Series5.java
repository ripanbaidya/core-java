package series_printng;

import java.util.Scanner;

// This program calculates the sum of a series of squares from 1^2 to n^2.
// sum = 1^2 + 2^2 + 3^2 + .... n^2, where n is natural number.
public class Series5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of terms (n): ");
        int n = scan.nextInt();

        int sum = 0;

        for(int i = 1 ; i <= n ; i ++){
            sum += (int) (1 / (Math.pow(i, 2)));
        }

        System.out.println("The sum is: " +sum);
    }
}
