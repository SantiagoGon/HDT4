import java.util.ArrayList;

/**
 *  
 * <p>
 * Contains all methods required to simulate a stack structure using 
 * the ArrayList type for storage.
 * <p>
 * @author Santiago Gonzalez/Daniel Lara
 */

public class StackArrayList<E> extends StackBase<E>
{
	/**
	 * This is the stack; a collection of generic items.
	 */
	protected ArrayList<E> data;
	
	/**
	 * Constructor method.
	 * @post Constructs a new & empty stack.
	 */
	public StackArrayList()
	{
		data = new ArrayList<E>();
	}

	/**
	 * 
	 * @param item item to be pushed.
	 * @post item is added to stack; will be popped if no intervening push.
	 */
	@Override
	public void push(E item)
	{
		data.add(item);
	}
	
	/**
	 * 
	 * @pre stack is not empty.
	 * @post most recently pushed item is removed and returned.
	 * @return <E> Most recently pushed item.
	 */
	@Override
	public E pop()
	{
		return data.remove(size()-1);
	}

	/**
	 * 
	 * @pre stack is not empty.
	 * @post most recently pushed item is returned.
	 * @return <E> Most recently pushed item without removing.
	 */ 
	@Override
	public E peek()
	{
		return data.get(size() - 1);
	}
	
	/**
	 * 
	 * @post counts items in stack.
	 * @return int Amount of items in stack.
	 */
	@Override
	public int size()
	{
		return data.size();
	}
	
	
}