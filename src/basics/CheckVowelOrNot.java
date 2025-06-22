package basics;

// check whether a character is vowel or not.
// a - z A - Z
// a e i o u - A E I O U
public class CheckVowelOrNot {

    public static boolean isVowel(char ch){
        if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'|| ch == 'u' || ch == 'U')
            return true;
        else
            return false; // not vowel
    }

    public static void main(String[] args) {
        char ch = 'a';

        boolean result = isVowel(ch) ? true : false; // tranary operator

        System.out.println(result);
    }
}
