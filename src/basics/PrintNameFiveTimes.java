package basics;

// print your name five times

public class PrintNameFiveTimes {
    public static void main(String[] args) {

        // using for.
        int n = 5;
        for(int i = 1 ; i <= n ; i ++){
            System.out.println("Ripan Baidya");
        }

        // using while loop
        int i = 1;
        n = 5;
        while(i <= n){
            System.out.println("Ripan Baidya");
            i ++;
        }

        // using do while
        i = 1;
        n = 5;
        do{
            System.out.println("Ripan Baidya");
            i ++;
        }while (i <= n);
    }
}
