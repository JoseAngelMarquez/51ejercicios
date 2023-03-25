/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 24/03/23           *
 * Fecha Actualización:	24/03/23	  *
 * Descripción:Programa muestre los   *
 * 			   numeros del 1 al 100   *
 * 			   utilizando do while    *
 **************************************/
package numeros;

import javax.swing.JOptionPane;

public class Ejercicio38 {

	public static void main(String[] args) {
		//Los numeros se almacenaràn en esta variable
		String numeros = "";
		
		//Se declarà la variable y se inicializa
		int i = 1;

		//El ciclo recorrarà del 1 hasta el 100 utilizando un ciclo do while
		do {
		    numeros += i + " ";
		    i++;
		} while (i <= 100);
		
		//Se imprimiràn los numeros del 1 al 100 en la ventana
		JOptionPane.showMessageDialog(null, numeros);
	}

}
