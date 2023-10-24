package AssistedProjects;

public class ArrayImplementation {
public static void main(String[] args) {
	        int[] numbers = new int[5];
	        numbers[0] = 10;
	        numbers[1] = 20;
	        numbers[2] = 30;
	        numbers[3] = 40;
	        numbers[4] = 50;
	        System.out.println("Array List of Elements:(Numbers)");
	        for (int i = 0; i < numbers.length; i++) {
	            System.out.println("Element at index " + i + ": " + numbers[i]);
	        }
	        String[] names = {"Apple", "Banana", "Cherry", "Dog", "Elephant"};
	        System.out.println("\nArray List of Elements:(String)");
	        for (int i = 0; i < names.length; i++) {
	            System.out.println("Element at index " + i + ": " + names[i]);
	        }
	    }
	}



