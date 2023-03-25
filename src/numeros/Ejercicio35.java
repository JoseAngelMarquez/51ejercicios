/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 24/03/23           *
 * Fecha Actualización:	24/03/23	  *
 * Descripción:Programa que lea una   *
 * 			   variable entera mes 	  *
 * 			   y compruebe si el valor*
 * 			   corresponde a un       *
 *			   mes de 30, 31 o 28 días*
 **************************************/
package numeros;

import java.util.Scanner;

public class Ejercicio35 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        int mes, dias = 0;
        String nombreMes = "";
        
        //El usuario deberà introducir el nùmero del mes
        System.out.print("Introduce el número del mes (1-12): ");
        mes = leer.nextInt();
        
        //Se tiene como condiciòn que el nùmero este entre el 1 y el 12
        if (mes >= 1 && mes <= 12) {
        	
        	//Si està dentro del rango imprimirà el mes y cuàntos dìas tiene el mes
            nombreMes = (mes == 1) ? "enero" : (mes == 2) ? "febrero" : (mes == 3) ? "marzo" : (mes == 4) ? "abril"
                    : (mes == 5) ? "mayo" : (mes == 6) ? "junio" : (mes == 7) ? "julio" : (mes == 8) ? "agosto"
                    : (mes == 9) ? "septiembre" : (mes == 10) ? "octubre" : (mes == 11) ? "noviembre" : "diciembre";

            if (mes == 2) {
                dias = 28;
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                dias = 30;
            } else {
                dias = 31;
            }
            
            //Se imprimirà el mes y cuàntos dìas tiene el mes
            System.out.println(nombreMes + " tiene " + dias + " días.");
        } else {
            System.out.println("El número del mes debe estar entre 1 y 12.");
        }

	}

}
