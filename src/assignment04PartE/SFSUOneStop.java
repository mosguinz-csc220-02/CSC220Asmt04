package assignment04PartE;

/**
 * Part E
 */

import java.util.PriorityQueue;

public class SFSUOneStop {

    private static final String tableFormat = "%10s%-9s%-9s%-9s%-9.2f%-9s%s%n";

    public static void display(PriorityQueue<Student> pq, String priority) {
        System.out.printf("Priority: %s%n", priority);

        while (pq.peek() != null) {
            Student s = pq.poll();
            System.out.printf(tableFormat, "", s.getFirstName(), s.getLastName(), s.getStudentId(),
                    s.getGpa(), s.getSmallQuestionTotal(), s.getBigQuestionTotal());
        }
        System.out.println();
    }
}
