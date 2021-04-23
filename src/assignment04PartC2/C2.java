package assignment04PartC2;

public class C2 {

    public static void main(String[] args) {
        DequeInterface<String> myDeque = new LinkedDeque<>();
        myDeque.addToFront("Jim");
        myDeque.addToFront("Jess");
        myDeque.addToBack("Jen");
        myDeque.addToBack("Josh");
        String name = myDeque.removeFront();
        myDeque.addToBack(name);
        myDeque.addToBack(myDeque.getFront());
        myDeque.addToFront(myDeque.removeBack());
        myDeque.addToFront(myDeque.getBack());
    }
}
