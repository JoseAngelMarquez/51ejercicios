/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 23/03/23           *
 * Fecha Actualización:	23/03/23	  *
 * Descripción: Programa que lea un	  *
 * 	            entero y muestre el   *
 * 				doble y el triple     *
 * ************************************/

package numeros;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
	//Se declara la variable
    int Num;
   
    Scanner leer = new Scanner(System.in);
    
    //Se lee el numero introducido por el usuario
    System.out.println("Dame un numero");
    Num = leer.nextInt();
    
    //Se imprime el doble del nùmero
    System.out.print("El doble del nùmero es :");
    System.out.print(Num*2);
    System.out.println("");

    //Se imprime el triple
    System.out.print("El triple del nùmero es :");
    System.out.print(Num*3);
	}

}
