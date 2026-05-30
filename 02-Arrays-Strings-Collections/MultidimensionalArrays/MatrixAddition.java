package MultidimensionalArrays;

public class MatrixAddition {

    public static void main(String[] args) {

        int[][] matrixA = {{1, 2},{3, 4}};

        int[][] matrixB = {{5, 6},{7, 8}};

        int[][] result = new int[2][2];

        for (int row = 0; row < 2; row++) {

            for (int col = 0; col < 2; col++) {

                result[row][col] = matrixA[row][col] + matrixB[row][col];
            }
        }

        for (int[] rows : result) {

            for (int value : rows) {

                System.out.print(value + " ");
            }

            System.out.println();
        }
    }
}
