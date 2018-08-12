package homework.multithreading;

import lombok.Data;
import lombok.ToString;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

@Data
@ToString
public class MadScientist {

    private String name;
    public Deque<Detail> details = new LinkedList<>();
    private List<Robot> robots = new LinkedList<>();

    public MadScientist(String name) {
        this.name = name;
    }

    public void makeRobots() {
        while (haveDetails()) {
            robots.add(makeRobot());
        }
    }

    private boolean haveDetails() {
        Set<Detail> detailSet = new HashSet<>();
        detailSet.addAll(details);
        return detailSet.size() >= Detail.values().length;
    }

    private Robot makeRobot() {
        Robot robot = new Robot();
        while (!robot.isRobot()) {
            Detail currentDetail = details.removeFirst();
            switch (currentDetail) {
                case HEAD:
                    if (robot.getHead() != currentDetail) {
                        robot.setHead(currentDetail);
                    } else {
                        details.addLast(currentDetail);
                    }
                    break;
                case BODY:
                    if (robot.getHead() != currentDetail) {
                        robot.setBody(currentDetail);
                    } else {
                        details.addLast(currentDetail);
                    }
                    break;
                case LEFT_ARM:
                    if (robot.getHead() != currentDetail) {
                        robot.setLeftArm(currentDetail);
                    } else {
                        details.addLast(currentDetail);
                    }
                    break;
                case LEFT_LEG:
                    if (robot.getHead() != currentDetail) {
                        robot.setLeftLeg(currentDetail);
                    } else {
                        details.addLast(currentDetail);
                    }
                    break;
                case RIGHT_ARM:
                    if (robot.getHead() != currentDetail) {
                        robot.setRightArm(currentDetail);
                    } else {
                        details.addLast(currentDetail);
                    }
                    break;
                case RIGHT_LEG:
                    if (robot.getHead() != currentDetail) {
                        robot.setRightLeg(currentDetail);
                    } else {
                        details.addLast(currentDetail);
                    }
                    break;
                case CPU:
                    if (robot.getHead() != currentDetail) {
                        robot.setCpu(currentDetail);
                    } else {
                        details.addLast(currentDetail);
                    }
                    break;
                case HDD:
                    if (robot.getHead() != currentDetail) {
                        robot.setHdd(currentDetail);
                    } else {
                        details.addLast(currentDetail);
                    }
                    break;
                case RAM:
                    if (robot.getHead() != currentDetail) {
                        robot.setRam(currentDetail);
                    } else {
                        details.addLast(currentDetail);
                    }
                    break;
                default:
                    System.out.println("Ошибка!");
                    break;
            }
        }
        return robot;
    }
}