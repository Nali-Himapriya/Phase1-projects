package AssistedProjects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Collections {
public static void main(String[] args) {
	        
	        ArrayList<String> arrayList = new ArrayList<>(); 
	        arrayList.add("abcd");
	        arrayList.add("efgh");
	        arrayList.add("ijkl");
	        arrayList.add("mnop");
	        System.out.println("ArrayList:");
	        for (String fruit : arrayList) {
	            System.out.println(fruit);
	        }
	       
	        HashSet<Integer> hashSet = new HashSet<>();
	        hashSet.add(10);
	        hashSet.add(20);
	        hashSet.add(30);
	        hashSet.add(40);

	        System.out.println("\nHashSet:");
	        for (int number : hashSet) {
	            System.out.println(number);
	        }
	        Iterator<Integer> iterator = hashSet.iterator();
	        System.out.println("\nHashSet --> Iteration:");
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	    }
	}



