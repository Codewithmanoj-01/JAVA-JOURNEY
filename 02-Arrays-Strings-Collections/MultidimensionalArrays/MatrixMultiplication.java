package MultidimensionalArrays;

public class MatrixMultiplication {

    public static void main(String[] args) {

        int[][] matrixA = {{1, 2},{3, 4}};

        int[][] matrixB = {{5, 6},{7, 8}};

        int[][] result = new int[2][2];

        for (int row = 0; row < 2; row++) {

            for (int col = 0; col < 2; col++) {

                for (int k = 0; k < 2; k++) {

                    result[row][col] += matrixA[row][k] * matrixB[k][col];
                }
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
