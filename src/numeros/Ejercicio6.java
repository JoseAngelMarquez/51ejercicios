/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 23/03/23           *
 * Fecha Actualización:	23/03/23	  *
 * Descripción: Convertidor de Kmh a  *
 * 	            m/s				      *
 * ************************************/
package numeros;
import java.util.Scanner;

import javax.swing.JOptionPane;
public class Ejercicio6 {

	public static void main(String[] args) {
		//Declaraciòn de variables
		float Kmh, ms, Cons=(float) 3.6;
		
		//Se abra una ventana donde pedirà ingrsar la velocidad en Kilometros por hora
		String input = JOptionPane.showInputDialog("Ingresa la velocidad en kilómetros por hora:");
		Kmh = Float.parseFloat(input);
		
		//Fòrmula para la conversiòn
		ms = Kmh / Cons;
		
		//Se imprime en ventana el equivalente en metro por segundo
		String output = String.format("La conversión de %.2f km/h a metros por segundo es: %.2f m/s", Kmh, ms);
		JOptionPane.showMessageDialog(null, output);


	}

}
