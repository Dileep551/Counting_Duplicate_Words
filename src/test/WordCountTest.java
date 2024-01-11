import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;


import static org.junit.jupiter.api.Assertions.*;

class WordCountTest {


    @Test
    void getStringArray() {

        //Give
        String value = "Hello world, How are you? I am good, How about you";

        //When
        WordCount wordCount = new WordCount();
        String[] stringArray = wordCount.getStringArray(value);

        //Then
        assertArrayEquals(new String[]{"hello", "world",
        "how", "are", "you", "i", "am", "good", "how", "about", "you"}, stringArray);


    }

    @Test
    void getCountWord() {

        //Give
        String value = "Hello world, How are you? I am good, How about you";

        //When
        WordCount wordCount = new WordCount();
        Map<String, Integer> wordCountMap = wordCount.getCountWord(value);


        //Then
        assertEquals(2, wordCountMap.get("how"));
        assertEquals(1, wordCountMap.get("world"));
        assertEquals(1, wordCountMap.get("are"));
        assertEquals(1, wordCountMap.get("about"));
        assertEquals(1, wordCountMap.get("i"));
        assertEquals(1, wordCountMap.get("hello"));
        assertEquals(1, wordCountMap.get("am"));
        assertEquals(1, wordCountMap.get("good"));
        assertEquals(2, wordCountMap.get("you"));


    }
}