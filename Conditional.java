import java.util.Scanner;
public class Conditional {
        //////////////////////////////////**** if else elseif ****//////////////////////////////////////////////////
        ///////////////////////////////////****Problem 1****///////////////////////////////////////////////////////

    public static void main(String[] args) {
        // System.out.print("##### Welcome to the Neural PUB #####\nPlease enter your age: ");
        // Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();
        // sc.close();
        // if(age >= 18) {
        //     System.out.println("You are allowed to enter the pub. Enjoy your time!");
        // }
        // else {
        //     System.out.println("Sorry, you must be at least 18 years old to enter the pub.");
        // }
        ///////////////////////////////////****Problem 2****///////////////////////////////////////////////////////
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // if(num % 2 == 0) {
        //     System.out.println("Even!");
        // }
        // else {
        //     System.out.println("Odd!");
        // }
        ///////////////////////////////////****Problem 3****///////////////////////////////////////////////////////
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // if(a>b) {
        //     System.out.println("a is greater");
        // }
        // else if(b>a) {
        //     System.out.println("b is greater");
        // }
        // else {
        //     System.out.println("Both are equal");
        // }
        // sc.close();
        ///////////////////////////////////****Problem 4****///////////////////////////////////////////////////////
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        switch(button) {
            case 1: System.out.println("Hello"); 
                    break;
            case 2: System.out.println("Namaste");
                    break;
            case 3: System.out.println("Bonjour");
                    break;
            default: System.out.println("Invalid Button");
        }
        sc.close();
        }
}
