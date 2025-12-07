import java.util.Scanner;
public class Main {
      public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);
        Integer Name = input.nextInt();
        System.out.println("Hello " + Name);
        input.close();
}
}