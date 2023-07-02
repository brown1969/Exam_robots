package lesson_6_HW;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxValue {

    //public static int max52 = 0;
    public static int maxValue1(ArrayList<Integer> array1) {
        int max52 = 0;
        for ( Integer row : array1
             ) { if (row > max52) {
              max52 = row;
        }

        }

               //array1.set(0, 96);
        System.out.println(max52);
        return max52;
    }


    public static List<Integer> reverse (ArrayList<Integer> array2) {

        List<Integer> array3 = new ArrayList<>();
        for (int i = 0; i < array2.size(); i++) {

        array3.add(array2.get(array2.size()-i-1));


        }
        System.out.println(array3);
    return array3;

    }



}

