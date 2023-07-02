package lesson_4;

public class MainClassString {
    public static void main(String[] args) {
        String testString = "Test String ";
        String testString2 = new String("Test String ");
        String testString3 = "Test String ";

        System.out.println(testString);
        System.out.println(testString3);
        testString = "test1";
        System.out.println(testString);
        System.out.println(testString3);

        System.out.println("-----------------------------");
        System.out.println(testString3.toUpperCase());
        System.out.println(testString3.toLowerCase());
        System.out.println(testString3);

        String str = "test";
        String str2 = new String("test");

        //if (str == str2) {
        if (str.equals(str2)) {
            System.out.println(str + " Equals " + str2);

        } else {
            System.out.println(str + " Not Equals " + str2);
        }
        boolean eq = "Test".equals("test"); // false
        System.out.println(eq);
        "Test".equalsIgnoreCase("test"); //false
        "Test".toLowerCase().equals("test".toLowerCase()); //true


        String ourString = "  Test  Test  ".trim(); // "Test  Test"
        System.out.println(ourString);
        String[] words = ourString.split(" ");
        System.out.println("Number of words " + words.length);
        System.out.println("  Test  Test  ".trim().split(" ").length);
        System.out.println("  Space test   ".replace(" ", ""));

        System.out.println();

        String varString = " test,,test1\", test2 "; //тільки слова
        String[] wordsMassive = varString.trim().replace(" ", "").replace("\"", "").split(",");
        for (int i = 0; i < wordsMassive.length; i++) {
            if (wordsMassive[i].length() != 0) {
                System.out.println(wordsMassive[i]);
            }

        }

    }
}
