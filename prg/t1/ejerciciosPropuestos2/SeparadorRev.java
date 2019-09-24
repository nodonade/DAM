
/*
 * Programa que lee un numero y muestra sus cifras por separado en reverso
 *
 * @author Ignacio E. Loyola @nodonade.com
 * @version 0.1
 *
 */

import java.util.*;

public class SeparadorRev {
	public static void main (String [] args) {
		Scanner kbd = new Scanner(System.in);

		System.out.printf("Deme un numero para separarlo: ");
		int n = kbd.nextInt();

		while (n != 0) {
			System.out.printf("%d\n", n % 10);

			n /= 10;
		}
	}
}
