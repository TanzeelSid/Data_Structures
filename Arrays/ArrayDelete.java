import java.util.Scanner;

public class ArrayDelete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int n, pos;

        System.out.println("Enter number of elements (max 5):");
        n = sc.nextInt();

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter position to delete (0 to " + (n - 1) + "): ");
        pos = sc.nextInt();

        for (int i = pos; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        n--;

        System.out.println("Array after deletion:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
