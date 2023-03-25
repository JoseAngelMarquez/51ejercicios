/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 24/03/23           *
 * Fecha Actualización:	24/03/23	  *
 * Descripción:Programa que cuenta los*
 * 			   numeros introducidos   *
 * 			   por el teclado         *
 **************************************/
package numeros;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio50 {

	public static void main(String[] args) {
	    //Declaraciòn de varibles y se inicializa
		int contador = 0;
		
		//En la ventana se pide que el usuario introduzca varios valores separados por comas
		String numeros = JOptionPane.showInputDialog(null, "Ingrese una serie de números separados por comas: ");

		String[] numerosArray = numeros.split(",");

		for (String num : numerosArray) {
		    int n = Integer.parseInt(num.trim()); // trim() elimina los espacios en blanco alrededor del número
		        contador++;
		    
		}
		//Imprime la cantidad de numeros introducidos en una ventana
		JOptionPane.showMessageDialog(null, "Cantidad de números introducidos: " + contador);
	}

}
