package basics;

// print the day based on the no. like -> 1 for monday, 2 for tuesday and so on.

public class DayFinder {
    public static void main(String[] args) {

        int dayNo = 10; // 1, 2, 3, 4, 5, 6, 7

        /*
        * if(dayNo == 1){
        *    System.out.println("monday");
        *    // business logic
        * } else if(dayNo == 2){
        *    System.out.println("tuesday");
        * } else if(dayNo == 3){
        *    System.out.println("wednesday");
        * } else if(dayNo == 4){
        *    System.out.println("thursday");
        * } else if(dayNo == 5){
        *    System.out.println("friday");
        * } else if(dayNo == 6){
        *    System.out.println("saturday");
        * } else if(dayNo == 7){
        *    System.out.println("sunday");
        * } else {
        *    System.out.println("please select correct day no.");
        * }
        * 1000 lines
        * */
        switch (dayNo){ // 5
            case 1:
                // business logic
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("please select correct day no.");
                break; // optional
        }
    }
}
