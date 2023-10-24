package AssistedProjects;

public class InnerClass {
	    private int outerData = 50;
	    public class Inner {
	        public void display() {
	            System.out.println("Inner-class data= "+ outerData);
	        }
	    }

	    public static void main(String[] args) {
	        InnerClass outer = new InnerClass();
	        Inner innerobj = outer.new Inner();
	        innerobj.display();
	    }
	}


