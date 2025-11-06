import java.util.*;

public class InputOutput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an name: ");
        String name = scanner.nextLine();

        System.out.print("Enter two numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        System.out.println("Hello, " + name + "! The sum of " + num1 + " and " + num2 + " is " + sum + ".");

        scanner.close();
    }
    
}
