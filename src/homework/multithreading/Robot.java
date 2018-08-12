package homework.multithreading;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Robot {

    private Detail head;
    private Detail body;
    private Detail leftArm;
    private Detail rightArm;
    private Detail leftLeg;
    private Detail rightLeg;
    private Detail cpu;
    private Detail hdd;
    private Detail ram;

    public boolean isRobot() {
        boolean b1 = head == Detail.HEAD;
        boolean b2 = body == Detail.BODY;
        boolean b3 = leftArm == Detail.LEFT_ARM;
        boolean b4 = leftLeg == Detail.LEFT_LEG;
        boolean b5 = rightArm == Detail.RIGHT_ARM;
        boolean b6 = rightLeg == Detail.RIGHT_LEG;
        boolean b7 = cpu == Detail.CPU;
        boolean b8 = hdd == Detail.HDD;
        boolean b9 = ram == Detail.RAM;
        return b1 && b2 && b3 && b4 && b5 && b6 && b7 && b8 && b9;
    }
}