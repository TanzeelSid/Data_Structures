public class Q1_BubbleSortSwapCounter {

    public static void main(String[] args) {

        int[] arr = {5, 2, 9, 1, 5, 6};

        int comparisons = 0;
        int swaps = 0;

        System.out.println("Original Array:");
        printArray(arr);

        // Bubble Sort with comparison & swap counting
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {

                comparisons++; // Count comparison

                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swaps++; // Count swap
                }
            }
        }

        System.out.println("\nSorted Array:");
        printArray(arr);

        System.out.println("\nTotal Comparisons: " + comparisons);
        System.out.println("Total Swaps: " + swaps);
    }

    // Function to print array
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
