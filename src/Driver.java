import java.util.Scanner;


public class Driver {

	public static void main(String[] args) {
		System.out.println("\n" + "Bienvenido al sistema de cambistas Laraman" + "\n");
		Scanner in = new Scanner(System.in);
		System.out.println("Ingrese un numero: \n");
		double entrada = in.nextDouble();
		in.close();
		//Creacion de calculadora con archivo provisto.
		String name = "postfix.txt";
		Calculadora calc = new Calculadora(name);
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

}
