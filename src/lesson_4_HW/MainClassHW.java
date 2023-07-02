package lesson_4_HW;

import lesson_4.PrintMatrix;

import java.util.Locale;

public class MainClassHW {
    public static void main(String[] args) {

    int n = 0;
    int m = 3;
    int h = 1;
    int h1 = 8;
    int h2 = 9;
    int h3 = 7;

    int[][] matrix = WorkWithMassive.matrixCreateMethod(n, m, h);

    WorkWithMassive.matrixFillLeft(matrix, h1);

    WorkWithMassive.matrixFillRight(matrix, h2);

    WorkWithMassive.matrixFillFull(matrix, h3);


    String testString10 = new String(" Rest_. String, Test1, Part2 ");
        System.out.println(testString10.trim());
        System.out.println(testString10.substring(1, 5));
        String[] wordsString = testString10.split(",");
        for (int i = 0; i < wordsString.length; i++) {
            if (wordsString[i].length() != 0) {
                System.out.println(wordsString[i].trim());
                                            }
        }

        String symbol = wordsString[0].trim().substring(0, 1);
        if (symbol.startsWith("T")) {
            System.out.println("Перший символ - Т");
        } else {
            System.out.println("Перший символ - " + symbol.substring(0, 1));
        }

        if (symbol.equalsIgnoreCase("T") )
        {System.out.println("Перший символ - Т");
        } else {
            System.out.println("Перший символ - " + symbol.substring(0, 1));
        }

        System.out.println(testString10.trim().replaceFirst("s", "y"));

        }

    }

