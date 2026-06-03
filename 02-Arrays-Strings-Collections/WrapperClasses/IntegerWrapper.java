package WrapperClasses;

public class IntegerWrapper {
    public static void main(String[] args) {
        // Creating an Integer wrapper object
        Integer num1 = Integer.valueOf(10);
        Integer num2 = Integer.valueOf(20);

        // Using wrapper class methods
        int sum = num1.intValue() + num2.intValue();
        System.out.println("Sum: " + sum);

        // Auto-boxing and unboxing
        Integer autoBoxedNum = 30; // Auto-boxing
        int unboxedNum = autoBoxedNum; // Unboxing
        System.out.println("Auto-boxed Number: " + autoBoxedNum);
        System.out.println("Unboxed Number: " + unboxedNum);
    }
}
