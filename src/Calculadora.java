import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class Calculadora {
	private File txt;					//Archivo con instrucciones aritmeticas.
	private char[] instruccion;			//Array para almanacenar cada linea como una instruccion.
	private StackVector<Integer> pila;	//Implementacion con funcionalidad de pila.
	int resultado = 0;					//Utilizado para almacenar resultado de cada linea.
	
	//Metodo constructor. Recibe como parametro el nombre del archivo por leer. 
	public Calculadora(String nombre){
		//Valores iniciales para atributos.
		instruccion = new char[13];
		//Creacion de pila de enteros utilizando genericos.
		pila = new StackVector<Integer>();
		pila.push(resultado);
		//Creacion del archivo para lectura.
		try{
			txt = new File(nombre);
		}
		//Excepcion que se lanza cuando el archivo no existe.
		catch(NullPointerException e){
			JOptionPane.showMessageDialog(null, "No existe el archivo.", "ERROR", 
					JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		}
	    try{
	    	//Creacion de scanner especializado para el archivo.
	    	Scanner s = new Scanner(txt);
			//Lee todo el archivo; almacena en la matriz. 
	        while (s.hasNextLine()) {
	            instruccion = s.nextLine().toCharArray();
	        }
	        //Se cierra el Scanner para evitar "leaks".
	        s.close();
	    } 
	    //Excepcion que se lanza cuando hay un error en lectura.
	    catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Archivo no encontrado.", "ERROR", 
					JOptionPane.ERROR_MESSAGE);
			System.exit(0);
	    }
	}
	
	//Metodo para llevar a cabo instrucciones. Utiliza metodos de apoyo.
	public void operar(){
		//Evalua la linea obtenida del archivo texto. 
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
				//Para cada numero.
				default:
					pila.push(Character.getNumericValue(instruccion[i]));
					break;
			}
		}
	}
	
	//Metodos de apoyo para operaciones.
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
	
	//Metodos set y get para cada atributo.
	public StackVector<Integer> getPila() {
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
