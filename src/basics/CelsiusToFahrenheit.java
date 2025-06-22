package basics;

// convert Celsius to Fahrenheit and vice versa.

public class CelsiusToFahrenheit {
    public static void main(String[] args) {

        double celsius = 45.0;

        // °F = °C × (9/5) + 32
        double fahrenheit = celsius * (9/5) + 32;

        System.out.println("temperature in fahrenheit: "+fahrenheit);

        // °C = (°F - 32) × 5/9 -> do it by yourself
    }
}
