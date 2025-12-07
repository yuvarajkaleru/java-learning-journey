import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        System.out.println("enter value of a: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        System.out.println("enter value of b: ");
        int b = sc.nextInt();
        int sum = a + b;
        if (a == b) {
            System.out.println("thank you");
        }
        else {
            System.out.println("Good boy");
        }
        System.out.println("The sume of a and b is : " + sum);
    }
}
