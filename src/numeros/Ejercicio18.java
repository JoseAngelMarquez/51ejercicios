/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 23/03/23           *
 * Fecha Actualización:	23/03/23	  *
 * Descripción: Numero Positivo o     *
 * 				negativo		      *
 * ************************************/
package numeros;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio18 {

	public static void main(String[] args) {
		//Mensaje introdicio en la ventana principalcentajes
		 String inputNum = JOptionPane.showInputDialog(null, "Ingrese un número entero:centajes");
		 //El usuario introducirà el valor
	        int num = Integer.parseInt(inputNum);
	        
	        //Condiciones que se utilizan para saber si es par o no
	        //Al mismo tiempo se mostrarà en la ventana cada uno de los mensajes
	        if (num > 0) {
	            JOptionPane.showMessageDialog(null, num + " es un número positivo.");
	        } else if (num < 0) {
	            JOptionPane.showMessageDialog(null, num + " es un número negativo.");
	        } else {
	            JOptionPane.showMessageDialog(null, "El número es cero.");
	        }
	}

}
