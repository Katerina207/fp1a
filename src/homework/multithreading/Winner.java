package homework.multithreading;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Winner {

    private MadScientist firstMadScientist;
    private MadScientist secondMadScientist;

    public MadScientist win() {
        firstMadScientist.makeRobots();
        secondMadScientist.makeRobots();

        int firstMadScientistRobots = firstMadScientist.getRobots().size();
        int secondMadScientistRobots = secondMadScientist.getRobots().size();

        System.out.println("firstMadScientist собрал " + firstMadScientistRobots + " роботов");
        System.out.println("secondMadScientist собрал " + secondMadScientistRobots + " роботов");

        MadScientist result;

        if (firstMadScientistRobots > secondMadScientistRobots) {
            result = firstMadScientist;
        } else if (secondMadScientistRobots > firstMadScientistRobots) {
            result = secondMadScientist;
        } else {
            result = null;
        }
        return result;
    }
}