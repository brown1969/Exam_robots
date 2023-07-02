package lesson_2_HW;

public class MainClass_HW {
    public static void main(String[] args) {

        /*int result1 = Calc_HW.multiDoubled(10, 12);
        System.out.println(result1);

        int result2 = Calc_HW.substractionDoubled(10, 12);
        System.out.println(result2);
        */
        Calc_HW calcHw = new Calc_HW();
        /* int result3 = calcHw.divisionDoubled(20, 0);
        double result4 = calcHw.divisionDoubled(20.114, 0.0);
        System.out.println(result3);
        System.out.println(result4);
        */
        int x = 5;
        int y = 10;
        int z = 15;
        int q = 20;

        double rez = calcHw.divisionDoubled(Calc_HW.substractionDoubled(Calc_HW.substractionDoubled(q, x), y), z);
        System.out.println(rez);
    }
}
