package AssistedProjects;

import java.util.Arrays;

public class FourthSmallestElement {
    public static void main(String[] args) {
        int[] unsortedList = {12, 5, 7, 1, 15, 9, 10, 6};
        int k = 4; 
        if (k <= 0 || k > unsortedList.length) {
            System.out.println("Invalid value of k. Please choose a value between 1 and the list length.");
            return;
        }
        Arrays.sort(unsortedList);
        int fourthSmallest = unsortedList[k - 1];

        System.out.println("The fourth smallest element is: " + fourthSmallest);
    }
}
