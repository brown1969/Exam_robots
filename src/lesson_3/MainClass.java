package lesson_3;

public class MainClass {
    public static void main(String[] args) {
        //int salary1 = 100;
        //int salary2 = 110;
        //int salary3 = 115;

        int[] salaryMassive = {100, 110, 115, 56};
        System.out.println("Size = " + salaryMassive.length);
        System.out.println(salaryMassive[1]);
        System.out.println(salaryMassive); // лінк на адресу в пам'яті
        salaryMassive[1] = 130;
        System.out.println(salaryMassive[1]);

        int[] massive = new int [10];
        System.out.println(massive[5]);
        Integer[] massiveInteger = new Integer[15];
        System.out.println(massiveInteger[14]);

       // massive[0] = 1;
       // massive[1] = 2;

        for (int i = 0; i < massive.length; i++) {    // i++ рівно і+1
            massive[i] = i + 1;
            System.out.print(massive[i] + " ");
        }
            System.out.println("-----------Block if----------------");

            for (int i = 0; i < massive.length; i++) {
                if(massive[i] < 3) {
                    System.out.println(massive[i] + "is less than 3");
            } else if (massive[i] == 3) {

                    System.out.println(massive[i] + "is equals 3");
                } else {
                    System.out.println(massive[i] + "is more than 3");
                }



        }

        System.out.println("--------------------Matrix---------------------------");

            // 1 2 3    00 01 02
            // 4 5 6    10 11 12
            // 7 8 9    20 21 22

        int[][] matrix = {{1, 2, 3} ,{4, 5, 6} ,{7, 8, 9} };

        System.out.println("Rows "+ matrix.length);
        System.out.println("Row 0 length = " + matrix[0].length);
        System.out.println(matrix[1][2]);

        // 1 2 3      00 01 02
        // 4 5        10 11
        // 7 8 9 10   20 21 22 23





}
}
