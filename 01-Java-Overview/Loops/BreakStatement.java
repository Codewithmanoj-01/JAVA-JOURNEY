package Loops;

public class BreakStatement {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) { // Loop from 1 to 10.
           
            if (i == 5) {
                break; // Exits the loop when i is equal to 5.
            }
            System.out.println("Count : " + i);
        }
    }
    
}
