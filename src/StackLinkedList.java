/**
 *  Singly Linked List 
 * <p>
 * Contains all methods required to simulate a stack structure using 
 * a Singly Linked List. Based on example found on:
 * http://crunchify.com/how-to-implement-a-linkedlist-class-from-scratch-in-java/
 * <p>
 * @author Santiago Gonzalez/Daniel Lara
 */
public class StackLinkedList<E> extends AbstractLista<E> {
	/**
	 * Reference to head node.
	 */
	private Node<E> lead;
	
	public StackLinkedList(){
		setLead(new Node<E>(null));
		AbstractLista.contador = 0;
	}
	
	@Override
	public void push(E item) {
		add(item);
	}

	@Override
	public E pop() {
		E valor = get();
		remove();
		return valor;
	}

	@Override
	public E peek() {
		return get();
	}

	@Override
	public boolean empty() {
		return this.size()==0;
	}


	@Override
	public void add(E e) {
        Node<E> temp = new Node<E>(e);
        Node<E> actual = lead;
        while (actual.getNext() != null) {
            actual = actual.getNext();
        }
        actual.setNext(temp);
		AbstractLista.contador ++;	
	}
	
    public E get()
    {
    	int index = (this.size());
        Node<E> actual = lead.getNext();
        for (int i = 1; i < index; i++) {
            if (actual.getNext() == null)
                return null;
            actual = actual.getNext();
        }
        return (E) actual.getData();
    }
    @Override
	public void remove() {
        Node<E> actual = lead;
    	int index = (this.size());
        for (int i = 1; i < index; i++) {
            if (actual.getNext() == null)
                return;
 
            actual = actual.getNext();
        }
        actual.setNext(actual.getNext().getNext());
        AbstractLista.contador--; 	
	}

	public Node<E> getLead() {
		return lead;
	}

	public void setLead(Node<E> lead) {
		this.lead = lead;
	}

}
