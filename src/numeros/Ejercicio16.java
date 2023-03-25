/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 23/03/23           *
 * Fecha Actualización:	23/03/23	  *
 * Descripción: Convertidor de 		  *
 * 	            centìgrados a Kelvin  *
 * 				grados Reamur		  *
 * ************************************/
package numeros;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio16 {

	public static void main(String[] args) {
			
			//Mensaje mostrado en la ventana
	        String inputGradosC = JOptionPane.showInputDialog(null, "Ingrese la temperatura en grados centígrados:");
	        double gradosC = Double.parseDouble(inputGradosC);

	        double gradosK = gradosC + 273.15;  // Conversión de grados centígrados a grados Kelvin
	        double gradosR = gradosC * 0.8;  // Conversión de grados centígrados a grados Reamur
	        
	        //Mensaje mostrado en ventana con los grados convertidos 
	        String mensaje = "La temperatura en grados Kelvin es: " + gradosK + "\n";
	        mensaje += "La temperatura en grados Reamur es: " + gradosR;

	        JOptionPane.showMessageDialog(null, mensaje);
	}
}
