package assignment04PartC;

public class C1 {

    public static void main(String[] args) {
        QueueInterface<String> myQueue = new LinkedQueue<>();
        myQueue.enqueue("Jane");
        System.out.println(myQueue);
        myQueue.enqueue("Jess");
        myQueue.enqueue("Jon");
        myQueue.enqueue(myQueue.dequeue());
        myQueue.enqueue(myQueue.getFront());
        myQueue.enqueue("Jim");
        String name = myQueue.dequeue();
        myQueue.enqueue(myQueue.getFront());
    }
}
