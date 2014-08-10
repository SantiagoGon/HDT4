/**
 * Used for implementation of Factory design pattern.
 * <p>
 * Uses Factory design pattern to pick one implementation of stacks.
 * <p>
 * @author Santiago Gonzalez/Daniel Lara
 */
class StackFactory<E> {
	/**
	 * @param input Choice of implementation.
	 * @post Creates and returns an instance of a Stack implementation.
	 * @return Stack<E> ;different implementation depending on user input (ArrayList or Vector).
	 */
	public Stack<E> getStack(String input){
		switch(input){
		case("ArrayList"):
			return new StackArrayList<E>();
		case("Vector"):
			return new StackVector<E>();
		case("LinkedList"):
			return new StackLinkedList<E>();
		case("DoublyLinkedList"):
			return new StackDoublyLinkedList<E>();
		case("Circular"):
			return new StackCircularlyLinkedList<E>();
		default:
			System.out.println("Ingreso invalido. Finalizando programa...");
			System.exit(0);
			return null;
		}
	}
}
