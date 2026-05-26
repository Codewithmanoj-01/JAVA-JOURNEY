package Operators;

public class UnaryOperators {
    public static void main(String[] args) {
        
        int a = 5;

        System.out.println("=== Unary Operators ===");

        // Increment operator (++)
        System.out.println("a: " + a); // Output: 5
        System.out.println("a++: " + a++); // Output: 5 (post-increment)
        System.out.println("a: " + a); // Output: 6

        // Decrement operator (--)
        System.out.println("a--: " + a--); // Output: 6 (post-decrement)
        System.out.println("a: " + a); // Output: 5

        // Increment operator (prefix)
        System.out.println("++a: " + ++a); // Output: 6 (pre-increment)
        System.out.println("a: " + a); // Output: 6

        // Decrement operator (prefix)
        System.out.println("--a: " + --a); // Output: 5 (pre-decrement)
        System.out.println("a: " + a); // Output: 5

        // Logical NOT operator (!)
        boolean isTrue = true;
        System.out.println("isTrue: " + isTrue); // Output: true
        System.out.println("!isTrue: " + !isTrue); // Output: false
    }
    
}
