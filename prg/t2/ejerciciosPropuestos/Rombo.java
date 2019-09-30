
/*
 * Dibuja un rombo
 *
 * @author Ignacio E. Loyola @nodonade.com
 * @version 0.1
 *
 */

import java.util.*;

public class Rombo {
	public static void main (String [] args) {
		Scanner kbd = new Scanner(System.in);

		System.out.printf("Deme la anchura del rombo: ");
		int anchura = kbd.nextInt();

		for (int i = 0; i < anchura; i++) {
			for(int j = anchura - i; j > 0; j--) {
				System.out.printf(" ");
			}
			for (int j = 2 * i -1; j > 0; j--) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
		for (int i = anchura - 1; i >= 0; i--) {
			for (int j = 0; j < anchura - i; j++) {
				System.out.printf(" ");
			}
			for (int j = 0; j < 2*i-1; j++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
	}
}
