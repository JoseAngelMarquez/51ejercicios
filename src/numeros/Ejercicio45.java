/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 24/03/23           *
 * Fecha Actualización:	24/03/23	  *
 * Descripción:Programa que lea dos   *
 * 			   nùmeros y muestre desde*
 * 			   el menor hasta el mayor*
 **************************************/
package numeros;

import java.util.Scanner;

public class Ejercicio45 {

	
	public static void main(String[] args) {
		//Declaraciòn de variables
		int num1,num2,mayor,menor;
		Scanner leer = new Scanner(System.in);

		//Se introducirà el primer valor
        System.out.print("Ingrese el primer número: ");
        num1 = leer.nextInt();

		//Se introducirà el segundo valor
        System.out.print("Ingrese el segundo número: ");
        num2 = leer.nextInt();
        
        //Se haràn comparaciones para determinar cuàl es el mayor
        if (num1 < num2) {
            menor = num1;
            mayor = num2;
        } else {
            menor = num2;
            mayor = num1;
        }

        //Una vez determinado el numero mayor, se meteràn en un ciclo que va desde el menor hasta el mayor
        System.out.print("Los números desde el menor hasta el mayor son: ");
        for (int i = menor; i <= mayor; i++) {
        	
        	//Se imprimiràn los valores desde el menor hasta el mayor
            System.out.print(i + " ");
        }

	}

}
