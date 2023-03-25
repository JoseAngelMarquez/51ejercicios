/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 23/03/23           *
 * Fecha Actualización:	23/03/23	  *
 * Descripción: Programa que lee un   *
 * 				numero de 3 cifras	  *
 * 				y muestre sus digitos *
 * 				por separado	      *
 * ************************************/
package numeros;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio10 {

	public static void main(String[] args) {
		//Se declara la variable
		int num;
		
		//Se abre una interfaz donde solicita ingresar un numero de tres cifras
		String input = JOptionPane.showInputDialog("Ingresa un número de tres cifras:");
		num = Integer.parseInt(input);
		
		//Operaciones necesarias para obtener cada uno de los dìgitos
		int num1 = num / 100;
		int num2 = num % 100 / 10;
		int num3 = num % 10;
		
		//En una interfaz se imprimen los dìgitos por separado
		String output = String.format("Primer dígito: %d\nSegundo dígito: %d\nTercer dígito: %d", num1, num2, num3);
		JOptionPane.showMessageDialog(null, output);
	}

}
