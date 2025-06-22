package generics;

/**
 * Similar to IntCounter this class would have one Constructor which will take one parameter and one method.
 */
public class DoubleCounter {
    Double d;

    DoubleCounter(Double d){
        this.d = d;
    }

    public void display(){
        System.out.println("Value is: " +d);
    }
}
