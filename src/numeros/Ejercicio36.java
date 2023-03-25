/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 24/03/23           *
 * Fecha Actualización:	24/03/23	  *
 * Descripción:Programa que pasa de   *
 * 			   una variable entera    *
 * 			   a alfabètica.			  *
 **************************************/
package numeros;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio36 {

	public static void main(String[] args) {
		//En la ventana pedirà introducir una calificaciòn
		String input = JOptionPane.showInputDialog(null, "Introduce la calificación numérica (0-10):");
		
		//El usuario deberà introducir el nùmero
		int calificacion = Integer.parseInt(input);

		//Se hace la condiciòn de que el nùmero sea mayor que cero y menor a 10
		//En caso de no entrar en el rango la ventana mandarà un mensaje de que el numerò no està en el rango
		if (calificacion < 0 || calificacion > 10) {
		    JOptionPane.showMessageDialog(null, "La calificación debe estar entre 0 y 10.");
		} else {
			
			//En caso de si estar en el rango, la ventana imprimirà un mensaje que corresponde a una calificaciòn alfabètica
		    String califiAlfa;
		    if (calificacion >= 9) {
		        califiAlfa = "Sobresaliente";
		    } else if (calificacion >= 7) {
		        califiAlfa = "Notable";
		    } else if (calificacion >= 5) {
		        califiAlfa = "Aprobado";
		    } else {
		        califiAlfa = "Suspenso";
		    }
		    
		    //Impresiòn en la ventana de la calificaciòn de numero a alfabètica 
		    JOptionPane.showMessageDialog(null, "La calificación alfabética correspondiente es: " + califiAlfa);
	        }
	}

}
