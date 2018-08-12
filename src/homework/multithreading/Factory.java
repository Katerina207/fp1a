package homework.multithreading;

import lombok.AllArgsConstructor;

import java.util.Deque;
import java.util.Random;

@AllArgsConstructor
public class Factory implements Runnable {

    private static final long INTERVAL = 100L;
    private static final int NIGHTS = 100;
    private final Deque<Detail> deque;
    private static final int MAX_NUMBER_OF_DETAILS = 4;

    @Override
    public void run() {
        synchronized (deque) {
            for (int i = 1; i <= NIGHTS; i++) {
                try {
                    Random random = new Random();
                    int numberOfDetails = random.nextInt(MAX_NUMBER_OF_DETAILS) + 1;
                    System.out.println(Thread.currentThread().getName() + " выбросит " + numberOfDetails + " деталей");
                    for (int j = 1; j <= numberOfDetails; j++) {
                        Detail detail = RandomDetail.generate();
                        deque.add(detail);
                        System.out.println("Фабрика выбросила " + detail.name());
                    }
                    System.out.println("На свалке " + deque.size() + " деталей");
                    deque.wait(INTERVAL);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}