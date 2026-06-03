package WrapperClasses;

public class DoubleWrapper {
    public static void main(String[] args) {
        // Creating a Double wrapper object
        Double num1 = Double.valueOf(3.14);
        Double num2 = Double.valueOf(2.71);

        // Using wrapper class methods
        double sum = num1.doubleValue() + num2.doubleValue();
        System.out.println("Sum: " + sum);

        // Auto-boxing and unboxing
        Double autoBoxedNum = 1.618; // Auto-boxing
        double unboxedNum = autoBoxedNum; // Unboxing
        System.out.println("Auto-boxed Number: " + autoBoxedNum);
        System.out.println("Unboxed Number: " + unboxedNum);
    }
}
