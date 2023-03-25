/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 23/03/23           *
 * Fecha Actualización:	23/03/23	  *
 * Descripción: Numero par o impar    *
 * ************************************/
package numeros;
import java.util.Scanner;
public class Ejercicio17 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		//Numero introducido por el usuario
        System.out.print("Ingrese un número entero: ");
        int num = leer.nextInt();

        //Condiciones utilizadas para saber si es par o impar y se imprime texto dependiendo de la condiciòn
        if (num % 2 == 0) {
            System.out.println(num + " es un número par.");
        } else {
            System.out.println(num + " es un número impar.");
        }
	}

}
