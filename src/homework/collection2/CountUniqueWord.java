package homework.collection2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class CountUniqueWord {

    public static HashSet<String> uniqueWords(List<String> list) {
        return new HashSet<>(list);
    }

    public static Map<String, Integer> countUniqueWord(List<String> list) {
        Map<String, Integer> countUniqueWords = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            int counter = 0;
            String key = list.get(i);
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i).contentEquals(list.get(j))) {
                    counter++;
                }
            }
            countUniqueWords.put(key, counter);
        }
        return countUniqueWords;
    }
}