/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 23/03/23           *
 * Fecha Actualización:	23/03/23	  *
 * Descripción: Programa que lea el	  *
 * 	            radio de la           *
 * 				Circunferencia e      *
 *		        imprima la longitud y *
 *				el area				  *
 * ************************************/
package numeros;
import java.util.Scanner;
public class Ejercicio5 {



	public static void main(String[] args) {
		//Se declaran las variables a utilizar
		float Rad,Lg,Area,pi;
	    pi = (float) 3.1416;

		Scanner leer = new Scanner(System.in);
	    
		//El usuario ingresa ell radio de la circunferencia
		System.out.println("Dame el radio de la circunferencia");
	    Rad = leer.nextFloat();
	    
	    //Formulas a utilizar
	    Lg = (2*pi*Rad);
	    Area = (pi*Rad*Rad);
	    
	    //Se imprimen los resultados
	    System.out.print("El Area de la circunferencia es:");
	    System.out.print(Area);
	    System.out.println("");
	    System.out.print("La lingitud de la circunferencia es :");
	    System.out.print(Lg);
	    


	}

}
