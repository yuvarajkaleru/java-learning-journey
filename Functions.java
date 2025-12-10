import java.util.Scanner;
public class Functions {
    public static void printMyName(String name){
        System.out.println("My name is " + name);
        Scanner sc = new Scanner (System.in);
        sc.close();
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String name = sc.next();
        sc.close();
        printMyName(name);
    }
}
