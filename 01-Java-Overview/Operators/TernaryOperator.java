package Operators;

public class TernaryOperator {
    public static void main(String[] args) {

        int age = 20;

        String result = (age >= 18) ? "Eligible to Vote" : "Not Eligible"; // Ternary operator (condition) ? value_if_true : value_if_false

        System.out.println(result);
    }
}
