package lesson_4_HW;

import lesson_4.PrintMatrix;

public class WorkWithMassive {

    public static int[][] matrixCreateMethod(int x, int y, int z) {
        int[][] matrix_2;

        // if (x > 0 && y > 0) {
//            matrix_2 = new int[x][y];
//            // зРОБИТИ ПЕРЕВІРКУ ДО створення матриці
//            for (int i = 0; i < matrix_2.length; i++) {
//                for (int j = 0; j < matrix_2[i].length; j++) {
//                    matrix_2[i][j] = z;
//
//                }
//            }


        //}
        if (x <= 0) {
            x = 1;
            // matrix_2 = new int[x][y];
            System.out.println("Матриця не може бути зі стороною, менше 1");
            System.out.println("Створено матрицю зі значенням х = 1");
//            for (int i = 0; i < matrix_2.length; i++) {
//                for (int j = 0; j < matrix_2[i].length; j++) {
//                    matrix_2[i][j] = z;
//                }
//            }

        }

        if (y <= 0) {
            y = 1;
            //matrix_2 = new int[x][y];
            System.out.println("Матриця не може бути зі стороною, менше 1");
            System.out.println("Створено матрицю зі значенням у = 1");
//            for (int i = 0; i < matrix_2.length; i++) {
//                for (int j = 0; j < matrix_2[i].length; j++) {
//                    matrix_2[i][j] = z;
//                }
//            }

        }
        matrix_2 = new int[x][y];
        for (int i = 0; i < matrix_2.length; i++) {
            for (int j = 0; j < matrix_2[i].length; j++) {
                matrix_2[i][j] = z;
            }
        }


        PrintMatrix.printMatrixMethod(matrix_2);
        return matrix_2;

    }


    public static int[][] matrixFillLeft(int[][] matrixForFillLeft, int znach) {

        //if (matrixForFillLeft.length != matrixForFillLeft[0].length) {
        // System.out.println("Матриця не квадратна!");
        // return matrixForFillLeft;
        if (WorkWithMassive.squareMatrix(matrixForFillLeft)) {


            // WorkWithMassive.squareMatrix(matrixForFillLeft);

            for (int i = 0; i < matrixForFillLeft.length; i++) {
                for (int j = 0; j < matrixForFillLeft[i].length; j++) {
                    if (matrixForFillLeft[i] == matrixForFillLeft[j]) {
                        matrixForFillLeft[i][j] = znach;

                    }

                }

            }
        }

        PrintMatrix.printMatrixMethod(matrixForFillLeft);
        return matrixForFillLeft;
    }

    public static int[][] matrixFillRight(int[][] matrixForFillRight, int znach1) {
        //if (matrixForFillRight.length != matrixForFillRight[0].length) {
        //  System.out.println("Матриця не квадратна!");
        //return matrixForFillRight;

        if (WorkWithMassive.squareMatrix(matrixForFillRight)) {


            for (int i = 0; i < matrixForFillRight.length; i++) {
                for (int j = 0; j < matrixForFillRight[i].length; j++) {
                    if (i + j == matrixForFillRight.length - 1) {
                        matrixForFillRight[i][j] = znach1;

                    }

                }

            }

        }
        PrintMatrix.printMatrixMethod(matrixForFillRight);
        return matrixForFillRight;
    }

    public static int[][] matrixFillFull(int[][] matrixForFillFull, int znach2) {

        //if (matrixForFillFull.length != matrixForFillFull[0].length) {
        // System.out.println("Матриця не квадратна!");
        //  return matrixForFillFull;
        if (WorkWithMassive.squareMatrix(matrixForFillFull)) {


            matrixFillLeft(matrixForFillFull, znach2);
            matrixFillRight(matrixForFillFull, znach2);

                /*for (int i = 0; i < matrixForFillFull.length; i++) {
                    for (int j = 0; j < matrixForFillFull[i].length; j++) {
                        if ((i + j == matrixForFillFull.length - 1) | (matrixForFillFull[i] == matrixForFillFull[j])) {
                            matrixForFillFull[i][j] = znach2;
                        }
                    }
                } */
        }
        return matrixForFillFull;
    }


    public static boolean squareMatrix(int[][] matrixForFill) {

        for (int i = 0; i < matrixForFill.length; i++) {


            if (matrixForFill.length != matrixForFill[i].length) { // зробити перевірку по всім строкам, бо можливі різні значення
                System.out.println("Матриця не квадратна!");
                return false;
            }


        }
        return true;
    }

}





