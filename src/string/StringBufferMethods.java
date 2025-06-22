package string;

// both StringBuffer and StringBuilder class methods have same methods.

public class StringBufferMethods {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity()); // 16  is the initial capacity .

        sb.append("Welcome Everyone ..");
        System.out.println(sb); // Welcome Everyone

        System.out.println("length of the string is : "+sb.length()); // 19

        sb.delete(0,sb.length()); // it will delete the entire string
        System.out.println("After first deletetion : "+sb); // since , sb is deleted so that nothing will be printed on the console

        sb.append("Spring Boot");
        System.out.println(sb.substring(0,7));  // Spring

        System.out.println(sb); // Spring Boot

        System.out.println("After apply reverse : "+sb.reverse()); // tooB gnirpS
    }
}
