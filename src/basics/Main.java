package basics;

public class Main {
    public static boolean isEqual(String s1, String s2){
        int diff = 0;
        for(char ch : s1.toCharArray()){
            if(!s2.contains(String.valueOf(ch))) diff++;
        }
        return  diff == 0;
    }
    public static void main(String[] args) {
        System.out.println(isEqual("bank", "kanb"));
    }
}
