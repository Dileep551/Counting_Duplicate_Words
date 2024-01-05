import java.util.HashMap;
import java.util.Map;

public class WordCount {


    public String[] getStringArray(String value){

        return value.toLowerCase().replaceAll("[^\\sa-zA-Z0-9]", "").split("\\s");

    }

    public HashMap<String, Integer> getCountWord(String inputValue) {

        HashMap<String, Integer> countWord = new HashMap<>();

        for (String strVal : getStringArray(inputValue)) {

            Integer integer = countWord.get(strVal);
            if(integer == null){

                countWord.put(strVal, 1);

            } else {
                countWord.put(strVal, integer + 1);
            }

        }

        return countWord;


    }

}
