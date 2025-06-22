package basics;

// check year is leap year or not.

public class CheckLeapYear {
    public static void main(String[] args) {

        int year = 2100; // this value is hardCoded
        // year - 2100
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            System.out.println("leap year");
        else
            System.out.println("not leap year");

    }
}
