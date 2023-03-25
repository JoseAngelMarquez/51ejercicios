/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 24/03/23           *
 * Fecha Actualización:	24/03/23	  *
 * Descripción:Programa que convierte *
 * 			   millas a kilometros    *
 **************************************/
package numeros;

import java.util.Scanner;

public class Ejercicio49 {

	public static void main(String[] args) {
		//Declaraciòn de variables
		double millas,kilometros;
		Scanner leer = new Scanner(System.in);
        
		//Pide ingresar el numero en millas
        System.out.print("Ingresa la cantidad de millas: ");
        millas = leer.nextDouble();
        
        //Operaciòn para la conversiòn
        kilometros = millas * 1.60934;
        
        //Imprime la conversiòn
        System.out.println(millas + " millas son equivalentes a " + kilometros + " kilómetros.");
        
	}

}
