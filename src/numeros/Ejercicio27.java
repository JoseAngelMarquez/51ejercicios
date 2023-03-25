/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 23/03/23           *
 * Fecha Actualización:	23/03/23	  *
 * Descripción:Programa que compare   *          *
 * 			   si dos letras son      *
 * 			   minusculas.            *
 **************************************/
package numeros;

import java.util.Scanner;

public class Ejercicio27 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		//El usuario introducirà dos carateres
        System.out.print("Ingrese el primer caracter: ");
        char caracter1 = leer.next().charAt(0);

        System.out.print("Ingrese el segundo caracter: ");
        char caracter2 = leer.next().charAt(0);
        
        //Con la funciòn islowercase se compararàn si ambos caracteres son minùsculas 
    	//Se imprimiràn los mensajes
        if (Character.isLowerCase(caracter1) && Character.isLowerCase(caracter2)) {
            System.out.println("Ambos caracteres son letras minúsculas");
        } else {
            System.out.println("Al menos uno de los caracteres no es una letra minúscula");
        }

	}

}
