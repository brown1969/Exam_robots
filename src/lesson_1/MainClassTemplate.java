package lesson_1;

/**
 * - ім'я сласса повинно точно співпадати з іменем файла.
 * - зазвичай в одному файлі один класс
 * - в одному классі може бути тільки один метод main
 * - інших методів може бути багато
 */
public class MainClassTemplate {
    /**
     * Метод з якого починається виконуватися програма
     * static означає що він створиться до виконання программи і буде жити аж поки программа не закінчиться
     * void - означає що цей метод нічого не повертає
     * Метод main використовуємо поки вчимо Java , а в тестуванні у нас буде свій механізм запуску тестів, тому там ми його не будемо використовувати
     *
     * @param args String[] args - стандартний синтаксис метода main (args - параметри що ми можемо передавати з командного рядка при запуску)
     */
    public static void main(String[] args) {
        // 1. Виводимо повідомлення "Hello!" на консоль
        System.out.println("Hello world!");

        /*
        2. Пам'ятай!
        ім'я Класів - має починатися з великої літери
        ім'я методів і змінних - має починатися з маленької літери
        */

        // 3. ініціалізуємо змінну (в пам'яті комп'ютера виділяємо ячейку і даємо їй ім'я firstIntVariable)
        int variable1;
        // 4. об'являємо змінну , тобто даємо початкове значення (в ячейку пам'яті записуємо значення 5)
        variable1 = 5;
        // 5. Оголошуємо змінну secondIntVariable і одразу присвоюємо їй значення 10
        int variable2 = 10;
        // 6. Щоб результат був int треба, щоб всі частини виразу були int
        // 7. Обчислюємо суму firstIntVariable і secondIntVariable і зберігаємо результат у змінній result
        int result = variable1 + variable2;
        // 8. Виводимо результат на консоль разом зі стрічкою "Result = "
        System.out.println("Result = " + result);
        // 9. Виводимо суму firstIntVariable і 12 на консоль разом зі стрічкою "Result_2 = "
        System.out.println("Result2 = " + variable1 + 12);
        System.out.println("Result2 = " + (variable1 + 12));


         /*10.Calling the static method 'sum' from the 'Calc' class,
         passing the value of 'firstIntVariable' and 12 as arguments.
         This method calculates the sum of the two numbers and prints the result.*/
        CalcTemplate.sum(variable1, 12);

        CalcTemplate.sum(15, 35);

        /* 11.Creating an instance of the 'Calc' class using the 'new' keyword.
         This will allow us to access non-static methods and variables of the 'Calc' class.*/
        CalcTemplate calcTemplate = new CalcTemplate();



         /*12.Calling the non-static method 'sumDoubled' on the 'calc' object,
         passing the value of 'secondIntVariable' and 10 as arguments.
         This method calculates the sum of the two numbers, doubles the result, and prints the final result.*/
        calcTemplate.sumDoubled(variable2, 10);

         /*13.Calling the 'sumDoubled' method on the 'calc' object,
         passing 21 and the value of 'secondIntVariable' as arguments.
         The method calculates the sum of the two numbers, doubles the result,
         and returns the final result. Then, we add 55 to the result and print it*/
        int result1 = calcTemplate.sumDoubled(21, variable2);
        CalcTemplate.sum(result1, 55);

        /*14. Calling the 'sumDoubled' method on the 'calc' object twice.
         The inner method call calculates the sum of 3 and 5, doubles the result,
         and returns the intermediate result.
         The outer method call then calculates the sum of the intermediate result and 4,
         doubles the final result, and prints it.
              ((3 + 5)*2 + 4)*2 */
        calcTemplate.sumDoubled(calcTemplate.sumDoubled(3, 5), 4);

    }
}
