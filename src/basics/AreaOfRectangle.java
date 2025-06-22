package basics;

// find area and perimeter of a rectangle

public class AreaOfRectangle {
    public static void main(String[] args) {

        double length = 10.7, width = 12.50;

        double area = (length * width);
        double perimeter = 2 * (length + width);

        System.out.println("area: "+area);
        System.out.println("perimeter: "+perimeter);
    }
}
