package lesson_4;

public class MainClassMatrix {
    public static void main(String[] args) {
        // 1 2 3
        // 4 5
        // 7 8 9 10

        // 9 1 1    ліва діагональ  1 1 9  права діагональ тільки у квадратн их матриць
        // 1 9 1                    1 9 1
        // 1 1 9                    9 1 1

        int[][] matrix = {{1,2,3}, {4,5}, {7,8,9,10}};
        matrix[2][3] = 11;

        PrintMatrix.printMatrixMethod(matrix);

        int[][] matrix_D = new int[4][5];
        for (int i = 0; i < matrix_D.length ; i++) {
            for (int j = 0; j < matrix_D[i].length; j++) {
                matrix_D[i][j] = i*matrix_D[i].length +j + 1;
            }

        }
        PrintMatrix.printMatrixMethod(matrix_D);

    }
}
