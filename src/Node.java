public class Node<E>{
        // reference to the next node in the chain,
        // or null if there isn't one.
        Node<E> next;
        // data carried by this node.
        // could be of any type you need.
        E data;
 
        // Node constructor
        public Node(Object dataValue) {
            next = null;
            data = (E) dataValue;
        }
 
        // another Node constructor if we want to
        // specify the node to point to.
        public Node(Object dataValue, Node<E> nextValue) {
            next = nextValue;
            data = (E) dataValue;
        }
 
        // these methods should be self-explanatory
        public E getData() {
            return data;
        }
 
        public void setData(Object dataValue) {
            data = (E) dataValue;
        }
 
        public Node<E> getNext() {
            return next;
        }
 
        public void setNext(Node<E> nextValue) {
            next = nextValue;
        }
    }