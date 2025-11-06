import java.util.Scanner;

public class ModArrayInsert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6]; // allow up to 5 initial elements + 1 insertion
        int n, value;

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

        if (n >= arr.length) {
            System.out.println("Array is full. Cannot insert at the end.");
        } else {
            System.out.println("Enter value to insert at end:");
            value = sc.nextInt();
            arr[n] = value; // insert at end
            n++;

            System.out.println("Array after insertion:");
            for (int i = 0; i < n; i++) {
                System.out.println(arr[i]);
            }
        }

        sc.close();
    }
}
