/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 23/03/23           *
 * Fecha Actualización:	23/03/23	  *
 * Descripción:Programa que comprueba *
 *  		   si dos numeros terminan*
 *  		   con la misma cifra     *
 **************************************/
package numeros;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio22 {

	public static void main(String[] args) {
		 //Se abrirà una pestaña donde pedirà al usuario ingrsar un nùmero
		 String inputNum1 = JOptionPane.showInputDialog(null, "Ingrese el primer número:");
	        int num1 = Integer.parseInt(inputNum1);
		 //Se abrirà una pestaña donde pedirà al usuario ingrsar un segundo nùmero

	        String inputNum2 = JOptionPane.showInputDialog(null, "Ingrese el segundo número:");
	        int num2 = Integer.parseInt(inputNum2);
	        
	        //Operaciones comprobar si los numeros tienen la misma cifra
	        int cifra1 = num1 % 10;
	        int cifra2 = num2 % 10;

	        //Se hace una comparaciòn entre los ùltimos dìgitos de ambos nùmeros e imprimirà los mensajes en ventana
	        if (cifra1 == cifra2) {
	            JOptionPane.showMessageDialog(null, "Los números terminan con la misma cifra.");
	        } else {
	            JOptionPane.showMessageDialog(null, "Los números no terminan con la misma cifra.");
	        }
	}

}
