import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperationsMenu {

    // Global array and current size for simplicity at beginner level
    private static int[] arr = new int[10]; // Fixed size array for simplicity
    private static int currentSize = 0; // Tracks the number of elements inserted

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Loop to continuously display the menu until the user chooses to exit
        do {
            displayMenu();
            System.out.print("Enter your choice: ");

            // Input validation for an integer choice
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        insertNumber(scanner);
                        break;
                    case 2:
                        linearSearch(scanner);
                        break;
                    case 3:
                        binarySearch(scanner);
                        break;
                    case 4:
                        System.out.println("Exiting program. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Consume the invalid input
                choice = 0; // Set choice to something other than 4 to continue the loop
            }

            System.out.println("---"); // Separator for better readability

        } while (choice != 4);

        scanner.close(); // Close the scanner when the program exits
    }

    // Method to display the menu options
    private static void displayMenu() {
        System.out.println("\n--- Array Operations Menu ---");
        System.out.println("1. Insert number in array");
        System.out.println("2. Linear Search");
        System.out.println("3. Binary Search");
        System.out.println("4. Exit");
        System.out.println("Current array contents: " + Arrays.toString(Arrays.copyOf(arr, currentSize)));
    }

    // Option 1: Insert a number into the array
    private static void insertNumber(Scanner scanner) {
        if (currentSize < arr.length) {
            System.out.print("Enter the number to insert: ");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                arr[currentSize] = number;
                currentSize++;
                System.out.println(number + " inserted successfully at index " + (currentSize - 1) + ".");
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.nextLine(); // Consume the invalid input
            }
        } else {
            System.out.println("Array is full! Cannot insert more elements.");
        }
    }

    // Option 2: Perform a Linear Search
    private static void linearSearch(Scanner scanner) {
        if (currentSize == 0) {
            System.out.println("Array is empty. Please insert elements first (Option 1).");
            return;
        }

        System.out.print("Enter the element to search for (Linear Search): ");
        if (scanner.hasNextInt()) {
            int target = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            int index = -1;
            // Iterate through the array elements one by one
            for (int i = 0; i < currentSize; i++) {
                if (arr[i] == target) {
                    index = i;
                    break; // Stop searching once the element is found
                }
            }

            if (index != -1) {
                System.out.println("Element " + target + " found at index: " + index + ".");
            } else {
                System.out.println("Element " + target + " not found in the array.");
            }
        } else {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.nextLine(); // Consume the invalid input
        }
    }

    // Option 3: Perform a Binary Search (requires sorting first)
    private static void binarySearch(Scanner scanner) {
        if (currentSize == 0) {
            System.out.println("Array is empty. Please insert elements first (Option 1).");
            return;
        }

        // 1. Ensure the array is sorted
        // We create a temporary array to sort only the inserted elements
        int[] sortedArr = Arrays.copyOf(arr, currentSize);
        Arrays.sort(sortedArr); // Sorts the temporary array         System.out.println("---");
        System.out.println("NOTE: The array was sorted for Binary Search: " + Arrays.toString(sortedArr));
        System.out.println("---");

        System.out.print("Enter the element to search for (Binary Search): ");
        if (scanner.hasNextInt()) {
            int target = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            // Binary Search logic
            int low = 0;
            int high = sortedArr.length - 1;
            int index = -1;

            while (low <= high) {
                int mid = low + (high - low) / 2; // Calculate the middle index

                if (sortedArr[mid] == target) {
                    index = mid; // Element found
                    break;
                } else if (sortedArr[mid] < target) {
                    low = mid + 1; // Target is in the right half
                } else {
                    high = mid - 1; // Target is in the left half
                }
            }

            if (index != -1) {
                System.out.println("Element " + target + " found at index: " + index + " in the *sorted* array.");
            } else {
                System.out.println("Element " + target + " not found in the array.");
            }
        } else {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.nextLine(); // Consume the invalid input
        }
    }
}