/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 24/03/23           *
 * Fecha Actualización:	24/03/23	  *
 * Descripción:Programa que lea dos   *
 * 				números por teclado y *
 * 				muestre el resultado  *
 * 				de la división del    *
 * 				primero por el segundo*
 **************************************/
package numeros;

import java.util.Scanner;

public class Ejercicio31 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);

        // Leer los dos números
        System.out.print("Introduzca el primer número: ");
        float num1 = leer.nextFloat();

        System.out.print("Introduzca el segundo número: ");
        float num2 = leer.nextFloat();

        // Comprobar que el divisor no sea cero
        if (num2 == 0) {
            System.out.println("No se puede dividir entre cero.");
        } else {
            // Realizar la división y mostrar el resultado
            float resultado = num1 / num2;
            System.out.println("El resultado de la división es: " + resultado);
        }
	}

}
