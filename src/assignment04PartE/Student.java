package assignment04PartE;

/**
 * Part E
 */

public final class Student implements Comparable<Student> {

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
}