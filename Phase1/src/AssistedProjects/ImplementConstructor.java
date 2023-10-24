package AssistedProjects;

public class ImplementConstructor {
	
	    private int value;
	    private String message;

	    public ImplementConstructor() {
	        this.value = 0;
	        this.message = "No message";
	    }
	    public ImplementConstructor(int value, String message) {
	        this.value = value;
	        this.message = message;
	    }
	    public ImplementConstructor(int value) {
	        this(value, "Default message");
	    }
	    public ImplementConstructor(String message) {
	        this(0, message);
	    }

	    public void displayInfo() {
	        System.out.println( value);
	        System.out.println( message);
	    }

	    public static void main(String[] args) {
	    	ImplementConstructor obj1 = new ImplementConstructor();
	    	ImplementConstructor obj2 = new ImplementConstructor(42, "Hello, World!");
	    	ImplementConstructor obj3 = new ImplementConstructor(10);
	    	ImplementConstructor obj4 = new ImplementConstructor("Custom Message");

	        System.out.println("Obj 1:");
	        obj1.displayInfo();

	        System.out.println("\nObj 2:");
	        obj2.displayInfo();

	        System.out.println("\nObj 3:");
	        obj3.displayInfo();

	        System.out.println("\nObj 4:");
	        obj4.displayInfo();
	    }
	}


