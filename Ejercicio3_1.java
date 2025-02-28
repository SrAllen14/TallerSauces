/*Realiza la codificación en lenguaje Java de
	de un algoritmo que solicite por teclado
	la edad de una persona y si es mayor de
	edad muestre por pantalla el mensaje:"Eres
	mayor de edad."*/
	
/*Vamos a crear la variable edad para recibirla
	por teclado para despues, mediante un if, 
	introducir el mensaje según la condición*/
	
import java.util.Scanner;
public class Ejercicio3_1{
	public static void main(String[] args){
		int edad;
		System.out.print("Introduzca su edad: ");
		edad=leerEntero();
		
		if (edad >= 18){
			System.out.println("Eres mayor de edad");
		}

	}
	private static int leerEntero(){
		int entero;
		Scanner teclado=new Scanner(System.in);
		while(!teclado.hasNextInt()){
			teclado.nextLine();
		}
		entero=teclado.nextInt();
		teclado.close();
		return entero;
	}
}