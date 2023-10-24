package AssistedProjects;

public class MethodVerification {
	
	    public int add(int a, int b) {
	        return a + b;
	    }
	    public int add(int a, int b, int c) {
	        return a + b + c;
	    }  
	    public void printSum(int a, int b) {
	        int sum = a + b;
	        System.out.println("Sum: " + sum);
	    }

	    public static void main(String[] args) {
	        MethodVerification example = new MethodVerification();

	        int result1 = example.add(5, 7);
	        System.out.println("Result of add(5, 7): " + result1);
	        int result2 = example.add(3, 6, 9);
	        System.out.println("Result of add(3, 6, 9): " + result2);	       
	        example.printSum(10, 20);
	        example.add(4, 8); 
	        int combinedResult = example.add(2, 3) + example.add(4, 5, 6);
	        System.out.println("Combined Result: " + combinedResult);
	    }
	}



