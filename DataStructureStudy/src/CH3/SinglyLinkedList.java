package CH3;

public class SinglyLinkedList<E> {

    private static class Node<E> {
        private Node<E> next;
        private E element;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public E getElement() {
            return element;
        }


    }

    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E first() {
        if (isEmpty()) return null;
        return head.getElement();
    }

    public E last() {
        if (isEmpty()) return null;
        return tail.getElement();
    }

    public void addFirst(E element) {
        head = new Node<>(element, head);
        if (size == 0) tail = head;
        size++;
    }

    public void addLast(E element) {
        Node<E> newest = new Node<>(element, null);
        if (isEmpty())
            head = newest;
        else tail.setNext(newest);
        tail = newest;
        size++;
    }

    public E removeFirst() {
        if (isEmpty()) return null;
        E removed = head.getElement();
        head = head.getNext();
        size--;
        if (size == 0)
            tail = null;
        return removed;
    }
}
