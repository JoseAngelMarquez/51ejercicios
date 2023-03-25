/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 24/03/23           *
 * Fecha Actualización:	24/03/23	  *
 * Descripción:Programa que lea dos   *
 * 				números por teclado y *
 * 				muestre el resultado  *
 * 				de la división del    *
 * 				mayor entre el menor  *
 **************************************/
package numeros;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio32 {

	public static void main(String[] args) {
		
		//En la ventana pedirà que el usuario introduzca 2 numeros
		String input1 = JOptionPane.showInputDialog("Introduzca el primer número:");
        float num1 = Float.parseFloat(input1);

        String input2 = JOptionPane.showInputDialog("Introduzca el segundo número:");
        float num2 = Float.parseFloat(input2);

        // Determinar el mayor y el menor
        float mayor = Math.max(num1, num2);
        float menor = Math.min(num1, num2);

        // Comprobar que el divisor no sea cero y en caso de que ingrese cero la ventana enviarà un mensaje
        if (menor == 0) {
            JOptionPane.showMessageDialog(null, "No se puede dividir entre cero.");
        } else {
            // Realizar la división y mostrar el resultado en la ventana
            float resultado = mayor / menor;
            JOptionPane.showMessageDialog(null, "El resultado de la división del mayor entre el menor es: " + resultado);
        }

	}

}
