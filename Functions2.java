import java.util.Scanner;

public class Functions2 {
    public static int calculateSum(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int solution = calculateSum(a,b);
        System.out.println("The sum is: " + solution);
    }
}
