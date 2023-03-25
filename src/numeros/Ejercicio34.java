/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 24/03/23           *
 * Fecha Actualización:	24/03/23	  *
 * Descripción:Programa que lea tres  *
 * 				números  H,M y S      *
 * 				y comprueba si la hora*
 * 				es vàlida.            *
 **************************************/
package numeros;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio34 {

	public static void main(String[] args) {
		//En la ventana se pedirà ingresar 3 datos
		//Se pedirà la hora
		String horaStr = JOptionPane.showInputDialog(null, "Introduzca la hora: ");
	    int hora = Integer.parseInt(horaStr);
	    //Se pediràn los minutos
	    String minutosStr = JOptionPane.showInputDialog(null, "Introduzca los minutos: ");
	    int minutos = Integer.parseInt(minutosStr);
	    //Se pediràn los segundos
	    String segundosStr = JOptionPane.showInputDialog(null, "Introduzca los segundos: ");
	    int segundos = Integer.parseInt(segundosStr);
	    
	    //Se imprime un mensaje de verificaciòn o de error
	    //Se ponen cirtas condiciones para saber y cada dado esta dentro del rango de la hora
	    if (hora >= 0 && hora <= 23 && minutos >= 0 && minutos <= 59 && segundos >= 0 && segundos <= 59) {
	        JOptionPane.showMessageDialog(null, "La hora introducida es válida.");
	    } else {
	        JOptionPane.showMessageDialog(null, "La hora introducida no es válida.");
	        }
	}

}
