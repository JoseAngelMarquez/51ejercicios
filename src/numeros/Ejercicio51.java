/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 24/03/23           *
 * Fecha Actualización:	24/03/23	  *
 * Descripción:51. Contar los números *
 * 				   positivos          *
 * 				   introducidos por   *
 * 				   teclado            *
 **************************************/
package numeros;

import java.util.Scanner;

public class Ejercicio51 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        //Se delaclara la variable y se inicializa
		int contador = 0;
        
		//El usuario introducira cierta cantidad de numeros
        System.out.println("Ingrese una serie de números separados por espacios:");
        String numeros = leer.nextLine();
        
        Scanner scann = new Scanner(numeros);
        while (scann.hasNextInt()) {
            int num = scann.nextInt();
            if (num > 0) {
                contador++;
            }
        }
        
        //El programa  solo leera lo numeros que sean positivos
        System.out.println("Cantidad de números positivos introducidos: " + contador);

	}

}
