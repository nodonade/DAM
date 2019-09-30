/*
 * Programa que dice si un numero es Omirp
 *
 * @author Ignacio E. Loyola @nodonade.com
 * @version 0.1
 *
 */

import java.util.*;

public class NumeroEsOmirp {
	public static void main (String [] args) {
		Scanner kbd = new Scanner(System.in);

		System.out.printf("Deme un numero: ");
		int n = kbd.nextInt();

		boolean isOmirp;
		isOmirp = esPrimo(n) && esPrimo(reverso(n));

		System.out.printf("El numero %d %s es Omirp\n", n, isOmirp ? "" : "no");
	}

	public static int reverso(int n) {
		int reverso = 0;

		while (n != 0) {
			reverso *= 10;
			reverso = reverso + n % 10;
			n /= 10;
		}

		return reverso;
	}
	public static boolean esPrimo(int n) {

		boolean esPrimo = true;
		int i = 2;
		while ( i < n && esPrimo) {
			if ( n % i == 0)
				esPrimo = false;
			i++;
		}
		return esPrimo;
	}
}
