/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 23/03/23           *
 * Fecha Actualización:	23/03/23	  *
 * Descripción: Precio de un producto *
 * ************************************/
package numeros;
import java.util.Scanner;

import javax.swing.JOptionPane;
public class Ejercicio14 {

	public static void main(String[] args) {
		
		//En la ventana muestra el mensaje de lo que el usuario desea
		String PrecioCosto = JOptionPane.showInputDialog(null, "Ingrese el precio de costo del producto:");
        float precioCosto = Float.parseFloat(PrecioCosto);
        
        //Se ingresa el porcentaje de la ganancia que se quiere obtener del producto
        String PorcentajeGanancia = JOptionPane.showInputDialog(null, "Ingrese el porcentaje de ganancia del producto (%):");
        float porcentajeGanancia = Float.parseFloat(PorcentajeGanancia);

        //Se obtiene el precio de venta con los datos anteriores
        float precioVenta = precioCosto * (1 + porcentajeGanancia/100);
        
        //Imprime en la ventana el resultado del precio de venta del producto
        JOptionPane.showMessageDialog(null, "El precio final de venta del producto es: $" + precioVenta);

	}

}
