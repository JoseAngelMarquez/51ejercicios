/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 24/03/23           *
 * Fecha Actualización:	24/03/23	  *
 * Descripción:Programa muestre los   *
 * 			   numeros del 100 al 1   *
 * 			   utilizando do while    *
 **************************************/
package numeros;

public class Ejercicio41 {

	public static void main(String[] args) {
		 //Se inicializa la variable
		 int i = 100;
		 
		 	//Se hace uso del ciclo do while
	        do {
	        	//Imprimirà los valores del 100 al 1 mientras se cumpla la condiciòn
	            System.out.println(i);
	            i--;
	        } while (i >= 1);
	}

}
