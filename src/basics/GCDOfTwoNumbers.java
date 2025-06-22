package basics;

public class GCDOfTwoNumbers {
    public static void main(String[] args) {

        int num1 = 36;
        int num2 = 60;

        int gcd = findGCD(num1, num2);

        System.out.println(gcd);
    }

    private static int findGCD(int num1, int num2) {

        int largest = Math.max(num1, num2);
        int secDiv = 0, div = 0;

        for(int i = 1 ; i <= largest/2 ; i ++){
            if(num1 % i == 0 && num2 % i == 0){
                secDiv = div;
                div = i;
            }
        }
        return div;
    }
}
