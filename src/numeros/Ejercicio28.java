/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 23/03/23           *
 * Fecha Actualización:	23/03/23	  *
 * Descripción:Programa que lea un 	  *
 * 			   caràcter y compruebe si*
 * 			   es un nùmero.		  *
 **************************************/
package numeros;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio28 {

	public static void main(String[] args) {
		  //Se desplegara una ventana que solicita introducir un caracter
		  String input = JOptionPane.showInputDialog("Introduzca un carácter:");
		    //Se lee el caracter
	        char caracter = input.charAt(0);
	        
	        //Se usa la condiciòn para saber si es un nùmero y salga un mensaje en la ventana dependiendo de la condiciòn
	        if (caracter >= '0' && caracter <= '9') {
	            JOptionPane.showMessageDialog(null, "El carácter introducido es un número.");
	        } else {
	            JOptionPane.showMessageDialog(null, "El carácter introducido no es un número.");
        }
	}

}
