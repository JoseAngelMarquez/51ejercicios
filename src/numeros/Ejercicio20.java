/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 23/03/23           *
 * Fecha Actualización:	23/03/23	  *
 * Descripción:Programa que lea dos	  *
 *  		   números y comprueba si *
 *             son iguales.           *
 **************************************/
package numeros;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio20 {

	public static void main(String[] args) {
		//Se crea una pestaña donde solicitarà introducir el primer digito
		String inputNum1 = JOptionPane.showInputDialog(null, "Ingrese el primer número:");
        int num1 = Integer.parseInt(inputNum1);

		//Se crea una pestaña donde solicitarà introducir el segundo digito
        String inputNum2 = JOptionPane.showInputDialog(null, "Ingrese el segundo número:");
        int num2 = Integer.parseInt(inputNum2);

        //Comparaciòn de los 2 numeros e imprime dependiendo de la condiciòn en la ventana
        if (num1 == num2) {
            JOptionPane.showMessageDialog(null, "Los números ingresados son iguales.");
        } else {
            JOptionPane.showMessageDialog(null, "Los números ingresados no son iguales.");
        }
	}

}
