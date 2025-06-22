package basics;

// sum of all digit, eg: 123 -> 1 + 2 + 3 = 6

public class SumOfDigit {

    static int sumOfDigit(int num){
        int sum = 0;
        while (num != 0) {
            int rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        return sum;
    }

    public static void main(String[] args) {

        int num = 123;

        int result = sumOfDigit(num);
        System.out.println("sum of all digit : "+result);
    }
}
