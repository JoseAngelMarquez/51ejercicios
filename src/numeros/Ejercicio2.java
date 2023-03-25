/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 23/03/23           *
 * Fecha Actualización:	23/03/23	  *
 * Descripción: Programa que lea un	  *
 * 	            nombre y muestre      *
 * 				“Buenos dias          *
 *		        nombre_introducido”   *
 **************************************/
package numeros;
import java.util.Scanner;

import javax.swing.JOptionPane;
public class Ejercicio2 {

	public static void main(String[] args) {
		//Se declara la variable nombre
		String nombre;
		//Se crea una ventana donde pedirà introducir tu nombre
		 nombre = JOptionPane.showInputDialog("Introduce tu nombre");
		 
		 //Se introducirà cualquier nombre
		 Scanner leer = new Scanner(System.in);
		 
		 //En la ventana se imprimirà el mensaje de buenos dìas junto con el nombre
	     JOptionPane.showMessageDialog(null, "Buenos días " + nombre + "!");
	}

}
