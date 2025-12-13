import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("yuvaraj");
        System.out.println(sb);
        for(int i=0;i<sb.length()/2;i++){
            int front = i;
            int back = sb.length() - 1 - i;

            char frontChar = sb.charAt(front);
            char BackChar = sb.charAt(back);

            sb.setCharAt(front, BackChar);
            sb.setCharAt(back, frontChar);
        }
    System.out.println(sb);
    }
}
