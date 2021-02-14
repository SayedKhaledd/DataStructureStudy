package CH3;

public class SinglyLinkedList<E> implements Cloneable {

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

    public E removeLast() {
        if (isEmpty()) return null;
        E removed = tail.getElement();
        Node<E> temp = head;
        while (temp.next == tail) {
            temp = temp.next;
        }

        tail = temp;
        tail.next = null;

        return removed;
    }

    public boolean equals(Object o) {
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        SinglyLinkedList<E> other = (SinglyLinkedList<E>) o; // use nonparameterized type
        if (size != other.size) return false;
        Node<E> walkA = head; // traverse the primary list
        Node<E> walkB = other.head; // traverse the secondary list
        while (walkA != null) {
            if (!walkA.getElement().equals(walkB.getElement())) return false; //mismatch
            walkA = walkA.getNext();
            walkB = walkB.getNext();
        }
        return true; // if we reach this, everything matched successfully
    }

    public SinglyLinkedList<E> clone() throws CloneNotSupportedException {
// always use inherited Object.clone() to create the initial copy
        SinglyLinkedList<E> other = (SinglyLinkedList<E>) super.clone(); // safe cast
        if (size > 0) { // we need independent chain of nodes
            other.head = new Node<>(head.getElement(), null);
            Node<E> walk = head.getNext(); // walk through remainder of original list
            Node<E> otherTail = other.head; // remember most recently created node
            while (walk != null) { // make a new node storing same element
                Node<E> newest = new Node<>(walk.getElement(), null);
                otherTail.setNext(newest); // link previous node to this one
                otherTail = newest;
                walk = walk.getNext();
            }
        }
        return other;
    }
}
