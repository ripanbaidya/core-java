package series_printng;

// This program calculates the sum of a series from 1, 1/3, 1/9, 1/27, ..., up to n terms.
// sum = 1 + 1/3+ 1/9 + 1/27 + .... n
import java.util.Scanner;

public class Series2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of terms (n): ");
        int n = scan.nextInt();

        double sum = 0.0;

        for(int i = 0 ; i < n ; i ++){
            sum += 1 / Math.pow(3, i);
        }

        System.out.println("The sum is: " +sum);
    }
}
