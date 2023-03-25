/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 23/03/23           *
 * Fecha Actualización:	23/03/23	  *
 * Descripción: Muestra si un nùmero  *
 * 				es multiplo de 10	  *
 * ************************************/
package numeros;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		   Scanner leer = new Scanner(System.in);
		   
		   //Se solicita el numero 
	        System.out.print("Ingrese un número entero: ");
	        int num = leer.nextInt();
	        
	        //Condiciòn para saber si es multiplo de 10
	        //Dependiendo de la condiciòn imprime el numero y el mensaje
	        if (num % 10 == 0) {
	            System.out.println(num + " es múltiplo de 10.");
	        } else {
	            System.out.println(num + " no es múltiplo de 10.");
	        }
	}

}
