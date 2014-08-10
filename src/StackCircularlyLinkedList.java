/**
 *  Circular Linked List 
 * <p>
 * Contains all methods required to simulate a stack structure using 
 * a Circularly Linked List. 
 * <p>
 * @author Santiago Gonzalez/Daniel Lara
 */
public class StackCircularlyLinkedList<E> extends AbstractLista<E> {
	/**
	 * Tail pointer.
	 */
	private DoubleNode<E> pointer;
	
	public StackCircularlyLinkedList() {
		pointer = null;
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
		DoubleNode<E> head;
		DoubleNode<E> node = new DoubleNode<E>(item);
		if(AbstractLista.contador == 0){
			node.next = node;
			pointer = node;
		} else{
			head = pointer.next;
			node.next = head;
			pointer.next = node;
		}
		AbstractLista.contador++;
			
	}

	@Override
	public E pop() {
		DoubleNode<E> head;
		E data;
		if(AbstractLista.contador == 0)
			return null;
		head=pointer.next;
		data = head.data;
		if(head == pointer)
			pointer = null;
		else
			pointer.next = head.next;
		AbstractLista.contador--;
		return data;
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
