package Operators;

public class LogicalOperators {
    public static void main(String[] args) {

        boolean isJavaFun = true;
        boolean isPracticeDone = false;

        System.out.println("AND Operator: " + (isJavaFun && isPracticeDone));
        System.out.println("OR Operator: " + (isJavaFun || isPracticeDone));
        System.out.println("NOT Operator: " + (!isJavaFun));
    }
}
