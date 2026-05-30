package MultidimensionalArrays;

public class JaggedArray {

    public static void main(String[] args) {

        int[][] jaggedArray = {{1, 2},{3, 4, 5},{6, 7, 8, 9}};

        for (int row = 0; row < jaggedArray.length; row++) {

            for (int col = 0; col < jaggedArray[row].length; col++) {

                System.out.print(jaggedArray[row][col] + " ");
            }

            System.out.println();
        }
    }
}

// A jagged array is a multidimensional array where each row can have a different number of columns.