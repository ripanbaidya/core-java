package collectionapi.set;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * insert elements into tree set and perform sorting in reverse of alphabetical order. eg: z-a / Z - A
 * Comparator(I) -> for customized sorting
 * Comparable(I) -> default natural sorting.
 *
 */

class MyComparator implements Comparator {

    @Override public int compare(Object o1, Object o2) {
        String s1 = o1.toString();
        String s2 = o2.toString();

        return s2.compareTo(s1); // descending order
    }
}
public class ComparatorQ1 {
    public static void main(String[] args) {

        TreeSet<String> name = new TreeSet<>();

        name.add("sachin");
        name.add("rahul");
        name.add("virat");
        name.add("ankit");
        name.add("dhoni");

        // default natural sorting
        // by default it will sort in alphabetical order
        System.out.println("elements: "+ name);


        TreeSet<String> name2 = new TreeSet<>(new MyComparator());
        name2.add("sachin");
        name2.add("rahul");
        name2.add("virat");
        name2.add("ankit");
        name2.add("dhoni");

        System.out.println("elements: "+name2);
    }
}
