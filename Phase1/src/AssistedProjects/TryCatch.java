package AssistedProjects;

public class TryCatch {
public static void main(String[] args) {
	        try {
	            int numerator = 10;
	            int denominator = 0;
	            int result = numerator / denominator; // This will throw an ArithmeticException
	            System.out.println("Result: " + result);
	        } 
	        catch (ArithmeticException e) {
	            System.err.println("An arithmetic exception occurred: " + e.getMessage());
	        }
	        
	        System.out.println("Program continues after the exception handling");
	    }
	}



