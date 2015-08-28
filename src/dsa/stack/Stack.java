package dsa.stack;

/**
 * Created by szagoret on 8/28/2015.
 * A collection of objects that are inserted and removed
 * according to the last-in first-out principle.
 * Although similar purpose, this interface differs from
 * java.util.Stack
 */
public interface Stack<E> {

    /**
     * returns the number of elements in the stack
     */
    int size();

    /**
     * Tests whether the stack is empty
     *
     * @return true if stack is empty, false otherwise
     */
    boolean isEmpty();

    /**
     * Inserts an element at the top of the stack.
     *
     * @param e the element to be inserted
     */
    void push(E e);

    /**
     * Returns, but does not remove, the element at the top of the stack.
     *
     * @return top element in the stack (or null if empty)
     */
    E top();

    /**
     * Removes and returns the top element from the stack
     *
     * @return element removed (or null if empty)
     */
    E pop();
}
