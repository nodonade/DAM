
/*
 * Imprime en pantalla una piramide
 *
 * @author Ignacio E. Loyola @nodonade.com
 * @version 0.1
 *
 */

import java.util.*;

public class Piramide {
	public static void main (String [] args) {
		Scanner kbd = new Scanner(System.in);

		System.out.printf("Deme las filas de la piramide: ");
		int filas = kbd.nextInt();

		for (int i = 0; i < filas; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
	}
}
