import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Create an array
        int[] arr = {40, 10, 50, 20, 30};
        System.out.println("Original Array: " + Arrays.toString(arr));

        // 2. Length of array
        System.out.println("Length of array: " + arr.length);

        // 3. Traversal (for loop)
        System.out.print("Traversal using for loop: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // 4. Traversal (for-each loop)
        System.out.print("Traversal using for-each: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 5. Searching
        int target = 20;
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Element " + target + " found at index: " + i);
                found = true;
                break;
            }
        }
        if (!found) System.out.println("Element " + target + " not found");

        // 6. Sorting
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        // 7. Binary Search (only works on sorted arrays)
        int index = Arrays.binarySearch(arr, 30);
        System.out.println("Binary Search for 30: " + (index >= 0 ? "Found at index " + index : "Not found"));

        // 8. Copy Array
        int[] copyArr = Arrays.copyOf(arr, arr.length);
        System.out.println("Copied Array: " + Arrays.toString(copyArr));

        // 9. Fill Array with a value
        int[] fillArr = new int[5];
        Arrays.fill(fillArr, 7);
        System.out.println("Filled Array: " + Arrays.toString(fillArr));

        // 10. Reverse Array (manual operation)
        System.out.print("Reversed Array: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // 11. Max & Min
        int max = arr[0], min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }
       
        System.out.println("Maximum = " + max + ", Minimum = " + min);
       sc.close();
    }
}
