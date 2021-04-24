package assignment04PartD;

/**
 *
 * Part D
 *
 * Please do not change any code in this file.
 *
 */

public class DequeTester {
    public static void main(String[] args) {
        DequeInterface<String> myDeque = new CircularDoublyLinkedDeque<>();
        System.out.println("Empty deque: " + myDeque.isEmpty());

        myDeque.addToFront("Mickey");
        myDeque.addToFront("Minnie");
        myDeque.addToBack("Donald");
        myDeque.addToFront("Daisy");
        myDeque.addToBack("Goofy");
        myDeque.addToBack("Sylvester");
        myDeque.addToFront("Tom");
        myDeque.addToFront("Jerry");

        String front, back;
        front = myDeque.getFront();
        System.out.print("[FRONT] ");
        System.out.print(front + " << ");
        myDeque.removeFront();
        front = myDeque.removeFront();
        System.out.print(front + " << ");
        myDeque.removeFront();
        front = myDeque.getFront();
        System.out.print(front + " << ");
        myDeque.removeFront();
        front = myDeque.removeFront();
        System.out.print(front + " << ...\n");

        back = myDeque.getBack();
        System.out.print(" [BACK] ");
        System.out.print(back + " >> ");
        myDeque.removeBack();
        back = myDeque.removeBack();
        System.out.print(back + " >> ");
        back = myDeque.getBack();
        System.out.print(back + " >> ...\n\n");

        myDeque.clear();
        System.out.println("Empty deque: " + myDeque.isEmpty());

        try {
            front = myDeque.removeFront();
        } // end try
        catch (EmptyQueueException e) {
            System.err.println("-> removeFront found deque empty");
        } // end catch

        try {
            front = myDeque.removeBack();
        } // end try
        catch (EmptyQueueException e) {
            System.err.println("-> removeBack found deque empty");
        } // end catch

        System.out.println("Sayōnara");
    }  // end main
}  // end Driver


