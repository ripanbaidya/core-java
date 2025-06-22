package string;

public class StringCompareToMethod {
    public static void main(String[] args) {

        String str1 = "apple";
        String str2 = "banana";
        String str3 = "apple";

        int result1 = str1.compareTo(str2);
        int result2 = str1.compareTo(str3);

        System.out.println("Result1: " + result1); // -1
        System.out.println("Result2: " + result2); // 0

    }
}
