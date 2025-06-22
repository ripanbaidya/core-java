package basics;

// program to calculate simple interest.

public class SimpleInterestCalculation {
    public static void main(String[] args) {

        int principle = 1000, rateOfInterest = 2, time = 2;

        int simpleInterest = (principle * rateOfInterest * time) / 100;

        System.out.println("Simple interest: "+simpleInterest);
    }
}
