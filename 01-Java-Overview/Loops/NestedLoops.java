package Loops;

public class NestedLoops {

    public static void main(String[] args) {

        for (int row = 1; row <= 3; row++) { // Outer loop for rows.

            for (int column = 1; column <= 3; column++) { // Inner loop for columns.
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
