package WrapperClasses;

public class Unboxing {
    public static void main(String[] args) {
        // Unboxing: converting wrapper objects back to primitive types
        Integer autoBoxedInt = 42; // Auto-boxing
        Double autoBoxedDouble = 3.14; // Auto-boxing
        Character autoBoxedChar = 'A'; // Auto-boxing

        int unboxedInt = autoBoxedInt; // Unboxing
        double unboxedDouble = autoBoxedDouble; // Unboxing
        char unboxedChar = autoBoxedChar; // Unboxing

        System.out.println("Unboxed Integer: " + unboxedInt);
        System.out.println("Unboxed Double: " + unboxedDouble);
        System.out.println("Unboxed Character: " + unboxedChar);
    }
}
