/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 23/03/23           *
 * Fecha Actualización:	23/03/23	  *
 * Descripción:Programa que comprueba *          *
 * 			   si una letra es 		  *
 * 			   mayùscula.             *
 **************************************/
package numeros;

import java.util.Scanner;

public class Ejercicio25 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		//El usuario deberà introducir un caràcter
        System.out.print("Introduce un carácter: ");
        char caracter = leer.next().charAt(0);
        
        //Compara el caracter que insertamos con las letras de la A a la Z mayùsculas
        //Va a imprimir dependiendo de la condiciòn
        if(caracter >= 'A' && caracter <= 'Z') {
            System.out.println("El carácter introducido es una letra mayúscula.");
        } else {
            System.out.println("El carácter introducido no es una letra mayúscula.");
        }
	}

}
