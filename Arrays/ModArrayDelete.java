import java.util.Scanner;

public class ModArrayDelete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5]; // max 5 elements
        int n;

        System.out.println("Enter number of elements (max 5):");
        n = sc.nextInt();

        if (n < 0 || n > 5) {
            System.out.println("Invalid number of elements. Must be between 0 and 5.");
            sc.close();
            return;
        }

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter value to delete (all occurrences):");
        int value = sc.nextInt();

        // Remove all occurrences by compacting the array
        int j = 0; // new length index
        for (int i = 0; i < n; i++) {
            if (arr[i] != value) {
                arr[j] = arr[i];
                j++;
            }
        }

        int removed = n - j;
        n = j; // updated size after deletion

        if (removed == 0) {
            System.out.println("Value not found. No elements deleted.");
        } else {
            System.out.println(removed + " occurrence(s) deleted.");
        }

        System.out.println("Array after deletion:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        sc.close();
    }
}
