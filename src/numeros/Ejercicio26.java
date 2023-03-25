/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 23/03/23           *
 * Fecha Actualización:	23/03/23	  *
 * Descripción:Programa que lee dos   *
 * 			   caracteres y compruebe *
 * 			   si son iguales		  *
 **************************************/
package numeros;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio26 {

	public static void main(String[] args) {
		//Mensaje mostrado en la ventana y el programa solicita un caracter
		 String input1 = JOptionPane.showInputDialog("Introduce el primer carácter:");
	        //El usuario deberà ingresar un caracter
		 	char caracter1 = input1.charAt(0);
	        
		 	//En la ventana pedirà ingresar otro caracter
	        String input2 = JOptionPane.showInputDialog("Introduce el segundo carácter:");
	        //El usuario deberà ingresar un segundo caracter
	        char caracter2 = input2.charAt(0);
	        
	        //Compara ambos caracteres y dependiendo de la condiciòn imprimirà un mensaje en la ventana
	        if(caracter1 == caracter2) {
	            JOptionPane.showMessageDialog(null, "Los caracteres introducidos son iguales.");
	        } else {
	            JOptionPane.showMessageDialog(null, "Los caracteres introducidos son diferentes.");
        }
	}

}
