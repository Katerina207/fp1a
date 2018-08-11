package homework.stream.task1;

import java.util.Map;

public class Counter {

    private String string;

    public Counter(String string) {
        this.string = string;
    }

    public Map<Character, Integer> countLetters() {
        Map<Character, Integer> letters = Alphabet.getAlphabet();
        countMapValue(letters, string);
        return letters;
    }

    private void countMapValue(Map<Character, Integer> map, String strings) {
        for (int i = 0; i < strings.length(); i++) {
            Character ch = strings.toLowerCase().charAt(i);
            if (map.containsKey(ch)) {
                map.replace(ch, map.get(ch) + 1);
            }
        }
    }
}