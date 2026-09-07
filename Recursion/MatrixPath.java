package Recursion;

public class MatrixPath {

    public static int matrixPath(int m, int n) {
        if (m <= 1 || n <= 1) {
            return 1;
        }
        return matrixPath(m - 1, n) + matrixPath(m, n - 1);
    }

    public static void main(String[] args) {
        System.out.println(matrixPath(4, 5));
    }
}
