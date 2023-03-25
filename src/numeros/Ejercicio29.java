/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 23/03/23           *
 * Fecha Actualización:	23/03/23	  *
 * Descripción:Programa que calcula si*
 * 			   un año es bisiesto     *
 **************************************/
package numeros;

import java.util.Scanner;

public class Ejercicio29 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		//Pide al usuario que introduzca un año
        System.out.print("Introduzca un año: ");
        int anio = leer.nextInt();
        
        //Impresiòn (es o no es bisiesto)
        //Condiciòn necesaria para saber si un año es bisiesto
        if (anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0)) {
            System.out.println(anio + " es un año bisiesto.");
        } else {
            System.out.println(anio + " no es un año bisiesto.");
        }
	}

}
