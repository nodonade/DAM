
/*
 * Muestra las tablas de multiplicar hasta el numero que nos den
 *
 * @author Ignacio E. Loyola @nodonade.com
 * @version 0.1
 *
 */

import java.util.*;

public class Tablas {
	public static void main (String [] args) {
		Scanner kbd = new Scanner(System.in);

		System.out.printf("Deme un numero: ");
		int n = kbd.nextInt();

		for ( int i = 1; i <= n; i++ ) {
			System.out.printf("\nTabla del %d \n*************\n", i);
			for ( int j = 1; j <= 10; j++ ) {
				System.out.printf("%d x %d = %d\n", i, j, i * j);
			}
		}
	}
}
