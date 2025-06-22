package basics;

public class TypeCasting {
    public static void main(String[] args) {

        // implicit
        int n1 = 10;

        long l1 = n1; // we can directly type caste integer to long
        double d1 = n1; // and even double, since they have more capacity than int


        // explicit
        long l2 = 10;

        // int n2 = l2; // not possible bcz, int has less capacity than long
        int n2 = (int) l2;


        double d2 = 10.0;

        float f1 = (float) d2;


    }
}
