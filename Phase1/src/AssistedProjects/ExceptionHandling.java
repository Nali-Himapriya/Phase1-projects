package AssistedProjects;

public class ExceptionHandling {
public static void main(String[] args) {
	        try {
	            String invalidNumber = "abc";
	            int parsedNumber = Integer.parseInt(invalidNumber);
	            System.out.println("Parsed Number: " + parsedNumber); 
	        } catch (NumberFormatException e) {
	            System.err.println("Number Format Exception: " + e.getMessage());
	        } catch (Exception e) {
	            System.err.println("General Exception: " + e.getMessage());
	        } finally {
	            System.out.println("Finally block executed.");
	        }

	        System.out.println("Program continues after the exception handling");
	    }
	}


