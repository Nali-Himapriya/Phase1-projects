package AssistedProjects;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
public class Maps {
public static void main(String[] args) {
	       
	        Map<String, Integer> hashMap = new HashMap<>();
	        hashMap.put("Apple", 40);
	        hashMap.put("Banana", 20);
	        hashMap.put("Cherry", 25);
	        System.out.println("HashMap:");
	        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }
	        Map<String, Integer> treeMap = new TreeMap<>();
	        treeMap.put("Tomato", 10);
	        treeMap.put("Potato", 25);
	        treeMap.put("Beans", 30);

	        System.out.println("\nTreeMap:");
	        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }
	        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
	        linkedHashMap.put("Rose", 20);
	        linkedHashMap.put("Lilly", 40);
	        linkedHashMap.put("Jasmine", 60);

	        System.out.println("\nLinkedHashMap:");
	        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }
	    }
	}

	
	


