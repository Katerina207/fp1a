package homework.collection1;

import java.util.Comparator;

public class AverageMarkComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAverageMark().compareTo(o2.getAverageMark());
    }
}
