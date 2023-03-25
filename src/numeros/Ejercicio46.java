/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 24/03/23           *
 * Fecha Actualización:	24/03/23	  *
 * Descripción:Programa muestre dos   *
 * 			   numeros e imprima los  *
 * 			   pares entre ellos.	  *
 **************************************/
package numeros;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio46 {

	public static void main(String[] args) {
        //Declaraciòn de variables
		int menor, mayor;
		
		//Saldrà una Ventana donde el usuario deberà introducir dos valores
        menor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número: "));
        mayor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número: "));
        
        //Se busca cuàl de los numeros es el mayor
        if (menor > mayor) {
            int aux = menor;
            menor = mayor;
            mayor = aux;
        }
        
        
        String numerosPares = "Los números pares entre " + menor + " y " + mayor + " son: ";
        for (int i = menor; i <= mayor; i++) {
            if (i % 2 == 0) {
                numerosPares += i + " ";
            }
        }
        //Imprimirà los nùmeros pares entre los dos nùmeros y mostrarà en una ventana
        JOptionPane.showMessageDialog(null, numerosPares);

	}

}
