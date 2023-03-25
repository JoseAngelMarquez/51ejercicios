/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 24/03/23           *
 * Fecha Actualización:	24/03/23	  *
 * Descripción:Programa que calcule el*
 * 			   mayor de tres numeros. *
 **************************************/
package numeros;

import java.util.Scanner;

public class Ejercicio33 {

	public static void main(String[] args) {
		//Se declaràn las variables desde el inicio
		int num1,num2,num3,mayor;
		Scanner leer = new Scanner(System.in);

        // Leer los tres números
        System.out.print("Introduzca el primer número: ");
        num1 = leer.nextInt();

        System.out.print("Introduzca el segundo número: ");
        num2 = leer.nextInt();

        System.out.print("Introduzca el tercer número: ");
        num3 = leer.nextInt();

        // Determinar el mayor
        mayor = num1;

        if (num2 > mayor) {
            mayor = num2;
        }

        if (num3 > mayor) {
            mayor = num3;
        }

        // Mostrar el mayor
        System.out.println("El mayor de los tres números es: " + mayor);

	}

}
