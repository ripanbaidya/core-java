package collectionapi.set;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * insert StringBuffer object into tree set and sort it in increasing order of length
 */

class SortIncreasingLengthWise implements Comparator {
    @Override public int compare(Object o1, Object o2) {

        // type caste the object to String
        String s1 = o1.toString();
        String s2 = o2.toString();

        // find length of string
        int len1 = s1.length();
        int len2 = s2.length();

        // comparison
        if(len1 < len2) return -1;
        else if(len1 > len2) return 1;
        else return s1.compareTo(s2);
    }
}

public class SortingIncreasingLengthWise {
    public static void main(String[] args) {

        TreeSet<StringBuffer> ts = new TreeSet<>(new SortIncreasingLengthWise());

        ts.add(new StringBuffer("java"));
        ts.add(new StringBuffer("python"));
        ts.add(new StringBuffer("golang"));
        ts.add(new StringBuffer("c"));
        ts.add(new StringBuffer("microservice"));
        ts.add(new StringBuffer("php"));
        ts.add(new StringBuffer("kotlin"));

        System.out.println("after sorting increasing length wise: "+ ts);
    }
}
