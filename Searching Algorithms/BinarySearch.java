import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();

        int index = binarySearch(arr, key);

        if(index != -1)
        System.out.println("Element found at index: " + index);
        else
        System.out.println("Element not found.");
    }

    static int binarySearch(int[] arr, int key) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2; // To avoid overflow

            if (arr[mid] == key) {
                return mid; // Return the index if the element is found
            } else if (arr[mid] < key) {
                low = mid + 1; // Search in the right half
            } else {
                high = mid - 1; // Search in the left half
            }
        }
        return -1; // Return -1 if the element is not found
    }
}
