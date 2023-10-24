package AssistedProjects;

public class StringConversions {
public static void main(String[] args) {
	       
	        String originalString = "Hi! Welcome to Github";
	        StringBuffer stringBuffer = new StringBuffer("Hi");	       	       
	        StringBuilder stringBuilder = new StringBuilder("Welcome to Github");
	        System.out.println("Original String: " + originalString);	        
	        System.out.println("Converted to StringBuffer: " + stringBuffer.toString());
	        System.out.println("Converted to StringBuilder: " + stringBuilder.toString());
	    }
	}



