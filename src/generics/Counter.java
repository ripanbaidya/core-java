package generics;

import java.io.Serializable;

/**
 * Previously, we have created two classes IntCounter and DoubleCounter. and they have same properties and methods.
 * Each method takes a specific type of parameter and prints a specific type of value. and If we want to pass any other
 * parameter other than what the class Accepts, then it would not be possible and would result as Compile Time Error.
 *
 * Now, By keeping the properties and methods same If we want to work with any type of parameter.
 * then we should go for Generics. It removes the barrier by which we can work with any type of parameter.
 *
 * Here, I will define a generic class Counter which will work with any type of parameter.
 */

public class Counter <T extends Number & Serializable>{
    T t; // T - type of parameter

    Counter(T t){
        this.t = t;
    }

    public void display(){
        System.out.println("Value is: "+t);
    }
}
