/**
 * 
 * Contract for list data type.
 * <p>
 * Constrains all the basic operations for a list structure.
 * <p>
 * @author Santiago Gonzalez/Daniel Lara
 * @param <E>
 */
public interface Lista<E> extends Stack<E>{
	/**
	 * 
	 * @post returns the amount of elements in the list.
	 */
	public int size();
	
	/**
	 * 
	 * @pre 
	 * @post item is added to the list.
	 * @param E Value to be added to list
	 */
	public void add(E e);

	/**
	 * 
	 * @pre
	 * @post: removes specified item.
	 */
	public void remove();

}
