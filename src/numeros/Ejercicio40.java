/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 24/03/23           *
 * Fecha Actualización:	24/03/23	  *
 * Descripción:Programa muestre los   *
 * 			   numeros del 100 al 1   *
 * 			   utilizando while       *
 **************************************/
package numeros;

import javax.swing.JOptionPane;

public class Ejercicio40 {

	public static void main(String[] args) {
		//Se inicializa la variable empezando en 100
		int i = 100;
		
		//Se almacenaràn los valores en la variable mesage
		String almacen = "";

		//Se utiliza el ciclo while para recorrer del numero 100 hasta que llegue a 1
		while (i >= 1) {
		almacen += i + " ";
		i--;
		}
		
		//Se mostrarà en un interfaz todos lo nùmeros del 100 al 1
		JOptionPane.showMessageDialog(null, almacen);
	}

}
