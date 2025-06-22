package string;

public class StringEqualsMethodAndDoubleEquals {
    public static void main(String[] args) {

        String str1 = new String("ryan");
        String str2 = "ryan";

        System.out.println("str1 : " + str1);
        System.out.println("str2 : " + str2);

        System.out.println(str1 == str2); // check the reference ,if same then true or else false. here false .
        System.out.println(str1.equals(str2)); // check the content or data present inside the string object . ture if same or else false . here true

    }
}
