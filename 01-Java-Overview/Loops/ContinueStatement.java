package Loops;

public class ContinueStatement {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) { // Loop from 1 to 10.
           
            if (i == 5) {
                continue; // Skips the current iteration when i is equal to 5 and continues with the next iteration.
            }
            System.out.println("Count : " + i);
        }
    }
    
}
