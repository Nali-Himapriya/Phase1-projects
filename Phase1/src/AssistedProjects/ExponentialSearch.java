package AssistedProjects;

import java.util.Arrays;
import java.util.Scanner;

public class ExponentialSearch {

    public static int binarySearch(int[] arr, int target, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Return the index of the target element if found
            }

            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // Return -1 if the target element is not found in the array
    }

    public static int exponentialSearch(int[] arr, int target) {
        int n = arr.length;

        if (arr[0] == target) {
            return 0; // If the first element is the target, return its index
        }

        int i = 1;
        while (i < n && arr[i] <= target) {
            i *= 2; // Double the position to search a larger range
        }

        // Perform binary search within the identified range
        return binarySearch(arr, target, i / 2, Math.min(i, n - 1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the sorted array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the sorted elements of the array:");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the element to search for: ");
        int target = scanner.nextInt();

        int result = exponentialSearch(arr, target);

        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
