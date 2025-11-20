public class Q2_InsertionSortDescending {

    public static void main(String[] args) {

        int[] arr = {10, 3, 15, 7, 8, 23};

        System.out.println("Original Array:");
        printArray(arr);

        // Insertion Sort (Descending Order)
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            // Change comparison to > for descending
            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        System.out.println("\nArray Sorted in Descending Order:");
        printArray(arr);
    }

    // Function to print array
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
