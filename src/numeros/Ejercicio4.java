/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 23/03/23           *
 * Fecha Actualización:	23/03/23	  *
 * Descripción: Programa que convierte*
 * 	            Centigrados a Farenhed*
 * ************************************/
package numeros;
import java.util.Scanner;

import javax.swing.JOptionPane;
public class Ejercicio4 {

	public static void main(String[] args) {
		//En la ventana se introducirà un mensaje para que ingrese la temperatura en Centigrados
		 String input = JOptionPane.showInputDialog("Ingresa una cantidad de grados centígrados:");
	     double celsius = Double.parseDouble(input);
	     
	     //Formula ecesaria para la conversiòn
	     double fahrenheit = 32 + (9 * celsius / 5);
	        
	      //En la ventana saldrà un mensaje donde saldrà la temperatura en Farenheid
	      String output = String.format("%.2f grados centígrados equivalen a %.2f grados Fahrenheit", celsius, fahrenheit);
	      JOptionPane.showMessageDialog(null, output);

	}

}
