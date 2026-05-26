package DataTypes;

public class TypeCasting {

    public static void main(String[] args) {
 
        // Implicit Casting (Widening) - This happens automatically when converting a smaller type to a larger type.
        int number = 100;
        double convertedNumber = number;

        System.out.println("=== Implicit Casting ===");
        System.out.println("Original int value: " + number);
        System.out.println("Converted double value: " + convertedNumber);

        // Explicit Casting (Narrowing) - Note: This can lead to data loss if the value exceeds the target type's range.
        double price = 99.99;
        int roundedPrice = (int) price;

        System.out.println("\n=== Explicit Casting ===");
        System.out.println("Original double value: " + price);
        System.out.println("Converted int value: " + roundedPrice);
    }
}
