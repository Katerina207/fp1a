package homework.collection2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class FirstTask {

    public static void main(String[] args) {

        String string = "Down down down There was nothing else to do so Alice soon began talking again";
        List<String> strings = new ArrayList<>(Arrays.asList(string.split("\\s")));
        HashSet<String> stringsHashSet = CountUniqueWord.uniqueWords(strings);
        Map<String, Integer> stringsHashMap = CountUniqueWord.countUniqueWord(strings);

        System.out.println(strings);
        System.out.println(stringsHashSet);
        System.out.println(stringsHashMap.entrySet());
    }
}