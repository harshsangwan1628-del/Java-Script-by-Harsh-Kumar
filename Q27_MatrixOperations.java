// Q27: Matrix addition and multiplication - combining stiffness matrices of two coupled truss members
public class Q27_MatrixOperations {
    public static void main(String[] args) {
        int[][] memberA = { {12, 4}, {4, 8} };
        int[][] memberB = { {3, 1}, {2, 5} };

        System.out.println("Combined stiffness (addition):");
        printMatrix(addMatrices(memberA, memberB));

        System.out.println("Coupled stiffness response (multiplication):");
        printMatrix(multiplyMatrices(memberA, memberB));
    }

    static int[][] addMatrices(int[][] a, int[][] b) {
        int rows = a.length, cols = a[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }

    static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int rows = a.length, cols = b[0].length, inner = b.length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < inner; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }

    static void printMatrix(int[][] m) {
        for (int[] row : m) {
            System.out.println(java.util.Arrays.toString(row));
        }
    }
}
