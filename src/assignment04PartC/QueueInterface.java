package assignment04PartC;

/**
 * An interface for the ADT queue.
 *
 * @param <T>
 * @author Frank M. Carrano
 * @author Timothy M. Henry
 * @version 4.0
 */
public interface QueueInterface<T> {

    /**
     * Adds a new entry to the back of this queue.
     *
     * @param newEntry An object to be added.
     */
    public void enqueue(T newEntry);

    /**
     * Removes and returns the entry at the front of this queue.
     *
     * @return The object at the front of the queue.
     */
    public T dequeue();

    /**
     * Retrieves the entry at the front of this queue.
     *
     * @return The object at the front of the queue.
     */
    public T getFront();

    /**
     * Detects whether this queue is empty.
     *
     * @return True if the queue is empty, or false otherwise.
     */
    public boolean isEmpty();

    /**
     * Removes all entries from this queue.
     */
    public void clear();
} // end QueueInterface
