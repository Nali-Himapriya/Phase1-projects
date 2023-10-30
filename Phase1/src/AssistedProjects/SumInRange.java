package AssistedProjects;

import java.util.Scanner;

public class SumInRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements (n): ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Invalid value of n. Please enter a positive integer.");
            return;
        }

        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }

        System.out.print("Enter the left bound (L): ");
        int L = input.nextInt();
        System.out.print("Enter the right bound (R): ");
        int R = input.nextInt();

        if (L < 0 || R >= n || L > R) {
            System.out.println("Invalid range [L, R]. Please make sure 0 <= L <= R <= n-1.");
            return;
        }

        int sum = 0;
        for (int i = L; i <= R; i++) {
            sum += array[i];
        }

        System.out.println("Sum of elements in the range [" + L + ", " + R + "] is: " + sum);

        input.close();
    }
}
