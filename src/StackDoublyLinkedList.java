/**
 *  Doubly Linked List 
 * <p>
 * Contains all methods required to simulate a stack structure using 
 * a Doubly Linked List. 
 * <p>
 * @author Santiago Gonzalez/Daniel Lara
 */
public class StackDoublyLinkedList<E> extends AbstractLista<E>{
	/**
	 * Reference to first node.
	 */
	private DoubleNode<E> first;
	/**
	 * Reference to last node.
	 */
	private DoubleNode<E> last;
	
	public StackDoublyLinkedList() {
		first = null;
		last = null;
	}

	@Override
	public void add(E e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void push(E item) {
	    DoubleNode<E> newNode = new DoubleNode<E>(item);
	    if (first == null){
	      last = newNode;
	    }else{
	      first.previous = newNode;
	    }
	    newNode.next = first;
	    first = newNode;	
	    AbstractLista.contador++;
	}

	@Override
	public E pop() {
		if(AbstractLista.contador == 0)
			return null;
	    DoubleNode<E> temp = first;
	    if (first.next == null){
	      last = null;
	    }else{
	      first.next.previous = null;
	    }
	    first = first.next;
	    return temp.getData();
	}

	@Override
	public E peek() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean empty() {
		// TODO Auto-generated method stub
		return false;
	}

}
