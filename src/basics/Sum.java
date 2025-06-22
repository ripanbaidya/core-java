package basics;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter first number :");
        int num1 = scan.nextInt();

        System.out.println("enter second number :");
        int num2 = scan.nextInt();

        int sum = num1 + num2;

        System.out.println("the sum is: "+sum);

    }
}
