package basics;

// count digit, eg: 123 -> 3

public class CountDigit {

    static int countDigit(int num) {

        int count = 0;
        while(num != 0) {
            num = num / 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {

        int num = 123;

        int count = countDigit(num);
        System.out.println(count);
    }
}
