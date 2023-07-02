package currency;

import java.util.Scanner;

public class Menu {
    public static int getNumberFromConsole(){
        Scanner scanner = new Scanner(System.in); // Считування ввод з клавіатури
        try {
            return scanner.nextInt(); // метод сканера, считує щоввів користувач, якщо інт, повертає його, якщо ні, то ескепшн
        }catch (Exception e){
            return 0;
        }
    }

    public static double getDoubleFromConsole(){
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.nextDouble();
        }catch (Exception e){
            return 0;
        }

    }


}
