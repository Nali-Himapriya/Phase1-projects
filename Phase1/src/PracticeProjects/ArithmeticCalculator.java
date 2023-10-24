package PracticeProjects;
import java.util.Scanner;
public class ArithmeticCalculator {

	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Hello ! Welcome to the Arithmetic Calculator--->");
	        System.out.print("Enter the first number to calculate: ");
	        double num1 = scanner.nextDouble();

	        System.out.print("Enter the second number to calculate: ");
	        double num2 = scanner.nextDouble();

	        System.out.println("Select an operation:");
	        System.out.println("1. Addition (+)");
	        System.out.println("2. Subtraction (-)");
	        System.out.println("3. Multiplication (*)");
	        System.out.println("4. Division (/)");
	        

	        System.out.print("Enter your choice (1/2/3/4): ");
	        int choice = scanner.nextInt();

	        double result = 0.0;
	        String operator = "";
	       
	        switch (choice) {
	            case 1:
	                result = num1 + num2;
	                operator = "+";
	              break;
	               
	            case 2:
	                result = num1 - num2;
	                operator = "-";
	                break;
		               
	            case 3:
	                result = num1 * num2;
	                operator = "*";
	                break;
	            case 5:
	                
	                break;
		               
	            case 4:
	                if (num2 == 0) {
	                    System.out.println("oh no! Cannot divide by zero. Try again");
	                    return;
	                }
	                result = num1 / num2;
	                operator = "/";
	                break;
	            default:
	                System.out.println("oops! Invalid choice, Please select a valid operation.");
	                return;
	        }
	        
	 
	        System.out.println("Result: " + num1 + " " + operator + " " + num2 + " = " + result);

	     
	        scanner.close();
	       
	    }
	}


