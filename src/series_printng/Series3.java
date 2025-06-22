package series_printng;

import java.util.Scanner;

// This program calculates the sum of a series from 1, (1+2), (1+2+3), ..., up to n terms.
// sum = 1 + (1+2) + (1+2+3) + .... n
public class Series3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of terms (n): ");
        int n = scan.nextInt();

        double sum = 0.0;

        for(int i = 1 ; i <= n ; i ++){
            for(int j = 1; j <= i ; j ++){
                sum += j;
            }
        }

        System.out.println("The sum is: " +sum);
    }
}
