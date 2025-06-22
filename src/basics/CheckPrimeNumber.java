package basics;

// check prime number or not

public class CheckPrimeNumber {
    static boolean isPrime(int n) {
        if(n <= 1)
            return false;
        for(int i = 2; i <= Math.sqrt(n); i ++){
            if(n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        int num = 12;

        if(isPrime(num))
            System.out.println("prime");
        else
            System.out.println("not prime");
    }
}
