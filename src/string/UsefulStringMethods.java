package string;

public class UsefulStringMethods {
    public static void main(String[] args) {
        String s = "ripan";

        System.out.println("length is : "+s.length()); // 5
        System.out.println(s.charAt(2)); // p
        System.out.println(s.concat(" baidya")); // ripan baidya

        System.out.println("upper case : "+s.toUpperCase()); // RIPAN
        System.out.println("lower case : "+s.toLowerCase()); // ripan

        System.out.println(s.equals("ripan")); // true
        System.out.println(s.equals("RIPAN")); // false
        System.out.println(s.equalsIgnoreCase("RIPAN")); // true

        System.out.println("substring: Starting index: "+s.substring(1)); // ipan
        System.out.println("substring starting and ending index: "+s.substring(1,4)); // 1 --> end -1 (3)   :: ipa

        System.out.println("replace: "+s.replace('a','o')); // replace(old,new) :: ripon

        System.out.println("toString :" +s.toString());

        System.out.println("indexOf : "+s.indexOf('n')); // 4
        System.out.println("lastIndexOf :"+s.lastIndexOf('i')); // 1

        String s2 = " ryan    ";
        System.out.println("trim : "+s2.trim()); // remove leading and trailing whitespace  :: ryan

        System.out.println("contains : "+s.contains("ripon")); // false , wrong is 'o'

        System.out.println("starts with :"+s.startsWith("ri")); // true
        System.out.println("ends with : "+s.endsWith("on")); // false
        System.out.println("ends with :"+s.endsWith("an")); // true

    }
}

