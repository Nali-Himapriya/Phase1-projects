package AssistedProjects;

class CustomException extends Exception {
	    public CustomException(String message) {
	        super(message);
	    }
	}
public class ExceptionExample {
	    public static void main(String[] args) {
	        try {
	            throwException(); // Throws a custom exception
	        } catch (CustomException e) {
	            System.err.println("Custom Exception caught: " + e.getMessage());
	        }

	        try {
	            divide(10, 0); // Throws an ArithmeticException
	        } catch (ArithmeticException e) {
	            System.err.println("Arithmetic Exception caught: " + e.getMessage());
	        }

	        try {
	            readFile("nonexistentfile.txt"); // Throws a custom exception
	        } catch (CustomException e) {
	            System.err.println("Custom Exception caught: " + e.getMessage());
	        } finally {
	            System.out.println("Finally block executed");
	        }
	    }

	    public static void throwException() throws CustomException {
	        throw new CustomException("This is a custom exception.");
	    }

	    public static void divide(int numerator, int denominator) {
	        if (denominator == 0) {
	            throw new ArithmeticException("Cannot divide by zero.");
	        }
	        int result = numerator / denominator;
	        System.out.println("Result of division: " + result);
	    }

	    public static void readFile(String fileName) throws CustomException {
	        if (fileName.equals("nonexistentfile.txt")) {
	            throw new CustomException("File not found.");
	        }
	        // Simulate file reading
	        System.out.println("Reading file: " + fileName);
	    }
	}



