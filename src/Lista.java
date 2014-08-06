
public interface Lista<E> extends Stack<E>{
	/**
	 * 
	 * @param item item to be pushed.
	 * @post item is added to stack; will be popped if no intervening push.
	 */
	public void push(E item);

	/**
	 * 
	 * @pre stack is not empty.
	 * @post most recently pushed item is removed and returned.
	 * @return <E> Most recently pushed item.
	 */
	public E pop();

	/**
	 * 
	 * @pre stack is not empty.
	 * @post most recently pushed item is returned.
	 * @return <E> Most recently pushed item without removing.
	 */
	public E peek();

	/**
	 * 
	 * @post checks whether stack is empty or not. 
	 * @return boolean True if empty, False if otherwise.
	 */
	public boolean empty();

	/**
	 * 
	 * @post counts items in stack.
	 * @return int Amount of items in stack.
	 */
	public int size();
	
	public void add(E e);
	//pre: 
	//post: item e is added to the end of the list
	public void remove();
	//pre: 	
	//post: item e is added to the specified index on the list.
	public void find();
	//pre: 
	//post: 
}
