/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 24/03/23           *
 * Fecha Actualización:	24/03/23	  *
 * Descripción:Programa muestre los   *
 * 			   multiplos de un numero *
 * 			   desde 1 hasta M.       *
 **************************************/
package numeros;

import java.util.Scanner;

public class Ejercicio47 {

	public static void main(String[] args) {
		//Declaraciòn de variables
		int  m,num;
		   Scanner leer = new Scanner(System.in);
		   
		   //El usuario ingresarà dos valores uno inicial y uno que sea el tope
	        System.out.print("Ingrese el número inicial: ");
	        num = leer.nextInt();

	        System.out.print("Ingrese el límite M: ");
	        m = leer.nextInt();
	        
	        //Se usarà un ciclo para que imprima los multiplos entre los numeros dados
	        System.out.print("Los múltiplos de " + num + " hasta " + m + " son: ");
	        for (int i = 1; i <= m; i++) {
	            if (i % num == 0) {
	            	//Se imprimiràn los valores
	                System.out.print(i + " ");
	            }
	        }
	}

}
