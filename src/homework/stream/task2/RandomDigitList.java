package homework.stream.task2;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public final class RandomDigitList {

    public static List<Integer> getRandomDigitList() {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < 20; i++) {
            list.add(RandomDigit.getRandomDigit());
        }
        list.sort(Comparator.naturalOrder());
        return list;
    }
}