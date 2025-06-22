package string;

public class ImportantStringBufferMethods {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("before setLength(): "+sb); // Hello

        sb.setLength(3); // truncates to "Hel"
        System.out.println("after setLength(): "+sb); // Hel

        StringBuffer sb1 =new StringBuffer(100000);
        System.out.println(sb1.capacity()); // 100000

        sb1.append("jordanpeterson");

        System.out.println(sb1.capacity()); // 100000

        sb1.trimToSize(); // it will reduce the capacity and size to the current length
        System.out.println(sb1.capacity()); // 14

        StringBuffer sb2 = new StringBuffer();
        System.out.println(sb2.capacity()); // 16 is the initial capacity

        sb2.ensureCapacity(10000);
        System.out.println(sb2.capacity()); // 10000
    }
}
