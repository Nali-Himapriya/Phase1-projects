package AssistedProjects;

public class AccessModifiers {
	   

	    public void publicMethod() {
	        System.out.println("This is public method");
	    }

	    protected void protectedMethod() {
	        System.out.println("This is a protected method");
	    }

	    void defaultMethod() {
	        System.out.println("This is a default method");
	    }

	    private void privateMethod() {
	        System.out.println("This is a private method");
	    }

	    public static void main(String[] args) {
	        AccessModifiers accessmodifierobj = new AccessModifiers();

	       
	        System.out.println("\nAccessing methods:");
	        accessmodifierobj.publicMethod();
	        accessmodifierobj.protectedMethod();
	        accessmodifierobj.defaultMethod();
	        accessmodifierobj.privateMethod();
	    }
	}
