/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 23/03/23           *
 * Fecha Actualización:	23/03/23	  *
 * Descripción:Programa que comprueba *          *
 * 			   si un numero es 		  *
 * 			   multiplo de 3 y 5      *
 **************************************/
package numeros;
// Dudas sobre este ejercicio
import java.util.Scanner;
public class Ejercicio23 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		//El usuario introducira un valor
        System.out.print("Introduce un número: ");
        int numero = leer.nextInt();
        
        //Se hacen las comparaciones para saber si el numero es multiplo de 3 y de 5
        if(numero % 3 == 0 && numero % 5 == 0) {
            System.out.println("El número es múltiplo de tres y de cinco");
        } else {
            System.out.println("El número no es múltiplo de tres y de cinco");
        }
	}
}
