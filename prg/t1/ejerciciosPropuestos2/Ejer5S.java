
/*
 * Ejercicio 5 Secuencial
 *
 * @author Ignacio E. Loyola @nodonade.com
 * @version 0.1
 *
 */

import java.util.*;

public class Ejer5S {
	public static void main (String [] args) {
		Scanner kbd = new Scanner(System.in);

		System.out.printf("Dame el radio: ");
		double r = kbd.nextDouble();

		System.out.printf("La longitud de la circunferencia es %.4f y el area es %.4f\n", r * 2 * Math.PI, Math.PI * r * r);
	}
}
