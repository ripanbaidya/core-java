package generics;

import java.util.Arrays;
import java.util.List;

// In this class we will see the use of Generic WildCard in Java
public class GenericWildCardExample {
    // using wildcard
    private static void printList(List<? extends Number> list){
        System.out.println(list);
    }
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
        printList(intList);
    }
}
