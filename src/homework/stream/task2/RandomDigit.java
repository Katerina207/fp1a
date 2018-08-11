package homework.stream.task2;

import java.util.Random;

public final class RandomDigit {

    public static Integer getRandomDigit() {
        Random random = new Random();
        return random.nextInt(1000);
    }
}