import java.util.Scanner;
public class Forloop {
    public static void main(String[] args) {
        // for(int i = 1; i <= 10 ;i = i+1) {
        //     System.out.print(i + " ");
        // }
        // int i=0;
        // while (i<11) {
        //     System.out.print(i + " ");
        //     i = i + 1;
        // }
        // do {
        //     System.out.print(i + " ");
        //     i = i + 1;
        // } while (i<11);
        
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        for(int i=1;i<=10;i++) {
            System.out.println(input + " X " + i + " = " + (input*i));
        }
        sc.close();
        }
}
