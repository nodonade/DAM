
/*
 * Los numeros del 1 al 100 sin multiplos de 5
 *
 * @author Ignacio E. Loyola @nodonade.com
 * @version 0.1
 *
 */

import java.util.*;

public class NoMultiplos5 {
	public static void main (String [] args) {
		Scanner kbd = new Scanner(System.in);

		for (int i = 1; i <= 100; i++) {
			if ( i % 5 == 0)
				continue;
			System.out.println(i);
		}
	}
}
