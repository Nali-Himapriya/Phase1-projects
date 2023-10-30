package AssistedProjects;

public class RightRotateArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k = 5; 
        k = k % array.length;

        if (k < 0) {
            k += array.length;
        }
        int[] rotatedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int newIndex = (i + k) % array.length;
            rotatedArray[newIndex] = array[i];
        }
        System.out.println("Original Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Right Rotated Array by " + k + " positions:");
        for (int num : rotatedArray) {
            System.out.print(num + " ");
        }
    }
}
