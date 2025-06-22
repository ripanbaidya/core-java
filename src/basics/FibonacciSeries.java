package basics;

// print fibonacci series

public class FibonacciSeries {
    public static void main(String[] args) {

        int n = 10;

        int firstNumber = 0;
        int secondNumber = 1;

        System.out.print("Series: "+firstNumber+" "+secondNumber);

        for(int i = 2; i < n; i ++){
            int thirdNumber = firstNumber + secondNumber;
            System.out.print(" "+thirdNumber);
            firstNumber = secondNumber;
            secondNumber = thirdNumber;
        }
    }
}
