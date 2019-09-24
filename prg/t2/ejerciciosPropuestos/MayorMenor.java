
/*
 * Realiza un programa con tres variables de tipo entero a, b y c.
 * El programa debera mostrar por pantalla el valor menor y mayor
 *
 * @author Ignacio E. Loyola @nodonade.com
 * @version 0.1
 *
 */

import java.util.*;

public class MayorMenor {
	public static void main (String [] args) {

		int a = 1, b = 2, c = 3, mayor, menor;

		if ( a >= b && a >= c) {
			mayor = a;
			if ( b <= c ) {
				menor = b;
			}
			else {
				menor = c;
			}
		}
		else if ( b >= a && b >= c) {
			mayor = b;
			if ( a <= c ) {
				menor = a;
			}
			else {
				menor = c;
			}
		}
		else {
			mayor = c;
			if ( a <= b) {
				menor = a;
			}
			else {
				menor = b;
			}
		}

		System.out.printf("De los numeros %d, %d, %d, %d es el mayor y %d es el menor\n", a, b, c, mayor, menor);
	}
}
