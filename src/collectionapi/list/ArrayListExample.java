package collectionapi.list;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>(); // creating an ArrayList

        // Adding elements
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);

        // Displaying the elements
        System.out.println("ArrayList elements: " + arrayList);

        // Adding an element at a specific index
        arrayList.add(1, 15);
        System.out.println("After adding 15 at index 1: " + arrayList);

        // Getting the element at a specific index
        int elementAtIndex2 = arrayList.get(2);
        System.out.println("Element at index 2: " + elementAtIndex2);

        // Removing an element at a specific index
        arrayList.remove(0);
        System.out.println("After removing element at index 0: " + arrayList);

        // Checking if an element exists
        boolean containsElement30 = arrayList.contains(30);
        System.out.println("Does the list contain 30? " + containsElement30);

        // Getting the size of the ArrayList
        int sizeOfArrayList = arrayList.size();
        System.out.println("Size of ArrayList: " + sizeOfArrayList);

        // Clearing the ArrayList
        arrayList.clear();
        System.out.println("After clearing the ArrayList: " + arrayList);

        // Checking if the ArrayList is empty
        boolean isEmptyArrayList = arrayList.isEmpty();
        System.out.println("Is ArrayList empty? " + isEmptyArrayList);

        // removeAll() example
        ArrayList<String> students = new ArrayList<>();
        students.add("ripan");
        students.add("rahul");
        students.add("raghav");
        students.add("ankit");

        ArrayList<String> selectedStudents = new ArrayList<>();
        selectedStudents.add("ripan");
        selectedStudents.add("raghav");

        // Remove all students from the selectedStudents list from the students list
        students.removeAll(selectedStudents);

        System.out.println(students);

    }
}
