package PracticeProjects;
import java.util.Scanner;

public class EmailValidation {

	    public static void main(String[] args) {
	      
	        String[] emailArray = {
	            "Emp1.eclipse.com",
	            "Emp2.eclipse.com",
	            "Emp3.eclipse.com",
	            "Emp4.eclipse.com",
	            "Emp5.eclipse.com",
	            "Emp6.eclipse.com",
	            "Emp7.eclipse.com",
	            "Emp8.eclipse.com",
	            "Emp9.eclipse.com",
	            "Emp10.eclipse.com",      
	        };

	       
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the email ID to search: ");
	        String searchEmail = scanner.nextLine();

	        
	        boolean found = false;
	        for (String email : emailArray) {
	            if (email.equalsIgnoreCase(searchEmail)) {
	                found = true;
	                break;
	            }
	        }

	        
	        if (found) {
	            System.out.println("Entered Email ID  found in the array.");
	        } else {
	            System.out.println("oops! Entered Email ID  not found in the array.");
	        }

	        scanner.close();
	    }
	}
