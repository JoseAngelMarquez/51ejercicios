/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 24/03/23           *
 * Fecha Actualización:	24/03/23	  *
 * Descripción:Programa muestre los   *
 * 			   numeros desde N hasta 1*
 * 			   utilizando for, while y*
 * 			   do .. while            *
 **************************************/
package numeros;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio44 {

	public static void main(String[] args) {
		//Declaaciòn de variables
		int n;
		
		//Saldrà un mensaje en la interfaz donde el usuario deberà introducir un numero entero
		n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entero positivo: "));

		// Utilizando la instrucción for
		String resultadoFor = "Utilizando la instrucción for:\n";
		for (int i = n; i >= 1; i--) {
		resultadoFor += i + " ";
		}
		
		//La interfaz mostrarà los nùmeros
		JOptionPane.showMessageDialog(null, resultadoFor);

		// Utilizando la instrucción while
		String resultadoWhile = "Utilizando la instrucción while:\n";
		int i = n;
		while (i >= 1) {
		resultadoWhile += i + " ";
		i--;
		}
		
		//La interfaz mostrarà los nùmeros

		JOptionPane.showMessageDialog(null, resultadoWhile);

		// Utilizando la instrucción do..while
		String resultadoDoWhile = "Utilizando la instrucción do..while:\n";
		i = n;
		do {
		resultadoDoWhile += i + " ";
		i--;
		} while (i >= 1);
		
		//La interfaz mostrarà los nùmeros
		JOptionPane.showMessageDialog(null, resultadoDoWhile);
	}

}
