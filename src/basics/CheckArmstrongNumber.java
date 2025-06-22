package basics;

// check whether a number is armstrong number or not, eg: 153 is armstrong number. 153 = 1*1*1 + 5*5*5 + 3*3*3

public class CheckArmstrongNumber {

    private static int count(int num){
        int cnt = 0;

        while (num != 0){
            cnt ++ ;
            num /= 10;
        }
        return cnt;
    }

    private static boolean isArmstrong(int num){
        int temp = num ;
        int cnt = count(num);
        int res = 0, rem = 0;

        while(num != 0){
            rem = num % 10;
            res = res + (int)Math.pow(rem, cnt);
            num /= 10;
        }
        return (temp == res);
    }

    public static void main(String[] args) {

        int num = 134 ;

        if(isArmstrong(num))
            System.out.println("Armstrong number ");
        else
            System.out.println("Not a Armstrong number ");
    }
}
