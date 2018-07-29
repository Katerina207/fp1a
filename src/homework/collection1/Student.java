package homework.collection1;

public class Student implements Comparable<Student> {

    private String firstName;
    private String lastName;
    private Integer age;
    private Double averageMark;

    public Student(String firstName, String secondName, int age, double averageMark) {
        this.firstName = firstName;
        this.lastName = secondName;
        this.age = age;
        this.averageMark = averageMark;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String secondName) {
        this.lastName = secondName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(Double averageMark) {
        this.averageMark = averageMark;
    }

    @Override
    public String toString() {
        return "Student: " + firstName + " " + lastName + " " + age + " years old; Average mark: " + averageMark;
    }

    @Override
    public int compareTo(Student o) {
        return this.firstName.compareTo(o.firstName);
    }
}
