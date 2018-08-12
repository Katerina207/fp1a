package homework.multithreading;

import lombok.NoArgsConstructor;

import java.util.Random;

@NoArgsConstructor
public final class RandomDetail {

    public static Detail generate() {
        Random random = new Random();
        Detail[] details = Detail.values();
        return details[random.nextInt(details.length)];
    }
}