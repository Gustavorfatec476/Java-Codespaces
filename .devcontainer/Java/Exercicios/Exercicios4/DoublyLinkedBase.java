package Exercicios4;

public class DoublyLinkedBase<E> {

    public static class Node<E> {
        private E element;
        private Node<E> prev;
        private Node<E> next;

        public Node(E element, Node<E> prev, Node<E> next) {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }

        public Node<E> getNext() {  
            return next;
        }
    
        public E getElement() {  
            return element;
        }
    }

    private Node<E> header;
    private Node<E> trailer;
    private int size;

    public DoublyLinkedBase() {
        header = new Node<>(null, null, null);
        trailer = new Node<>(null, header, null);
        header.next = trailer;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public Node<E> getHeader(){
        return header;
    }

    public Node<E> getTrailer(){
        return trailer;
    }


    private Node<E> insertBetween(E e, Node<E> predecessor, Node<E> successor) {
        Node<E> newest = new Node<>(e, predecessor, successor);
        predecessor.next = newest;
        successor.prev = newest;
        size++;
        return newest;
    }

    private E deleteNode(Node<E> node) {
        Node<E> predecessor = node.prev;
        Node<E> successor = node.next;
        predecessor.next = successor;
        successor.prev = predecessor;
        size--;
        E element = node.element;
        node.prev = node.next = null; 
        return element;
    }

    public Node<E> addFirst(E e) {
        return insertBetween(e, header, header.next);
    }
    
    public Node<E> addLast(E e) {
        return insertBetween(e, trailer.prev, trailer);
    }

    public Node<E> addAfter(Node<E> node, E e) {
        return insertBetween(e, node, node.next);
    }

    public E removeFirst() {
        if (isEmpty()) return null;
        return deleteNode(header.next);
    }
    
    public E removeLast() {
        if (isEmpty()) return null;
        return deleteNode(trailer.prev);
    }

    public E removeNode(Node<E> node) {
        if (node == header || node == trailer) {
            return null; // Não pode remover o header ou o trailer
        }
        return deleteNode(node);
    }

    public void printNodeElements() {
        Node<E> current = header.getNext();
        while (current != trailer) { 
            System.out.println(current.getElement());
            current = current.getNext();
        }
    }

}



