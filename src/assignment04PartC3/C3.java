package assignment04PartC3;

public class C3 {

    public static void main(String[] args) {
        PriorityQueueInterface<String> myPriorityQueue = new LinkedPriorityQueue<>();
        System.out.println(myPriorityQueue);
        myPriorityQueue.add("Jim");
        System.out.println(myPriorityQueue);
        myPriorityQueue.add("Josh");
        System.out.println(myPriorityQueue);
        myPriorityQueue.add("Jon");
        System.out.println(myPriorityQueue);
        myPriorityQueue.add("Jane");
        System.out.println(myPriorityQueue);
        String name = myPriorityQueue.remove();
        System.out.println(myPriorityQueue);
        myPriorityQueue.add(name);
        System.out.println(myPriorityQueue);
        myPriorityQueue.add(myPriorityQueue.peek());
        System.out.println(myPriorityQueue);
        myPriorityQueue.add("Jose");
        System.out.println(myPriorityQueue);
        myPriorityQueue.remove();
        System.out.println(myPriorityQueue);
    }
}
