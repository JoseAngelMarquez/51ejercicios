/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 23/03/23           *
 * Fecha Actualización:	23/03/23	  *
 * Descripción: Programa que lee un   *
 * 				numero de 5 cifras y  *
 * 				muestre sus cifras    *
 * 				desde el principio    *
 * ************************************/
package numeros;
import java.util.Scanner;
public class ejercicio11 {
	public static void main(String[] args) {
		//Se declaran variables
		int num;
		
		Scanner leer = new Scanner(System.in);
		
		//El usuario debera introducir un numero de 5 cifras
		System.out.print("Dame un nùmero entero de 5 cifras");
		num = leer.nextInt();
		
		//Se implementò un ciclo para que recorrà los 5 numeros e imprima cada cifra partiendo desde el principio
		 for (int i = 0; i < 5; i++) {
	            int cifra = num / (int) Math.pow(10, 4 - i);
	            System.out.println(cifra);
	            num = num % (int) Math.pow(10, 4 - i);
	        }
	}

}
