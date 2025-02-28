/*Realiza la codificación en lenguaje Java de 
	un algoritmo que solicite por teclado dos 
	números enteros y muestre por pantalla el 
	cociente y el resto de ambos números.*/

/*Vamos a crear los dos numeros enteros y 
	realizar la operación para mostrar por 
	pantalla los resultados.*/
import java.util.Scanner;
public class Ejercicio2_3{
	public static void main(String[] args){
		Scanner teclado=new Scanner (System.in);
		int dividendo, divisor;
		Syste.out.println("Introduzca dos numeros enteros positivos por teclado...");
		System.out.print("Primer numero (dividendo): ");
		dividendo=teclado.nextInt();
		System.out.print("Segundo numero(divisor): ");
		divisor=teclado.nextInt();
		System.out.println("El cociente entre "+dividendo+" y "+divisor+" es de: "+dividendo/divisor+" y el resto es: "+dividendo%divisor);
	}
}