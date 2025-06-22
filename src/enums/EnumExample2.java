package enums;

enum Color2 {
    BLUE,
    RED {
        public void info(){
            System.out.println("Dangerous Colour");
        }

    }, GREEN;

    public void info(){
        System.out.println("Universal Colour");
    }
}
public class EnumExample2 {
    public static void main(String[] args) {
        Color2[] colours = Color2.values();

        for (Color2 color:colours ) {
            color.info();
        }
    }
}

