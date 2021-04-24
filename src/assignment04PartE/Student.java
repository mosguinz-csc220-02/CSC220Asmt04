package assignment04PartE;

import java.util.Comparator;

/**
 * Part E
 */

public final class Student implements Comparable<Student> {

    private static String compareToPriority;
    private static int queueCounter = 1;

    private final String firstName;
    private final String lastName;
    private final int studentId;
    private final double gpa;
    private final int smallQuestionTotal;
    private final int bigQuestionTotal;
    private final int queueNumber;

    public Student(String firstName, String lastName, int studentId, double gpa,
            int smallQuestionTotal,
            int bigQuestionTotal) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
        this.gpa = gpa;
        this.smallQuestionTotal = smallQuestionTotal;
        this.bigQuestionTotal = bigQuestionTotal;
        this.queueNumber = queueCounter++;
    }

    public static String[] getPriorities() {
        return new String[]{
                "default (provided by supervisors)",
                "first-name",
                "last-name",
                "student-id",
                "gpa",
                "number-of-small-questions",
                "number-of-big-questions",
                "number-of-small-and-big-questions"
        };
    }

    public static void setCompareToPriority(String p) {
        compareToPriority = p;
    }

    public int getQueueNumber() {
        return queueNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getStudentId() {
        return studentId;
    }

    public double getGpa() {
        return gpa;
    }

    public int getSmallQuestionTotal() {
        return smallQuestionTotal;
    }

    public int getBigQuestionTotal() {
        return bigQuestionTotal;
    }

    public int getAllQuestionTotal() {
        return smallQuestionTotal + bigQuestionTotal;
    }

    @Override
    public int compareTo(Student student) {
        return switch (compareToPriority) {
            case "first-name" -> Comparator.comparing(Student::getFirstName)
                    .thenComparing(Student::getFirstName)
                    .thenComparing(Student::getStudentId)
                    .compare(this, student);
            case "last-name" -> Comparator.comparing(Student::getLastName)
                    .thenComparing(Student::getFirstName)
                    .thenComparing(Student::getStudentId)
                    .compare(this, student);
            case "student-id" -> Comparator.comparing(Student::getStudentId)
                    .thenComparing(Student::getLastName)
                    .compare(this, student);
            case "gpa" -> Comparator.comparing(Student::getGpa)
                    .thenComparing(Student::getStudentId)
                    .compare(this, student);
            case "number-of-small-questions" -> Comparator.comparing(Student::getSmallQuestionTotal)
                    .thenComparing(Student::getGpa)
                    .thenComparing(Student::getStudentId)
                    .compare(this, student);
            case "number-of-big-questions" -> Comparator.comparing(Student::getBigQuestionTotal)
                    .thenComparing(Student::getGpa)
                    .thenComparing(Student::getStudentId)
                    .compare(this, student);
            case "number-of-small-and-big-questions" -> Comparator
                    .comparing(Student::getAllQuestionTotal)
                    .thenComparing(Student::getBigQuestionTotal)
                    .thenComparing(Student::getSmallQuestionTotal)
                    .thenComparing(Student::getGpa)
                    .thenComparing(Student::getStudentId)
                    .compare(this, student);
            default -> 0;
        };
    }
}
