package Conditionals;

public class NestedIf {
    public static void main(String[] args) {
        int age = 25;
        boolean hasVoterID = true;

        if (age >= 18) {
            if (hasVoterID) {
                System.out.println("You are eligible to vote.");
            }
            else {
                System.out.println("You need a voter ID to vote."); // We have to use else even in nested if to handle the case when the condition is false, otherwise it will not execute any statement when the condition is false.
            }
        }
        else {
            System.out.println("You are not eligible to vote.");
        }
    }
    
}
