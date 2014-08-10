import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class Calculadora {
	/**
	 * File containing the arithmetical instructions.
	 */
	private File txt;					
	/**
	 * Array used to store each line as an instruction.
	 */
	private char[] instruccion;			
	/**
	 * Implementation of stack structure.
	 */
	private Stack<Integer> pila;	
	/**
	 * Stores the result obtained from each line.
	 */
	int resultado = 0;	
	/**
	 * Flag variable for Singleton design pattern. 
	 */
	static boolean instanciado = false;
	
	/**
	 * Constructor method.
	 * @param nombre Name of the file to be read.
	 * @param stack Implementation of stack structure used in the alogrithm.
	 */
	private Calculadora(String nombre, String stack){
		StackFactory<Integer> sFactory = new StackFactory<Integer>();
		pila = sFactory.getStack(stack);
		instruccion = new char[13];
		pila.push(resultado);
		try{
			txt = new File(nombre);
		}
		catch(NullPointerException e){
			JOptionPane.showMessageDialog(null, "No existe el archivo.", "ERROR", 
					JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		}
	    try{
	    	Scanner s = new Scanner(txt);
	        while (s.hasNextLine()) {
	            instruccion = s.nextLine().toCharArray();
	        }
	        s.close();
	    } 
	    catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Archivo no encontrado.", "ERROR", 
					JOptionPane.ERROR_MESSAGE);
			System.exit(0);
	    }
	}
	
	/**
	 * Singleton method. Ensures only one instance can be created.
	 * @param stack Stack implementation to be used.
	 * @return Calculadora, null if already instanced. 
	 */
	public static Calculadora Instance(String stack){
		if(!instanciado){
			instanciado = true;
			return new Calculadora("postfix.txt", stack);
		}
		else
			return null;
		
	}
	
	/**
	 * Main algorithm. Contains instruction to simulate a Postfix calculator.
	 */
	public void operar(){
		for(int i = 0; i < instruccion.length; i++){
			switch(instruccion[i]){
				case('+'):
					suma();
					break;
				case('*'):
					multiplicacion();
					break;
				case('/'):
					division();
					break;
				case('-'):
					resta();
					break;
				case(' '):
					break;
				/**
				 * Done for every digit found.
				 */
				default:
					int num = Character.getNumericValue(instruccion[i]);
					pila.push(num);
					break;
			}
		}
	}
	
	public void suma(){
		resultado = pila.pop() + pila.pop();
		pila.push(resultado);
	}
	
	public void multiplicacion(){
		resultado = pila.pop() * pila.pop();
		pila.push(resultado);
	}
	
	public void division(){
		resultado = (1/pila.pop()) * pila.pop();
		pila.push(resultado);
	}
	
	public void resta(){
		resultado = -(pila.pop()) + pila.pop();
		pila.push(resultado);
	}
	
	public Stack<Integer> getPila() {
		return pila;
	}

	public void setPila(StackVector<Integer> pila) {
		this.pila = pila;
	}

	public int getResultado() {
		return resultado;
	}

	public void setResultado(int resultado) {
		this.resultado = resultado;
	}

	public File getTxt() {
		return txt;
	}

	public void setTxt(File txt) {
		this.txt = txt;
	}

	public char[] getInstruccion() {
		return instruccion;
	}

	public void setInstruccion(char[] instruccion) {
		this.instruccion = instruccion;
	}
}
