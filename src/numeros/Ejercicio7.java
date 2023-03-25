/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 23/03/23           *
 * Fecha Actualización:	23/03/23	  *
 * Descripción: Calculador de la      *
 * 	            hipotenusa de un      *
 * 				Triàngulo rectàngulo  *
 * ************************************/
package numeros;
import java.util.Scanner;
public class Ejercicio7 {

	public static void main(String[] args) {
		//Declaraciòn de variables
		float Cat1,Cat2,Hip;
	
		Scanner leer = new Scanner(System.in);
		
		//Se pide la longitud de los dos catetos del triàngulo
		System.out.print("Dame la longitud del primer cateto");
		Cat1 = leer.nextFloat();
		System.out.print("Dame la longitud del segundo cateto");
		Cat2 = leer.nextFloat();
		
		//Fòrmula para calcular la hipotenusa
		Hip =(float) Math.sqrt((Cat1*Cat1)+(Cat2*Cat2));
		
		//Imprime el resultado de la hipotenusa
		System.out.print("La hipotenusa del triàngulo Rectangulo es :");
		System.out.print(Hip);
	}

}
