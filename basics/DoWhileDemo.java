import java.util.Scanner;

public class DoWhileDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            System.out.println("You entered: " + num);

            System.out.print("Do you want to continue? (y/n): ");
            choice = scanner.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');
        
        scanner.close();
    }
}
