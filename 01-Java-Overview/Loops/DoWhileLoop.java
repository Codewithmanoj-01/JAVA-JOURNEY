package Loops;

public class DoWhileLoop {
    public static void main(String[] args) {

        int number = 1; // initialization.

        do { // do-while loop executes the block of code at least once, and then checks the condition.
            System.out.println("Count : " + number);
            number++; // update
        } while (number <= 5); // condition
    }
    
}
