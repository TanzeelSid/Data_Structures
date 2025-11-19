import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperationsMenu {


    
    private static int[] arr = new int[10];
    private static int currentSize = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            displayMenu();
            System.out.print("Enter your choice: ");

            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine();

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
                scanner.nextLine();
                choice = 0;
            }

            System.out.println("---");

        } while (choice != 4);

        scanner.close();
    }
    private static void displayMenu() {
        System.out.println("\n--- Array Operations Menu ---");
        System.out.println("1. Insert number in array");
        System.out.println("2. Linear Search");
        System.out.println("3. Binary Search");
        System.out.println("4. Exit");
        System.out.println("Current array contents: " + Arrays.toString(Arrays.copyOf(arr, currentSize)));
    }

    private static void insertNumber(Scanner scanner) {
        if (currentSize < arr.length) {
            System.out.print("Enter the number to insert: ");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                scanner.nextLine();
                arr[currentSize] = number;
                currentSize++;
                System.out.println(number + " inserted successfully at index " + (currentSize - 1) + ".");
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.nextLine();
            }
        } else {
            System.out.println("Array is full! Cannot insert more elements.");
        }
    }

    private static void linearSearch(Scanner scanner) {
        if (currentSize == 0) {
            System.out.println("Array is empty. Please insert elements first (Option 1).");
            return;
        }

        System.out.print("Enter the element to search for (Linear Search): ");
        if (scanner.hasNextInt()) {
            int target = scanner.nextInt();
            scanner.nextLine();

            int index = -1;
            for (int i = 0; i < currentSize; i++) {
                if (arr[i] == target) {
                    index = i;
                    break;
                }
            }

            if (index != -1) {
                System.out.println("Element " + target + " found at index: " + index + ".");
            } else {
                System.out.println("Element " + target + " not found in the array.");
            }
        } else {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.nextLine();
        }
    }

    private static void binarySearch(Scanner scanner) {
        if (currentSize == 0) {
            System.out.println("Array is empty. Please insert elements first (Option 1).");
            return;
        }

        int[] sortedArr = Arrays.copyOf(arr, currentSize);
        Arrays.sort(sortedArr);
        System.out.println("NOTE: The array was sorted for Binary Search: " + Arrays.toString(sortedArr));
        System.out.println("---");

        System.out.print("Enter the element to search for (Binary Search): ");
        if (scanner.hasNextInt()) {
            int target = scanner.nextInt();
            scanner.nextLine();

            int low = 0;
            int high = sortedArr.length - 1;
            int index = -1;

            while (low <= high) {
                int mid = low + (high - low) / 2;

                if (sortedArr[mid] == target) {
                    index = mid;
                    break;
                } else if (sortedArr[mid] < target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }

            if (index != -1) {
                System.out.println("Element " + target + " found at index: " + index + " in the *sorted* array.");
            } else {
                System.out.println("Element " + target + " not found in the array.");
            }
        } else {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.nextLine();
        }
    }
}