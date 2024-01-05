import java.util.HashMap;
import java.util.Map;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Map<Character, Integer> countChar = new HashMap<>();

        String value = "This is a great thing".replaceAll("\\s","");

        char[] charValue = value.toCharArray();

        int count = 1;

        for (char charVal : charValue) {

            Integer integer = countChar.get(charVal);
            if(integer == null){

                countChar.put(charVal, 1);

            } else {
                countChar.put(charVal, integer + 1);
            }

        }

        System.out.println(countChar);





    }
}