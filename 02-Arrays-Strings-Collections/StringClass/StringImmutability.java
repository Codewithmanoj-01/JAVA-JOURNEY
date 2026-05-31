package StringClass;

public class StringImmutability {

    public static void main(String[] args) {

        String message = "Hello";

        System.out.println("Before Change: " + message);

        message = message.concat(" Java");

        System.out.println("After Change: " + message);

        System.out.println("\nStrings are immutable in Java.");
    }
}

// notes : strings in Java are immutable, meaning that once a String object is created, it cannot be changed. When you perform an operation that seems to modify a string, such as concatenation, it actually creates a new String object with the modified content, while the original string remains unchanged.