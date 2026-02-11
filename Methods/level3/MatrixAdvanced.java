import java.util.Random;

public class MatrixAdvanced {
    public static int[][] createRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10);
            }
        }
        return matrix;
    }
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        int[][] trans = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                trans[j][i] = matrix[i][j];
            }
        }
        return trans;
    }
    public static int determinant2x2(int[][] m) {
        return m[0][0] * m[1][1] - m[0][1] * m[1][0];
    }
    public static int determinant3x3(int[][] m) {
        return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1]) 
             - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0]) 
             + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    }
    public static double[][] inverse2x2(int[][] m) {
        int det = determinant2x2(m);
        double[][] inv = new double[2][2];
        if (det == 0) throw new ArithmeticException("No Inverse");
        inv[0][0] = m[1][1] / (double) det;
        inv[0][1] = -m[0][1] / (double) det;
        inv[1][0] = -m[1][0] / (double) det;
        inv[1][1] = m[0][0] / (double) det;
        return inv;
    }
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.printf("%.2f ", val);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] m2 = createRandomMatrix(2, 2);
        int[][] m3 = createRandomMatrix(3, 3);
        System.out.println("2x2 Matrix:");
        displayMatrix(m2);
        System.out.println("Determinant 2x2: " + determinant2x2(m2));
        System.out.println("Inverse 2x2:");
        displayMatrix(inverse2x2(m2));
        System.out.println("3x3 Matrix:");
        displayMatrix(m3);
        System.out.println("Determinant 3x3: " + determinant3x3(m3));
        System.out.println("Transpose 3x3:");
        displayMatrix(transposeMatrix(m3));
    }
}
