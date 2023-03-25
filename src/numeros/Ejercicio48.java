/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 24/03/23           *
 * Fecha Actualización:	24/03/23	  *
 * Descripción:Programa que lea 	  *
 * 			   numeros e indique si es*
 * 			   par o impar, positivo o*
 * 			   negativo				  *
 **************************************/
package numeros;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio48 {

	public static void main(String[] args) {
		//Se declaràn las variables
		int num;

		Scanner leer = new Scanner(System.in);

		//Se usarà un ciclo para que el programa siga trabajando hasta que el usuario introduzca 0
		do {
			//En la interfaz, pedirà que el usuario introduzca un valor entero
			String input = JOptionPane.showInputDialog(null, "Ingrese un número o 0 para salir del programa:");
			num = Integer.parseInt(input);
			
			//Se susan ciertas condiciones para determinar si los numeros son positivos o negativos y pares o impares
			//La ventana mandarà ciertos mensajes si es que se cumples las condiciones
			if (num != 0) {
				if (num > 0) {
					if (num % 2 == 0) {
						JOptionPane.showMessageDialog(null, "El número ingresado es positivo y par.");
					} else {
						JOptionPane.showMessageDialog(null, "El número ingresado es positivo e impar.");
					}
				} else {
					if (num % 2 == 0) {
						JOptionPane.showMessageDialog(null, "El número ingresado es negativo y par.");
					} else {
						JOptionPane.showMessageDialog(null, "El número ingresado es negativo e impar.");
					}
				}
			}
		} while (num != 0);	}

}
