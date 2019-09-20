
/*
 * Ejercicio 6 Secuencial
 *
 * @author Ignacio E. Loyola @nodonade.com
 * @version 0.1
 *
 */

import java.util.*;

public class Ejer6S {
	public static void main (String [] args) {
		Scanner kbd = new Scanner(System.in);

		System.out.printf("Dame los km/h: ");
		double v = kbd.nextDouble();

		System.out.printf("Los m/s son %f\n", v * 1000 / 3600);


	}
}
