package exam;

import java.util.Scanner;

public class EnterOfName {

    public static String enterOfNameFromConsole() {
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.next();
        } catch (Exception e) {
            return "Wrong name";


        }

    }



}