package AssistedProjects;
	
	//Encapsulation
	class Student {
	    private String name;
	    private int age;

	    public Student(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    public void displayStudentInfo() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	    }
	}

	//Inheritance
	class CollegeStudent extends Student {
	    private String major;

	    public CollegeStudent(String name, int age, String major) {
	        super(name, age);
	        this.major = major;
	    }

	    public void displayCollegeStudentInfo() {
	        displayStudentInfo();
	        System.out.println("Major: " + major);
	    }
	}

	// Polymorphism
	class Person {
	    public void introduce() {
	        System.out.println("I am a person");
	    }
	}

	class Teacher extends Person {
	    @Override
	    public void introduce() {
	        System.out.println("I am a teacher");
	    }
	}

	class Engineer extends Person {
	    @Override
	    public void introduce() {
	        System.out.println("I am an engineer");
	    }
	}

	//Abstraction
	abstract class Shape {
	    abstract double calculateArea();
	}

	class Circle extends Shape {
	    private double radius;

	    public Circle(double radius) {
	        this.radius = radius;
	    }

	    @Override
	    double calculateArea() {
	        return Math.PI * radius * radius;
	    }
	}
public class OopsPillars {
	    public static void main(String[] args) {
	    	//Class
	    	//Object
	        Student student = new Student("Hima", 20);
	        student.displayStudentInfo();	        
	        CollegeStudent collegeStudent = new CollegeStudent("Priya", 22, "Computer Science");
	        collegeStudent.displayCollegeStudentInfo();	       
	        Person person1 = new Teacher();
	        Person person2 = new Engineer();
	        person1.introduce();
	        person2.introduce();	        
	        Shape circle = new Circle(5.0);
	        System.out.println("Circle Area: " + circle.calculateArea());
	    }
	}



