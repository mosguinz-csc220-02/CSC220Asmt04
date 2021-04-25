package assignment04PartE;

import java.util.Comparator;
import java.util.List;

/**
 * Part E
 */

public final class Student implements Comparable<Student> {

    private static final List<Integer> SUPERVISOR_PRIORITY_BY_STUDENT_ID = List.of(
            1002, 1001, 1004, 1007, 1003, 1005, 1006
    );

    private static String compareToPriority;

    private final String firstName;
    private final String lastName;
    private final int studentId;
    private final double gpa;
    private final int smallQuestionTotal;
    private final int bigQuestionTotal;

    public Student(String firstName, String lastName, int studentId, double gpa,
            int smallQuestionTotal,
            int bigQuestionTotal) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
        this.gpa = gpa;
        this.smallQuestionTotal = smallQuestionTotal;
        this.bigQuestionTotal = bigQuestionTotal;
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

    /**
     * @return The priority level as defined by the supervisor, where 1 is of the highest priority.
     */
    public int getSupervisorPriority() {
        return !SUPERVISOR_PRIORITY_BY_STUDENT_ID.contains(studentId)
                ? SUPERVISOR_PRIORITY_BY_STUDENT_ID.size()
                : SUPERVISOR_PRIORITY_BY_STUDENT_ID.indexOf(studentId) + 1;
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
            default -> Comparator.comparing(Student::getSupervisorPriority)
                    .compare(this, student);
        };
    }
}
