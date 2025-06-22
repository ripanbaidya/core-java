package string;

public class StringIsEmptyIsBlankMethod {
    public static void main(String[] args) {

        String s3 = "";
        System.out.println(s3.isEmpty()); // true
        System.out.println(s3.isBlank()); // true

        String s4 = " ";
        System.out.println(s3.isEmpty()); // false
        System.out.println(s3.isBlank()); // true

    }
}
