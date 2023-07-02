package lesson_6_HW;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {

        List<Integer> spisok1 = new ArrayList<>();
        spisok1.add(25);
        spisok1.add(32);
        spisok1.add(17);
        spisok1.add(2);
        spisok1.add(79);
        System.out.println(spisok1);

           int maxValueMax = MaxValue.maxValue1((ArrayList) spisok1);
        System.out.println(maxValueMax);

           List<Integer> spisok2 = MaxValue.reverse((ArrayList) spisok1);


    }
}
