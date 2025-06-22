package basics;

// check palindrome. eg, 121 after reverse will be 121, so its palindrome

public class CheckPalindrome {
    static boolean isPalindrome(int n) {
        int temp = n;
        int reversed = 0;

        while(temp != 0) {
            int rem = temp % 10;
            reversed = (reversed * 10) + rem;
            temp = temp / 10;
        }

        return (n == reversed);
    }

    public static void main(String[] args) {

        int num = 121;

        if(isPalindrome(num))
            System.out.println("palindrome");
        else
            System.out.println("not palindrome");
    }
}
