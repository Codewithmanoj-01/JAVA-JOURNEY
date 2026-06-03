package WrapperClasses;

public class CharacterWrapper {
    public static void main(String[] args) {
        // Creating a Character wrapper object
        Character char1 = Character.valueOf('A');
        Character char2 = Character.valueOf('B');

        // Using wrapper class methods
        System.out.println("Character 1: " + char1.charValue());
        System.out.println("Character 2: " + char2.charValue());

        // Auto-boxing and unboxing
        Character autoBoxedChar = 'C'; // Auto-boxing
        char unboxedChar = autoBoxedChar; // Unboxing
        System.out.println("Auto-boxed Character: " + autoBoxedChar);
        System.out.println("Unboxed Character: " + unboxedChar);
    }
}
