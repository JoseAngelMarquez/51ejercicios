/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 23/03/23           *
 * Fecha Actualización:	23/03/23	  *
 * Descripción: Programa que quite    *
 * 	            una variable N una    *
 *  			cantidad de cifras    *
 * ************************************/
package numeros;
import java.util.Scanner;
public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		//El usuario introducirà los valores
        System.out.print("Ingrese un número entero positivo: ");
        int N = leer.nextInt();

        //El usuario introducirà la cantidad de cifras que desea quitar al numero
        System.out.print("Ingrese la cantidad de cifras a quitar: ");
        int m = leer.nextInt();

        int resultado = (int) (N / Math.pow(10, m));
        
        //Se imprimirà el nùmero pero con menos elementos, depende cuantos el usuario elimino
        System.out.println("El resultado es: " + resultado);
	}

}
