package homework.multithreading;

import java.util.Deque;
import java.util.LinkedList;

public class Demo {

    public static void main(String[] args) {
        Deque<Detail> dump = new LinkedList<>();
        for (int i = 0; i < 20; i++) {
            dump.add(RandomDetail.generate());
        }

        MadScientist firstMadScientist = new MadScientist("firstMadScientist");
        MadScientist secondMadScientist = new MadScientist("secondMadScientist");

        Thread factory = new Thread(new Factory(dump));
        Thread firstMinion = new Thread(new Minion(dump, firstMadScientist.details));
        Thread secondMinion = new Thread(new Minion(dump, secondMadScientist.details));

        factory.start();
        firstMinion.start();
        secondMinion.start();

        try {
            factory.join();
            firstMinion.join();
            secondMinion.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Winner winner = new Winner(firstMadScientist, secondMadScientist);
        try {
            System.out.println("Победил " + winner.win().toString());
        } catch (NullPointerException e) {
            System.out.println("Счет равный");
        }
    }
}