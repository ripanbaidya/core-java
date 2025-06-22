package basics;
// sum of first n natural numbers.

public class SumOfN {
    static int sumOfN(int n){
        int sum = 0;
        for(int i = 1; i <= n; i ++){
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {

        int n = 5;

        int result = sumOfN(n);
        System.out.println("sum is: "+result);
    }
}
