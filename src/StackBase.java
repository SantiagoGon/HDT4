/**
 * Implementacion abstracta de la interfaz para pilas
 * <p>
 * Contiene metodos especificos que son independientes
 * del tipo de implementacion de la interfaz stack.
 * <p>
 * @author Santiago Gonzalez/Daniel Lara
 */

abstract public class StackBase<E> implements Stack<E> {
	/**
	 *
	 * @pre
	 * @post Verifica si la coleccion de datos esta vacia.
	 * @return Boolean indicating whether collection is empty or not.
	 */
	public boolean empty(){
		return size() == 0;
	}
}
