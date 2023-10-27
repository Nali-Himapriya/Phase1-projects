package AssistedProjects;

interface A {
	    default void doSomething() {
	        System.out.println("This is interface A");
	    }
	}

	class B implements A {	  
		
	}
	class C implements A {
	}
	public class DiamondProblem implements A {
	
	    public static void main(String[] args) {
	        B objB = new B();
	        C objC = new C();
	        
	        objB.doSomething(); 
	        objC.doSomething(); 
	    }
	}



