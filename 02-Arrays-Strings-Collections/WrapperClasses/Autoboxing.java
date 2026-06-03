package WrapperClasses;

public class Autoboxing {
    public static void main(String[] args) {
        // Auto-boxing: converting primitive types to wrapper objects
        Integer autoBoxedInt = 42; // Auto-boxing
        Double autoBoxedDouble = 3.14; // Auto-boxing
        Character autoBoxedChar = 'A'; // Auto-boxing

        System.out.println("Auto-boxed Integer: " + autoBoxedInt);
        System.out.println("Auto-boxed Double: " + autoBoxedDouble);
        System.out.println("Auto-boxed Character: " + autoBoxedChar);

        // Unboxing: converting wrapper objects back to primitive types
        int unboxedInt = autoBoxedInt; // Unboxing
        double unboxedDouble = autoBoxedDouble; // Unboxing
        char unboxedChar = autoBoxedChar; // Unboxing

        System.out.println("Unboxed Integer: " + unboxedInt);
        System.out.println("Unboxed Double: " + unboxedDouble);
        System.out.println("Unboxed Character: " + unboxedChar);
    }
}
