/**
 * 
 * Node with single link functionality.
 * <p>
 * Used to create nodes used in Single Linked Lists.
 * <p>
 * @author Santiago Gonzalez/Daniel Lara
 * @param <E>
 */
public class Node<E>{
	/**
	 * Reference to the next node in the list.
	 */
	Node<E> next;
	/**
	 * Generic value to be stored in node.
	 */
	E data;

	public Node(E dataValue) {
		next = null;
		data = dataValue;
	}

	public Node(E dataValue, Node<E> nextValue) {
		next = nextValue;
		data = dataValue;
	}

	public E getData() {
		return data;
	}

	public void setData(E dataValue) {
		data = dataValue;
	}

	public Node<E> getNext() {
		return next;
	}

	public void setNext(Node<E> nextValue) {
		next = nextValue;
	}
}