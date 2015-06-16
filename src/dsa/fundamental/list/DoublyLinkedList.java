package dsa.fundamental.list;

/**
 *
 * @author szagoret
 */
public class DoublyLinkedList<E> {

    // ----------- nested Node class ------------
    private static class Node<E> {

        private E element; // reference to the element stored at this node
        private Node<E> prev; // reference to the previous node in this list
        private Node<E> next; // reference to the subsequent node in the list

        public Node(E element, Node<E> prev, Node<E> next) {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }

    }
    //-------------------------------------------

    // instance variables of the DoublyLinkedList
    private Node<E> header; // header sentinel
    private Node<E> trailer; // trailer sentinel
    private int size = 0;

    /**
     * Constructs a new empty list
     */
    public DoublyLinkedList() {
        header = new Node<>(null, null, null); // create header
        trailer = new Node<>(null, header, null); // trailer is preceded by header
        header.setNext(trailer);
    }

    /**
     * Returns the number of elements in the linked list
     */
    public int size() {
        return size;
    }

    /**
     * Tests whether the linked list is empty
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Returns (but does not remove) the first element of the list
     */
    public E first() {
        if (isEmpty()) {
            return null;
        }
        return header.getNext().getElement();
    }

    /**
     * Returns (but does not remove) the last element of the list.
     */
    public E last() {
        if (isEmpty()) {
            return null;
        }
        return trailer.getPrev().getElement(); // last element is before trailer
    }

    // public update methods
    /**
     * Adds element e to the front of the list
     */
    public void addFirst(E e) {
        addBetween(e, header, header.getNext()); // place just after the header
    }

    /**
     * adds element e to the end of the list
     */
    public void addLast(E e) {
        addBetween(e, trailer.getPrev(), trailer); // place just before the trailer
    }

    /**
     * Removes and returns the first element of the list
     */
    public E removeFirst() {
        if (isEmpty()) {
            return null;// nothing to remove
        }
        return remove(header.getNext()); // last element is before trailer
    }

    /**
     * Removes and returns the last element of the list
     */
    public E removeLast() {
        if (isEmpty()) {
            return null; // nothing to remove
        }
        return remove(trailer.getPrev()); // last element is before trailer
    }

    // private update methods
    /**
     * Adds element e to the linked list in between the given nodes
     */
    private void addBetween(E e, Node<E> predecesor, Node<E> successor) {
        // create and link a new node
        Node<E> newest = new Node<>(e, predecesor, successor);
        predecesor.setNext(newest);
        successor.setPrev(newest);
        size++;
    }

    /**
     * Removes the given node from the list and return its element
     */
    private E remove(Node<E> node) {
        Node<E> predecessor = node.getPrev();
        Node<E> successor = node.getNext();
        predecessor.setNext(successor);
        successor.setPrev(predecessor);
        size--;
        return node.getElement();
    }
}
