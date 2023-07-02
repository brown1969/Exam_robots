package lesson_6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainClassListList {
    public static void main(String[] args) {

        List<List<String>> listList = new ArrayList<>();
        listList.add(new ArrayList<>());// Додавання рядка у динамичний список
        System.out.println(listList);
        listList.get(0).add("Test00");
        listList.add(new ArrayList<>());
        listList.get(1).add("Test10");
        listList.get(0).add("Test01");
        System.out.println(listList);
        listList.add(0, new ArrayList<>());
        System.out.println(listList);
        listList.get(0).add("Test");
        System.out.println(listList);
        //listList.get(0).add(3, "tt");
        System.out.println(listList.get(1));
        System.out.println(listList.get(1).get(0));
        listList.get(1).add(1, "testNew");
        System.out.println(listList);
        listList.get(1).set(1, "NewTest");
        System.out.println(listList);
        listList.add(new ArrayList<>());
        listList.add(new ArrayList<>());
        listList.get(4).add("Test50");
        System.out.println(listList);
        listList.remove(2);
        System.out.println(listList);
        listList.get(1).remove(0);
        System.out.println(listList);


        List<String> addList = new ArrayList<>();
        addList.add("Value1");
        addList.add("Value2");
        System.out.println(addList);

        listList.add(new ArrayList<>());
        listList.get(4).addAll(addList);
        System.out.println(listList);

        addList.add("Value3");
        System.out.println(addList);
        listList.add(addList);
        System.out.println(listList);

        System.out.println("-----------------------------");

        for (List<String> row: listList) {
            System.out.println(row);

        }



    }
}
