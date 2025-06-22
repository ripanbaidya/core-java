package basics;

// swap two numbers
public class SwapTwoNumbers {
    public static void main(String[] args) {
        int num1 = 10, num2 = 20;

        System.out.println("before swapping,num1: "+num1+" num2: "+num2);

        // swap
        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("before swapping,num1: "+num1+" num2: "+num2);

    }
}
