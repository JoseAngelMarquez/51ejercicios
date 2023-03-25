/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 23/03/23           *
 * Fecha Actualización:	23/03/23	  *
 * Descripción:Programa que comprueba *          *
 * 			   si un numero de tres   *
 * 			   cifras es capicùa      *
 **************************************/
package numeros;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio30 {

	public static void main(String[] args) {
		//En una Ventana pide al usuario ingresar valores
		 String input = JOptionPane.showInputDialog("Introduzca un número de tres cifras:");
	        int numero = Integer.parseInt(input);

	        // Obtener las cifras del número
	        int cifra1 = numero / 100;
	        int cifra2 = (numero / 10) % 10;
	        int cifra3 = numero % 10;

	        // Verificar si el número es capicúa e imprime en la ventana el mensaje correspondiente
	        if (cifra1 == cifra3) {
	            JOptionPane.showMessageDialog(null, numero + " es un número capicúa.");
	        } else {
	            JOptionPane.showMessageDialog(null, numero + " no es un número capicúa.");
       }
	}

}
