package assignment04PartC;

public class C1 {

    public static void main(String[] args) {
        QueueInterface<String> myQueue = new LinkedQueue<>();
        myQueue.enqueue("Jane");
        System.out.println(myQueue);
        myQueue.enqueue("Jess");
        System.out.println(myQueue);
        myQueue.enqueue("Jon");
        System.out.println(myQueue);
        myQueue.enqueue(myQueue.dequeue());
        System.out.println(myQueue);
        myQueue.enqueue(myQueue.getFront());
        System.out.println(myQueue);
        myQueue.enqueue("Jim");
        System.out.println(myQueue);
        String name = myQueue.dequeue();
        System.out.println(myQueue);
        myQueue.enqueue(myQueue.getFront());
        System.out.println(myQueue);
    }
}
