package series_printng;

import java.util.Scanner;

// This program calculates the sum of a series from 1, 1/2, 1/4, 1/8, ..., up to n terms.
// sum = 1 + 1/2 + 1/4 + 1/8 + .... n
public class Series1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of terms (n): ");
        int n = scan.nextInt();

        double sum = 0.0;

        for(int i = 0 ; i < n ; i ++){
            sum += 1 / (Math.pow(2, i));
        }

        System.out.println("The Sum is: " + sum);
    }
}
