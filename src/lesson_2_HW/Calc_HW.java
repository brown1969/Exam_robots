package lesson_2_HW;

public class Calc_HW {

public static int multiDoubled(int dod1, int dod2) {
    int resultMultiDoubled = ((dod1 * dod2) *2);
    return resultMultiDoubled;

}
public static int substractionDoubled (int sub1, int sub2) {
    int resultSubDoubled = (( sub1 - sub2) *2);
    return resultSubDoubled;

}

public int divisionDoubled (int var1, int var2) {
    try {
        int resultDivDoubled = (( var1 / var2) *2);
        return resultDivDoubled;

    } catch (ArithmeticException e) {
        System.out.println("ERROR " + e);
        System.out.println("Returned " + 88888);
        return 88888;

    } catch (Exception e){
        System.out.println("ERROR " + e);
        System.out.println("Returned " + 99999);
        return 99999;

    }




}

public double divisionDoubled (double var1, double var2) {
    try {
        double resultDivDoubled = ((var1 / var2) * 2);
        return resultDivDoubled;

    } catch (ArithmeticException e) {
        System.out.println("ERROR " + e);
        System.out.println("Returned " + 88888);
        return 88888;
    } catch (RuntimeException e) {
        System.out.println("ERROR " + e);
        System.out.println("Returned " + 88899);
        return 88899;

    } catch (Exception e) {
        System.out.println("ERROR " + e);
        System.out.println("Returned " + 99999);
        return 99999;


    }

}

}
