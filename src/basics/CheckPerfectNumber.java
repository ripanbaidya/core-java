package basics;

// if the addition of all the divisor of a number is equal to that number. then its perfect number.
// eg: 6 is a perfect number. 1 + 2 + 3 = 6

public class CheckPerfectNumber {

    private static boolean isPerfectNumber(int num) {
        int sum = 0;

        for(int i = 1; i <= num/2; i ++){
            if(num % i == 0)
                sum += i;
        }

        return sum == num;
    }

    public static void main(String[] args) {

         int num = 6;

         if(isPerfectNumber(num))
             System.out.println("perfect number");
         else
             System.out.println("not perfect number");
    }
}
