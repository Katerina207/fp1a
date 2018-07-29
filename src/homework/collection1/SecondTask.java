package homework.collection1;

import java.util.Arrays;
import java.util.List;

public class SecondTask {

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("Ivan", "Ivanov", 19, 8.8),
                new Student("Petr", "Petrov", 21, 9.2),
                new Student("Alexandr", "Smirnov", 19, 9.0),
                new Student("Ivan", "Voronov", 20, 7.6),
                new Student("Petr", "Petrov", 18, 7.9),
                new Student("Alexandr", "Smirnov", 19, 9.9)
        );
        print(students);

        System.out.println(findMaxMark(students));
        System.out.println();

        students.sort(new StudenComplexComparator());
        print(students);
    }

    private static void print(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println();
    }

    private static Student findMaxMark(List<Student> students) {
        Student maxMark = students.get(0);
        for (int i = 1; i < students.size(); i++) {
            if (maxMark.getAverageMark() < students.get(i).getAverageMark()) {
                maxMark = students.get(i);
            }
        }
        return maxMark;
    }
}
