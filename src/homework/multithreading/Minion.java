package homework.multithreading;

import lombok.AllArgsConstructor;

import java.util.Deque;
import java.util.Random;

@AllArgsConstructor
public class Minion implements Runnable {

    private final Deque<Detail> deque;
    private Deque<Detail> details;
    private static final int MAX_NUMBER_OF_DETAILS = 4;
    private static final int NIGHTS = 100;
    private static final long INTERVAL = 100L;

    @Override
    public void run() {
        for (int i = 1; i <= NIGHTS; i++) {
            try {
                Random random = new Random();
                int numberOfDetails = random.nextInt(MAX_NUMBER_OF_DETAILS) + 1;
                System.out.println(Thread.currentThread().getName() + " может взять " + numberOfDetails + " деталей");
                for (int j = 1; j <= numberOfDetails; j++) {
                    synchronized (deque) {
                        if (!deque.isEmpty()) {
                            Detail detail = deque.removeFirst();
                            details.add(detail);
                            System.out.println(Thread.currentThread().getName() + " взял " + detail.name());
                        }
                    }
                }
                System.out.println(Thread.currentThread().getName() + " ждет следующей ночи");
                Thread.sleep(INTERVAL);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}