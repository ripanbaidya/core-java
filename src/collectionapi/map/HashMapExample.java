package collectionapi.map;

import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "sachin");
        map.put(2, "rahul");
        map.put(3, "virat");
        map.put(4, "ankit");
        map.put(5, "dhoni");

        System.out.println(map);

        // get all the keys
        Set<Integer> keys = map.keySet();
        System.out.println(keys);

        // get all the values
        Collection<String> values = map.values();
        System.out.println(values);

        // get all the key-value pairs
        Set< Map.Entry<Integer, String>> keyValuePairs = map.entrySet();
        System.out.println(keyValuePairs);

        Iterator it = map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry pair = (Map.Entry)it.next();
            System.out.println(pair.getKey()+" "+pair.getValue());

        }
    }
}
