package ControlStatements;

public class ReturnStatement {

    public static void main(String[] args) {

        int result = addNumbers(10, 20);

        System.out.println("Sum: " + result);
    }

    public static int addNumbers(int a, int b) {

        return a + b;
    }
}