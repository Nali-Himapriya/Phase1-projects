package AssistedProjects;

public class TypeCasting {
    public static void main(String[] args) {
        // Implicit Type Casting 
        int integerNumber = 5;
        double doubleNumber = integerNumber;
        System.out.println("Implicit Type Casting:");
        System.out.println("int to double: " + doubleNumber);
        
        // Explicit Type Casting
        double anotherDoubleNumber = 5.75;
        int anotherIntegerNumber = (int) anotherDoubleNumber;
        System.out.println("\nExplicit Type Casting:");
        System.out.println("double to int: " + anotherIntegerNumber);
    }
}
