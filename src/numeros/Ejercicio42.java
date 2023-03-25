/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 24/03/23           *
 * Fecha Actualización:	24/03/23	  *
 * Descripción:Programa muestre los   *
 * 			   numeros del 100 al 1   *
 * 			   utilizando for         *
 **************************************/

package numeros;

import javax.swing.JOptionPane;

public class Ejercicio42 {

	public static void main(String[] args) {
		//Los nùmeros se almacenaràn en la variable numeros
		String numeros = "";
		
		//Se utilizarà el ciclo for para recorrer valores del 100 al 1
		for (int i = 100; i >= 1; i--) {
		    numeros += i + "\n";
		}
		
		//Se imprimiràn los nùmero y se mostraràn en una pequeña interfaz
		JOptionPane.showMessageDialog(null, numeros);
	}
}
