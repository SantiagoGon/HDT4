


public class StackLinkedList<E> extends AbstractLista<E> {
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
        // starting at the head node, crawl to the end of the list
        while (actual.getNext() != null) {
            actual = actual.getNext();
        }
        // the last node's "next" reference set to our new node
        actual.setNext(temp);
		AbstractLista.contador ++;// increment the number of elements variable		
	}
	
    public E get()
    // returns the element at the specified position in this list.
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
        AbstractLista.contador--; // decrement the number of elements variable		
	}

	@Override
	public void find() {
		
	}

	public Node<E> getLead() {
		return lead;
	}

	public void setLead(Node<E> lead) {
		this.lead = lead;
	}

}
