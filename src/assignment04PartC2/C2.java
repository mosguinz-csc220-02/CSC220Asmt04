package assignment04PartC2;

public class C2 {

    public static void main(String[] args) {
        System.out.println("C2");
        DequeInterface<String> myDeque = new LinkedDeque<>();
        System.out.println(myDeque);
        myDeque.addToFront("Jim");
        System.out.println(myDeque);
        myDeque.addToFront("Jess");
        System.out.println(myDeque);
        myDeque.addToBack("Jen");
        System.out.println(myDeque);
        myDeque.addToBack("Josh");
        System.out.println(myDeque);
        String name = myDeque.removeFront();
        System.out.println(myDeque);
        myDeque.addToBack(name);
        System.out.println(myDeque);
        myDeque.addToBack(myDeque.getFront());
        System.out.println(myDeque);
        myDeque.addToFront(myDeque.removeBack());
        System.out.println(myDeque);
        myDeque.addToFront(myDeque.getBack());
        System.out.println(myDeque);
    }
}
