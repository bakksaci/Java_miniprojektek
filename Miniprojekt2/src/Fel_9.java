public class Fel_9 {
    public static void main(String[] args) {
        int[][] matrix = createMatrix(10, 10);
        printMatrix(matrix);
    }

    public static int[][] createMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == j) {
                    matrix[i][j] = i;
                } else {
                    matrix[i][j] = 0;
                }
            }
        }

        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
