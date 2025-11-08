import java.util.Scanner;

public class LinearSearch{
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40, 50};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();

        int index = linearSearch(arr, key);

        if(index != -1)
            System.out.println("Element found at index: " + index);
        else
            System.out.println("Element not found.");
    }

    static int linearSearch(int[] arr, int key){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                return i; // Return the index if the element is found
            }
        }
        return -1; // Return -1 if the element is not found
    }
}