/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 23/03/23           *
 * Fecha Actualización:	23/03/23	  *
 * Descripción:Programa que comprueba *          *
 * 			   si un numero es 		  *
 * 				multiplo de 2 o de 3  *
 **************************************/
package numeros;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio24 {

	public static void main(String[] args) {
		//Texto en ventana
		String input = JOptionPane.showInputDialog("Introduce un número:");
		//Ingresar datos
        int numero = Integer.parseInt(input);
        
        //Se hace la comparaciòn con dos condiciones para determinar si el nùmero es multiplo de dos o de tres
        //Se imprime en la ventana el mensaje
        if(numero % 2 == 0 || numero % 3 == 0) {
            JOptionPane.showMessageDialog(null, "El número es múltiplo de dos o de tres");
        } else {
            JOptionPane.showMessageDialog(null, "El número no es múltiplo de dos o de tres");

	        }
	}

}
