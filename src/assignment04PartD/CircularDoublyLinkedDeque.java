package assignment04PartD;

public class CircularDoublyLinkedDeque<T> implements DequeInterface<T> {

    private DoublyLinkedNode firstNode;

    public CircularDoublyLinkedDeque() {
        firstNode = null;
    }

    /**
     * Adds a new entry to the front/back of this dequeue.
     *
     * @param newEntry An object to be added.
     */
    @Override
    public void addToFront(T newEntry) {
        addToBack(newEntry);
        firstNode = firstNode.previous;
    }

    @Override
    public void addToBack(T newEntry) {
        DoublyLinkedNode newNode = new DoublyLinkedNode(newEntry);
        if (isEmpty()) {
            firstNode = newNode;
            firstNode.previous = firstNode.next = firstNode;
        } else {
            newNode.next = firstNode;
            newNode.previous = firstNode.previous;
            firstNode.previous.next = newNode;
            firstNode.previous = newNode;
        }
    }

    /**
     * Removes and returns the front/back entry of this dequeue.
     *
     * @return The object at the front/back of the dequeue.
     * @throws EmptyQueueException if the dequeue is empty before the operation.
     */
    @Override
    public T removeFront() {
        if (isEmpty()) {
            throw new EmptyQueueException();
        }
        firstNode = firstNode.next;
        return removeBack();
    }

    @Override
    public T removeBack() {
        if (isEmpty()) {
            throw new EmptyQueueException();
        }
        T backData = firstNode.previous.data;
        firstNode.previous = firstNode.previous.previous;
        firstNode.previous.next = firstNode;
        return backData;
    }

    /**
     * Retrieves the front/back entry of this dequeue.
     *
     * @return The object at the front/back of the dequeue.
     * @throws EmptyQueueException if the dequeue is empty before the operation.
     */
    @Override
    public T getFront() {
        return firstNode.data;
    }

    @Override
    public T getBack() {
        return firstNode.previous.data;
    }

    /**
     * Detects whether this dequeue is empty.
     *
     * @return True if the queue is empty, or false otherwise.
     */
    @Override
    public boolean isEmpty() {
        return firstNode == null;
    }

    /**
     * Removes all entries from this dequeue.
     */
    @Override
    public void clear() {
        firstNode = null;
    }

    private class DoublyLinkedNode {

        private T data;
        private DoublyLinkedNode next;
        private DoublyLinkedNode previous;

        private DoublyLinkedNode(T data) {
            this.data = data;
            this.next = this.previous = null;
        }

        private DoublyLinkedNode(DoublyLinkedNode previous, T data, DoublyLinkedNode next) {
            this.previous = previous;
            this.data = data;
            this.next = next;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public DoublyLinkedNode getNext() {
            return next;
        }

        public void setNext(DoublyLinkedNode next) {
            this.next = next;
        }

        public DoublyLinkedNode getPrevious() {
            return previous;
        }

        public void setPrevious(DoublyLinkedNode previous) {
            this.previous = previous;
        }
    }
}
