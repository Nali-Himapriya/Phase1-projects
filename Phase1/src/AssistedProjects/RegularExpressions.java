package AssistedProjects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegularExpressions {
	
	
	    public static void main(String[] args) {
	        String text = "Hi ! This is Hima priya Nali";
	        String pattern = "Nali";

	        // Create a Pattern object
	        Pattern regexPattern = Pattern.compile(pattern);

	        // Create a Matcher object
	        Matcher matcher = regexPattern.matcher(text);

	        // Find the first occurrence of the pattern in the text
	        if (matcher.find()) {
	            System.out.println("Pattern found at index " + matcher.start());
	        } else {
	            System.out.println("Pattern not found in the text.");
	        }

	        // Using regex to find all occurrences of a pattern
	        pattern = "\\b\\w+\\b"; // Matches words in the text
	        regexPattern = Pattern.compile(pattern);
	        matcher = regexPattern.matcher(text);

	        System.out.println("All words in the text:");
	        while (matcher.find()) {
	            System.out.println(matcher.group());
	        }
	    }
	}



