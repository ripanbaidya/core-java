package generics;

/**
 * This class would have one Constructor which will take one parameter and one method.
 */
public class IntCounter {
    Integer i;

    IntCounter(Integer i) {
        this.i = i;
    }

    public void display(){
        System.out.println("Value is: " +i);
    }
}
