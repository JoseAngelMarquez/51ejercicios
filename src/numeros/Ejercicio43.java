/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 24/03/23           *
 * Fecha Actualización:	24/03/23	  *
 * Descripción:Programa muestre los   *
 * 			   numeros del 1 hasta N  *
 * 			   utilizando for, while y*
 * 			   do .. while            *
 **************************************/

package numeros;

import java.util.Scanner;

public class Ejercicio43 {

	public static void main(String[] args) {
		//Declaraciòn de variables
		int n;
		
		Scanner leer = new Scanner(System.in);
		
		//Se pedirà al usuario que ingrese un nùmero para que sea el tope donde imprimirà los valores
        System.out.print("Ingrese un número entero positivo: ");
        n = leer.nextInt();
        
        //Se utilizaràn los diferentes ciclos para que imprima los valores desde 1 hasta n 
        
        // Utilizando la instrucción for
        System.out.println("Utilizando la instrucción for:");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        // Utilizando la instrucción while
        System.out.println("Utilizando la instrucción while:");
        int i = 1;
        while (i <= n) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        
        // Utilizando la instrucción do while
        System.out.println("Utilizando la instrucción do..while:");
        i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= n);
        System.out.println();
	}

}
