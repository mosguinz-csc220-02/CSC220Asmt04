package assignment04PartE;

/**
 * Part E
 */

public final class Student implements Comparable<Student> {

    String firstName;
    String lastName;
    int studentId;
    double gpa;
    int smallQuestionTotal;
    int bigQuestionTotal;

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
}