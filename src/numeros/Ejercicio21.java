/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 23/03/23           *
 * Fecha Actualización:	23/03/23	  *
 * Descripción:Programa que lea dos	  *
 *  		   números y calcule el   *
 *  		   mayor.				  *
 **************************************/
package numeros;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);

		//El usuario introducirà dos numeros
        System.out.print("Ingrese el primer número: ");
        int num1 = leer.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = leer.nextInt();

        //Compara los numeros e imprimer el mayor de esos dos numeros o imprimer igual si amnos numeros son iguales
        if (num1 > num2) {
            System.out.println("El número mayor es: " + num1);
        } else if (num2 > num1) {
            System.out.println("El número mayor es: " + num2);
        } else {
            System.out.println("Los números son iguales.");
        }
	}

}
