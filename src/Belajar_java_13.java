import java.util.Arrays;

public class Belajar_java_13 {
    public static void main(String[] args) {
        String randomString = "Im just a random string";

        String gotToQuote = "He said, \"Im here\"";

        int numTwo = 2;

        System.out.println(randomString + " " + gotToQuote);

        String upperCaseStr = "BIG";
        String lowerCaseStr ="big";

        if(upperCaseStr.equalsIgnoreCase(lowerCaseStr));
        {
            System.out.println("Equal");
        }

        String letter = "abcde";
        String moreLetter = "fghij";

        System.out.println("2nd char: " + letter.charAt(1));

        System.out.println(letter.compareTo(moreLetter));

        System.out.println(letter.contains("abc"));

        System.out.println(letter.endsWith("de"));

        System.out.println(letter.indexOf("cd"));

        String[] letterArray = letter.split(",");

        System.out.println(Arrays.toString(letterArray));

        StringBuilder randSB = new StringBuilder("A random value");
        




    }
}
