package basics;

public class ReverseNumber {

    static int reverseNumber(int num){
        int reversedNumber = 0;
        while(num != 0){
            int rem = num % 10;
            reversedNumber = reversedNumber * 10 + rem;
            num = num / 10;
        }
        return reversedNumber;
    }

    public static void main(String[] args) {

        int num = 121;

        System.out.println("original number: "+num);
        int reversedNumber = reverseNumber(num);
        System.out.println("reversed number: "+reversedNumber);

    }
}
