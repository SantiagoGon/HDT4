/**
 * 
 * Node with double link functionality.
 * <p>
 * Used to create nodes used in Doubly Linked Lists.
 * <p>
 * @author Santiago Gonzalez/Daniel Lara
 * @param <E>
 */
public class DoubleNode<E> {
	/**
	 * Reference to next node in list.
	 */
	DoubleNode<E> next;
	/**
	 * Reference to previous node in list.
	 */
	DoubleNode<E> previous;
	/**
	 * Generic value to be stored in node.
	 */
	E data;
	
	public DoubleNode(E dataValue) {
		data = dataValue;
	}
	
	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}
	
}
