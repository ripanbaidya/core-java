package string;

public class StringBufferExample {
    public static void main(String[] args) {

        StringBuffer sb1 = new StringBuffer("ryan");
        // StringBuffer sb2 = "ryan"; not possible

        StringBuffer sb2 = new StringBuffer("ryan");

        System.out.println("sb1 : "+sb1);
        System.out.println("sb2 : "+sb2);

        System.out.println(sb1 == sb2); // check the reference ,if same then true or else false. here false .

        /* *
         * since, String builder class .equals( ) is not overridden so that it doesn't matter whether the content
         * is same of not , it will check the reference , it same then true or else false .
         */
        System.out.println(sb1.equals(sb2));
    }
}
