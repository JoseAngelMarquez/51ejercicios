/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 23/03/23           *
 * Fecha Actualización:	23/03/23	  *
 * Descripción:Programa que lea dos	  *
 *  		   números enteros por    *
 *             teclado y que los 	  *
 *             muestre en pantalla    *
 **************************************/
package numeros;
import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		//Declaraciòn de variables
		int Num1, Num2;
		
		Scanner leer = new Scanner(System.in);
		//El usuario introduce el primer nùmero
		System.out.println("Dame el primer nùmero");
		Num1=leer.nextInt();
		
		//El usuario introduce el segundo nùmero
		System.out.println("Dame el Segundo nùmero");
		Num2=leer.nextInt();
		
		//Se imprime el primer nùmero en consola
		System.out.print("El primer nùmero es :");
		System.out.print(Num1);
		System.out.print("\n");
				
		//Se imprime el segundo nùmero
		System.out.print("El segundo nùmero es :");
		System.out.print(Num2);
		
	}

}
