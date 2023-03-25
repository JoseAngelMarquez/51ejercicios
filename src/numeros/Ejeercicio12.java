/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 23/03/23           *
 * Fecha Actualización:	23/03/23	  *
 * Descripción: Programa que lea un   *
 * 	            numero entero de 5    *
 * 				dìgitos y muestre     *
 * 				sus cifras desde el   *
 * 				final    		      *
 * ************************************/
package numeros;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejeercicio12 {

	public static void main(String[] args) {
		
		//Texto mostrado en la interfaz donde pedirà que el usuario introduzca los valores
		String input = JOptionPane.showInputDialog("Ingrese un número entero de 5 cifras:");
		int numero = Integer.parseInt(input);

		//La ventana mandarà un mensaje imprimiendo cada uno de los dìgitos empezando desde el final
		String output = "Las cifras del número ingresado son: ";
		for (int i = 1; i <= 5; i++) {
		int cifra = numero % 10;
		output += cifra + " ";
		numero /= 10;
		}

		JOptionPane.showMessageDialog(null, output);
        }

	}

