/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 23/03/23           *
 * Fecha Actualización:	23/03/23	  *
 * Descripción: Volumen de una esfera *
 * ************************************/
package numeros;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		//Se declaran las variables y la constante pi a utilizar en el programa
		float Rad, Vol, rad;
		final double pi = 3.14159;

		//Se abrira una pestaña donde pedirà que el usuario ingrese el radio de la esfera
		String input = JOptionPane.showInputDialog("Ingresa el radio de la esfera:");
		Rad = Float.parseFloat(input);
		
		//Asignaciones a utilizar para calcular el volumen
		rad = (float) Math.pow(Rad, 3);
		Vol = (float) ((4 * pi * rad / 3));
		
		//Se imprime el resultado del volumen de la esfera en una pestaña
		String output = String.format("El volumen de la esfera es: %f", Vol);
		JOptionPane.showMessageDialog(null, output);
	}

}
