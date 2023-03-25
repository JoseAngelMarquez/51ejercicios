/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 23/03/23           *
 * Fecha Actualización:	23/03/23	  *
 * Descripción: Numero de la suerte   *
 * 				dada la decha de      *
 * 				nacimiento		      *
 * ************************************/
package numeros;
import java.util.Scanner;
public class Ejercicio13 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su fecha de nacimiento (en formato DDMMYYYY): ");
        String fecha = sc.next();
        
        //El ciclo calculara un nùmero sumando el dìa, el mes y el año, creando un nùmero
        int suma = 0;
        for (int i = 0; i < fecha.length(); i++) {
            suma += Character.getNumericValue(fecha.charAt(i));
        }
        
        //Impresiòn de nùmero de la suerte
        System.out.println("Tu número de la suerte es: " + (suma % 10));
    }
	

}
