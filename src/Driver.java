import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;


/**
 * Driver class for Postfix Calculator
 * <p>
 * Implements the basic principles of Factory and Singleton design patterns
 * to build a Postfix calculator employing various ADT such as stacks and
 * lists to carry out the task at hand. The user picks which ADT to use.
 * <p>
 * @author Santiago Gonzalez/Daniel Lara
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		menu();
		int entrada = userInput();
		Calculadora calc;
		switch(entrada){
		case(1):
			calc = Calculadora.Instance("ArrayList");
		break;
		case(2):
			calc = Calculadora.Instance("Vector");
		break;
		case(3):
			menuListas();
		int num_lista = userInput();
		if(num_lista == 1)
			calc = Calculadora.Instance("LinkedList");
		else if(num_lista == 2)
			calc = Calculadora.Instance("DoublyLinkedList");
		else
			calc = Calculadora.Instance("Circular");

		break;
		default:
			calc = Calculadora.Instance("default");
			break;
		}
		//Creacion de calculadora con archivo provisto.
		//Llevar a cabo lectura y operacion de instrucciones.
		calc.operar();
		//Imprimir instrucciones para verificacion de lectura.
		System.out.println("Instrucciones: ");
		for(int i = 0; i < calc.getInstruccion().length; i++){
			System.out.println(calc.getInstruccion()[i]);
		}
		//Despligue de resultado final.
		System.out.println("\n\n -------Resultado: "+ calc.getResultado());
	}

	/**
	 * @post Prints menu for user interface.
	 */
	public static void menu(){
		System.out.println("\n" + "***---***Bienvenido al sistema de Cálculo Postfix***---***" + "\n\n");
		System.out.println("Escoja una implementacion de pila:\n");
		System.out.println("1. ArrayList\n");
		System.out.println("2. Vector\n");
		System.out.println("3. Lista\n");
		System.out.println("Ingrese el numero de su eleccion:\n");
	}
	public static void menuListas(){
		System.out.println("Escoja un tipo de lista:\n");
		System.out.println("1. Simplemente encadenada\n");
		System.out.println("2. Doblemente encadenada\n");
		System.out.println("3. Circular\n");
		System.out.println("Ingrese el numero de su eleccion:\n");
	}
	public static int userInput(){
		/**
		 * Scanner for user input.
		 */
		Scanner in = new Scanner(System.in);
		/**
		 * Variable to store user input.
		 */
		int entrada=0;
		try{
			entrada = in.nextInt();
		}
		catch(InputMismatchException e){
			JOptionPane.showMessageDialog(null, "Ingreso invalido", "ERROR", JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		}
		return entrada;
	}

}
