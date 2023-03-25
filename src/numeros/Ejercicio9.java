/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 23/03/23           *
 * Fecha Actualización:	23/03/23	  *
 * Descripción: Programa que calcula  *
 * 	            el area del triàngulo *
 * 				con sus longitudes    *
 * ************************************/
package numeros;
import java.util.Scanner;
public class Ejercicio9 {
	
	public static void main(String[] args) {
		
		//Declaraciòn de variables
		float L1,L2,L3;
		float SPer,Area;
		Scanner leer = new Scanner(System.in);
		
		//El usuario introducirà las longitudes de un triàngulo
		System.out.print("Dame la longitud del lado1 del triàngulo");
		L1 = leer.nextFloat();
		System.out.print("Dame la longitud del lado2 del triàngulo");
		L2 = leer.nextFloat();
		System.out.print("Dame la longitud del lado3 del triàngulo");
		L3 = leer.nextFloat();
		
		//Formulas a utilizar para calcular el area
		SPer=(L1+L2+L3)/2;
		Area = (float) Math.sqrt(SPer * (SPer - L1) * (SPer - L2) * (SPer - L2));
		
		//Imprime el area del triàngulo
		System.out.print("El àrea del triàngulo usando sus longitudes es: ");
		System.out.print(Area);


	}

}
