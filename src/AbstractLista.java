
/**
 * 
 * Abstract implementation of "Lista"
 * <p>
 * Abstract class with functionalities for implementations of "Lista" which are
 * independent of the type of implementation used. 
 * <p>
 * @author Santiago Gonzalez/Daniel Lara
 * @param <E>
 */
abstract public class AbstractLista<E> implements Lista<E>{
	/**
	 * Counter for List size control.
	 */
	static int contador = 0;
	/**
	 * 
	 * @return int List size.
	 */
	public int size(){
		return contador;
	}
}
