package basics;

import java.util.Arrays;

/*
* Need of loop in programming.
* loop:
* 1. for 
* 2. while
* 3. do while
* 4. for each
* */
public class LoopExample {
    private static void demoForLoop(){
        /**
         *  Demonstration of for loop
         *  Use loop and print your name for 10 times.
         *
         *  for(initialization; condition; incr/decr){
         *      // logic
         *  }
         */
        int n = 10, i;
        for(i = 1; i <= n; i ++){
            System.out.println("Richard"+" "+"Iteration :"+ i);
        }
    }

    private static void demoWhileLoop(){
        /* *
         *  Demonstration of while loop
         *  Use while loop and print your name for 10 times.
         *
         *  while(condition){
         *      // logic
         *  }
         */
        int i = 1; // Initialization

        while(i <= 5){
            System.out.println("Richard"+" "+"Iteration :"+ i);
            i ++; // Increment or Decrement
        }
    }

    private static void demoDoWhileLoop(){
        /**
         *  Demonstration of do while loop
         *  Use do while loop and print your name for 10 times.
         *
         *  do{
         *      // logic
         *  }while(condition);
         */
        int i = 1; // Initialization

        do{
            System.out.println("Richard"+" "+"Iteration :"+ i);
            i ++; // Increment or Decrement
        }while(i <= 5);
    }

    private static void demoForEachLoop(){
        /**
         *  Demonstration of for each loop
         *  Use for-each loop and print your name for 10 times.
         *
         * for (DataType variable : arrayOrCollectionName) {
         *     // Code to execute for each element
         * }
         */
        String[] names = {"Richard", "Alfred", "Roman", "Luke", "Hilton", "Joseph"}; // Initialization

        for(String name : names){
            System.out.println(name); // print name
        }
    }
    public static void printArrayElementsUsingToString(){
        String[] names = {"Richard", "Alfred", "Roman", "Luke", "Hilton", "Joseph"}; // Initialization

        System.out.println(Arrays.toString(names)); // language to language vary
    }
    public static void main(String[] args) {

//        demoForLoop();
//
//        demoWhileLoop();

//        demoDoWhileLoop();

//        demoForEachLoop();

        printArrayElementsUsingToString();
    }
}
