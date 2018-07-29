package homework.collection1;

import java.util.Comparator;

public class StudenComplexComparator implements Comparator<Student> {

    private LastNameComparator lastNameComparator = new LastNameComparator();
    private AgeComparator ageComparator = new AgeComparator();
    private AverageMarkComparator averageMarkComparator = new AverageMarkComparator();

    @Override
    public int compare(Student o1, Student o2) {
        int compareResult = o1.compareTo(o2);
        compareResult = compareResult == 0 ? lastNameComparator.compare(o1, o2) : compareResult;
        compareResult = compareResult == 0 ? ageComparator.compare(o1, o2) : compareResult;
        compareResult = compareResult == 0 ? averageMarkComparator.reversed().compare(o1, o2) : compareResult;

        return compareResult;
    }
}
