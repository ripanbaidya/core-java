package enums;

enum Color{
    BLUE,
    GREEN,
    RED;

    void info() {
        System.out.println("universal color");
    }
}
public class EnumExample {
    public static void main(String[] args) {
        Color[] colors = Color.values();

        for (Color color : colors) {
            System.out.print(color + " "); // BLUE GREEN RED
        }

        System.out.println();

        for (Color color : colors) {
            color.info(); // universal color - 3 times
        }
    }
}
