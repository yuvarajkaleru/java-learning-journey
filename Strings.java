import java.util.*;
public class Strings {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Yuvaraj");
        System.out.println(sb);
        System.out.println(sb.charAt(4));
        String frn = "kaleru";
        String fun = frn + sb ;//concatenation
        System.out.println(fun);
        System.out.println(sb.length());
        if(frn.compareTo(fun)==0){
            System.out.println("They are equal");
        } else {
            System.out.println("Not equal");
        }
        String name = fun.substring(6, 13);
        System.out.println(name);
        sb.setCharAt(0, 'K');
        System.out.println(sb);
        sb.insert(1,'Y');
        System.out.println(sb);
    }
}
