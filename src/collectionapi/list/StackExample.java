package collectionapi.list;

// Stack: LIFO - Last In First Out

import java.util.Enumeration;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        System.out.println("is it empty : "+stack.empty());

        stack.push(10);
        stack.push(20);
        stack.push(30);

        Enumeration element = stack.elements();
        while(element.hasMoreElements()){
            Integer value = (Integer) element.nextElement();
            System.out.print(value+" ");
        }

        System.out.println("\n is it empty :"+stack.empty());

        System.out.println("search element from stack "+stack.search(50)); // -1
        System.out.println("search elemebt from stack "+stack.search(10)); // 3 offset value ..

        // pop element/ remove element
        System.out.println("poped element : "+stack.pop());
    }
}
