/*Realiza la codificación en lenguaje de Java de
	un algoritmo que solicite por teclado número
	enteros hasta que introduzca uno que no este 
	comprendido entre el 1 y el 10, calcule la 
	media de los números introducidos y la muestre
	por pantalla.*/
	
/*Vamos a crear tres variables: una para los numeros
	solicitados, otra para acumular los numeros 
	introducidos por teclado y otra para el contador
	que nos servira para calcular la media.*/
	
import java.util.Scanner;
public class Ejercicio3_4_4{
	public static void main(String[] args){
		int num=1, cont=0; 
		float media=0;
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduzca numeros enteros: ");
		while (num>=1 && num<=10){
			num=teclado.nextInt();
			if (num>=1 && num<=10){
				cont+=1;
				media=media+num;
			}
		}
		System.out.println("La media de los numeros es: "+(media/cont));
	}
}