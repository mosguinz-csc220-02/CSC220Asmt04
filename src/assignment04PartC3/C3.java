package assignment04PartC3;

public class C3 {

    public static void main(String[] args) {
        PriorityQueueInterface<String> myPriorityQueue = new LinkedPriorityQueue<>();
        myPriorityQueue.add("Jim");
        myPriorityQueue.add("Josh");
        myPriorityQueue.add("Jon");
        myPriorityQueue.add("Jane");
        String name = myPriorityQueue.remove();
        myPriorityQueue.add(name);
        myPriorityQueue.add(myPriorityQueue.peek());
        myPriorityQueue.add("Jose");
        myPriorityQueue.remove();
    }
}
